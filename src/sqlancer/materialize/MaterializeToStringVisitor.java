package sqlancer.materialize;

import sqlancer.Randomly;
import sqlancer.common.ast.JoinBase;
import sqlancer.common.schema.AbstractCompoundDataType;
import sqlancer.common.visitor.BinaryOperation;
import sqlancer.common.visitor.ToStringVisitor;
import sqlancer.materialize.MaterializeSchema.MaterializeDataType;
import sqlancer.materialize.ast.MaterializeAggregate;
import sqlancer.materialize.ast.MaterializeBetweenOperation;
import sqlancer.materialize.ast.MaterializeBinaryLogicalOperation;
import sqlancer.materialize.ast.MaterializeCastOperation;
import sqlancer.materialize.ast.MaterializeColumnValue;
import sqlancer.materialize.ast.MaterializeConstant;
import sqlancer.materialize.ast.MaterializeExpression;
import sqlancer.materialize.ast.MaterializeFunction;
import sqlancer.materialize.ast.MaterializeInOperation;
import sqlancer.materialize.ast.MaterializeLikeOperation;
import sqlancer.materialize.ast.MaterializeOrderByTerm;
import sqlancer.materialize.ast.MaterializePOSIXRegularExpression;
import sqlancer.materialize.ast.MaterializePostfixOperation;
import sqlancer.materialize.ast.MaterializePostfixText;
import sqlancer.materialize.ast.MaterializePrefixOperation;
import sqlancer.materialize.ast.MaterializeSelect;
import sqlancer.materialize.ast.MaterializeSelect.MaterializeFromTable;
import sqlancer.materialize.ast.MaterializeSelect.MaterializeSubquery;
import sqlancer.materialize.ast.MaterializeSimilarTo;

public final class MaterializeToStringVisitor extends ToStringVisitor<MaterializeExpression>
        implements MaterializeVisitor {

    @Override
    protected boolean hasDistinctOnSupport() {
        return true;
    }

    @Override
    public void visitSpecific(MaterializeExpression expr) {
        MaterializeVisitor.super.visit(expr);
    }

    @Override
    public void visit(MaterializeConstant constant) {
        sb.append(constant.getTextRepresentation());
    }

    @Override
    public String get() {
        return sb.toString();
    }

    @Override
    public void visit(MaterializePostfixOperation op) {
        sb.append("(");
        visit(op.getExpression());
        sb.append(")");
        sb.append(" ");
        sb.append(op.getOperatorTextRepresentation());
    }

    @Override
    public void visit(MaterializeColumnValue c) {
        sb.append(c.getColumn().getFullQualifiedName());
    }

    @Override
    public void visit(MaterializePrefixOperation op) {
        sb.append(op.getTextRepresentation());
        sb.append(" (");
        visit(op.getExpression());
        sb.append(")");
    }

    @Override
    public void visit(MaterializeFromTable from) {
        sb.append(from.getTable().getName());
    }

    @Override
    public void visit(MaterializeSubquery subquery) {
        sb.append("(");
        visit(subquery.getSelect());
        sb.append(") AS ");
        sb.append(subquery.getName());
    }

    @Override
    public void visit(MaterializeSelect s) {
        visitSelect(s);
    }

    @Override
    protected MaterializeExpression getJoinOnClause(JoinBase<MaterializeExpression> join) {
        return join.getOnClause();
    }

    @Override
    protected MaterializeExpression getJoinTableReference(JoinBase<MaterializeExpression> join) {
        return join.getTableReference();
    }

    @Override
    public void visit(MaterializeOrderByTerm op) {
        visit(op.getExpr());
        sb.append(" ");
        sb.append(op.getOrder());
    }

    @Override
    public void visit(MaterializeFunction f) {
        sb.append(f.getFunctionName());
        sb.append("(");
        int i = 0;
        for (MaterializeExpression arg : f.getArguments()) {
            if (i++ != 0) {
                sb.append(", ");
            }
            visit(arg);
        }
        sb.append(")");
    }

    @Override
    public void visit(MaterializeCastOperation cast) {
        if (cast.getCompoundType().getDataType() == MaterializeDataType.BOOLEAN) {
            sb.append("(");
            MaterializeExpression expr = cast.getExpression();
            visit(expr);
            if (expr.getExpressionType() == MaterializeDataType.TEXT) {
                sb.append(" != '')");
            } else if (expr.getExpressionType() == MaterializeDataType.BOOLEAN) {
                sb.append(" != FALSE)");
            } else {
                sb.append(" != 0)");
            }
        } else if (Randomly.getBoolean()) {
            if (cast.getCompoundType().getDataType() == MaterializeDataType.REAL
                    || cast.getCompoundType().getDataType() == MaterializeDataType.FLOAT) {
                sb.append("CAST(CAST(");
                visit(cast.getExpression());
                sb.append(" AS INT) AS ");
            } else {
                sb.append("CAST(");
                visit(cast.getExpression());
                sb.append(" AS ");
            }
            appendType(cast);
            sb.append(")");
        } else {
            if (cast.getCompoundType().getDataType() == MaterializeDataType.REAL
                    || cast.getCompoundType().getDataType() == MaterializeDataType.FLOAT) {
                sb.append("(");
                visit(cast.getExpression());
                sb.append(")::INT::");
                appendType(cast);
            } else {
                sb.append("(");
                visit(cast.getExpression());
                sb.append(")::");
                appendType(cast);
            }
        }
    }

    private void appendType(MaterializeCastOperation cast) {
        MaterializeCompoundDataType compoundType = cast.getCompoundType();
        appendCastType(compoundType);
    }

    @Override
    public void mapRealType(AbstractCompoundDataType<?> compoundType) {
        sb.append("FLOAT");
    }

    @Override
    public void mapFloatType(AbstractCompoundDataType<?> compoundType) {
        sb.append("REAL");
    }

    @Override
    public void mapBitType(AbstractCompoundDataType<?> compoundType) {
        sb.append("INT");
    }

    @Override
    public void mapMoneyType(AbstractCompoundDataType<?> compoundType) {
        throw new AssertionError(compoundType.getDataType());
    }

    @Override
    public void mapInetType(AbstractCompoundDataType<?> compoundType) {
        throw new AssertionError(compoundType.getDataType());
    }

    @Override
    public void mapByteaType(AbstractCompoundDataType<?> compoundType) {
        throw new AssertionError(compoundType.getDataType());
    }

    @Override
    public void visit(MaterializeBetweenOperation op) {
        sb.append("(");
        visit(op.getExpr());
        sb.append(") BETWEEN ");
        sb.append("(");
        visit(op.getLeft());
        sb.append(") AND (");
        visit(op.getRight());
        sb.append(")");
    }

    @Override
    public void visit(MaterializeInOperation op) {
        sb.append("(");
        visit(op.getExpr());
        sb.append(")");
        if (!op.isTrue()) {
            sb.append(" NOT");
        }
        sb.append(" IN (");
        visit(op.getListElements());
        sb.append(")");
    }

    @Override
    public void visit(MaterializePostfixText op) {
        visit(op.getExpr());
        sb.append(op.getText());
    }

    @Override
    public void visit(MaterializeAggregate op) {
        sb.append(op.getFunction());
        sb.append("(");
        visit(op.getArgs());
        sb.append(")");
    }

    @Override
    public void visit(MaterializeSimilarTo op) {
        sb.append("(");
        visit(op.getString());
        sb.append(" SIMILAR TO ");
        visit(op.getSimilarTo());
        if (op.getEscapeCharacter() != null) {
            visit(op.getEscapeCharacter());
        }
        sb.append(")");
    }

    @Override
    public void visit(MaterializePOSIXRegularExpression op) {
        visit(op.getString());
        sb.append(op.getOp().getStringRepresentation());
        visit(op.getRegex());
    }

    @Override
    public void visit(MaterializeBinaryLogicalOperation op) {
        super.visit((BinaryOperation<MaterializeExpression>) op);
    }

    @Override
    public void visit(MaterializeLikeOperation op) {
        super.visit((BinaryOperation<MaterializeExpression>) op);
    }

}
