package sqlancer.yugabyte.ysql;

import java.util.Optional;

import sqlancer.Randomly;
import sqlancer.common.visitor.BinaryOperation;
import sqlancer.common.visitor.SelectToStringVisitor;
import sqlancer.yugabyte.ysql.ast.YSQLAggregate;
import sqlancer.yugabyte.ysql.ast.YSQLBetweenOperation;
import sqlancer.yugabyte.ysql.ast.YSQLBinaryLogicalOperation;
import sqlancer.yugabyte.ysql.ast.YSQLCastOperation;
import sqlancer.yugabyte.ysql.ast.YSQLColumnValue;
import sqlancer.yugabyte.ysql.ast.YSQLConstant;
import sqlancer.yugabyte.ysql.ast.YSQLExpression;
import sqlancer.yugabyte.ysql.ast.YSQLFunction;
import sqlancer.yugabyte.ysql.ast.YSQLInOperation;
import sqlancer.yugabyte.ysql.ast.YSQLJoin;
import sqlancer.yugabyte.ysql.ast.YSQLOrderByTerm;
import sqlancer.yugabyte.ysql.ast.YSQLPOSIXRegularExpression;
import sqlancer.yugabyte.ysql.ast.YSQLPostfixOperation;
import sqlancer.yugabyte.ysql.ast.YSQLPostfixText;
import sqlancer.yugabyte.ysql.ast.YSQLPrefixOperation;
import sqlancer.yugabyte.ysql.ast.YSQLSelect;
import sqlancer.yugabyte.ysql.ast.YSQLSelect.YSQLFromTable;
import sqlancer.yugabyte.ysql.ast.YSQLSelect.YSQLSubquery;
import sqlancer.yugabyte.ysql.ast.YSQLSimilarTo;

public final class YSQLToStringVisitor extends SelectToStringVisitor<YSQLExpression, YSQLSelect, YSQLJoin>
        implements YSQLVisitor {

    @Override
    protected YSQLExpression getDistinctOnClause(YSQLSelect select) {
        return select.getDistinctOnClause();
    }

    @Override
    protected void visitJoinClauses(YSQLSelect select) {
        for (YSQLJoin join : select.getJoinClauses()) {
            visitJoinClause(join);
        }
    }

    @Override
    protected void visitJoinType(YSQLJoin join) {
        switch (join.getType()) {
        case INNER:
            if (Randomly.getBoolean()) {
                sb.append("INNER ");
            }
            sb.append("JOIN");
            break;
        case LEFT:
            sb.append("LEFT OUTER JOIN");
            break;
        case RIGHT:
            sb.append("RIGHT OUTER JOIN");
            break;
        case FULL:
            sb.append("FULL OUTER JOIN");
            break;
        case CROSS:
            sb.append("CROSS JOIN");
            break;
        default:
            throw new AssertionError(join.getType());
        }
    }

    @Override
    protected boolean shouldVisitOnClause(YSQLJoin join) {
        return join.getType() != YSQLJoin.YSQLJoinType.CROSS;
    }

    @Override
    protected boolean hasDistinctOnSupport() {
        return true;
    }

    @Override
    public void visitSpecific(YSQLExpression expr) {
        YSQLVisitor.super.visit(expr);
    }

    @Override
    public String get() {
        return sb.toString();
    }

    @Override
    public void visit(YSQLConstant constant) {
        sb.append(constant.getTextRepresentation());
    }

    @Override
    public void visit(YSQLPostfixOperation op) {
        sb.append("(");
        visit(op.getExpression());
        sb.append(")");
        sb.append(" ");
        sb.append(op.getOperatorTextRepresentation());
    }

    @Override
    public void visit(YSQLColumnValue c) {
        sb.append(c.getColumn().getFullQualifiedName());
    }

    @Override
    public void visit(YSQLPrefixOperation op) {
        sb.append(op.getTextRepresentation());
        sb.append(" (");
        visit(op.getExpression());
        sb.append(")");
    }

    @Override
    public void visit(YSQLSelect s) {
        visitSelect(s);
    }

    @Override
    protected YSQLExpression getJoinOnClause(YSQLJoin join) {
        return join.getOnClause();
    }

    @Override
    protected YSQLExpression getJoinTableReference(YSQLJoin join) {
        return join.getTableReference();
    }

    @Override
    public void visit(YSQLOrderByTerm op) {
        visit(op.getExpr());
        sb.append(" ");
        sb.append(op.getOrder());
    }

    @Override
    public void visit(YSQLFunction f) {
        sb.append(f.getFunctionName());
        sb.append("(");
        int i = 0;
        for (YSQLExpression arg : f.getArguments()) {
            if (i++ != 0) {
                sb.append(", ");
            }
            visit(arg);
        }
        sb.append(")");
    }

    @Override
    public void visit(YSQLCastOperation cast) {
        if (Randomly.getBoolean()) {
            sb.append("CAST(");
            visit(cast.getExpression());
            sb.append(" AS ");
            appendType(cast);
            sb.append(")");
        } else {
            sb.append("(");
            visit(cast.getExpression());
            sb.append(")::");
            appendType(cast);
        }
    }

    @Override
    public void visit(YSQLBetweenOperation op) {
        sb.append("(");
        visit(op.getExpr());
        sb.append(") BETWEEN ");
        if (op.isSymmetric()) {
            sb.append("SYMMETRIC ");
        }
        sb.append("(");
        visit(op.getLeft());
        sb.append(") AND (");
        visit(op.getRight());
        sb.append(")");
    }

    @Override
    public void visit(YSQLInOperation op) {
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
    public void visit(YSQLPostfixText op) {
        visit(op.getExpr());
        sb.append(op.getText());
    }

    @Override
    public void visit(YSQLAggregate op) {
        sb.append(op.getFunction());
        sb.append("(");
        visit(op.getArgs());
        sb.append(")");
    }

    @Override
    public void visit(YSQLSimilarTo op) {
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
    public void visit(YSQLPOSIXRegularExpression op) {
        visit(op.getString());
        sb.append(op.getOp().getStringRepresentation());
        visit(op.getRegex());
    }

    @Override
    public void visit(YSQLFromTable from) {
        if (from.isOnly()) {
            sb.append("ONLY ");
        }
        sb.append(from.getTable().getName());
        if (!from.isOnly() && Randomly.getBoolean()) {
            sb.append("*");
        }
    }

    @Override
    public void visit(YSQLSubquery subquery) {
        sb.append("(");
        visit(subquery.getSelect());
        sb.append(") AS ");
        sb.append(subquery.getName());
    }

    @Override
    public void visit(YSQLBinaryLogicalOperation op) {
        super.visit((BinaryOperation<YSQLExpression>) op);
    }

    private void appendType(YSQLCastOperation cast) {
        YSQLCompoundDataType compoundType = cast.getCompoundType();
        switch (compoundType.getDataType()) {
        case BOOLEAN:
            sb.append("BOOLEAN");
            break;
        case INT: // TODO support also other int types
            sb.append("INT");
            break;
        case TEXT:
            // TODO: append TEXT, CHAR
            sb.append(Randomly.fromOptions("VARCHAR"));
            break;
        case REAL:
            sb.append("REAL");
            break;
        case DECIMAL:
            sb.append("DECIMAL");
            break;
        case FLOAT:
            sb.append("FLOAT");
            break;
        case RANGE:
            sb.append("int4range");
            break;
        case MONEY:
            sb.append("MONEY");
            break;
        case INET:
            sb.append("INET");
            break;
        case BIT:
            sb.append("BIT");
            break;
        case BYTEA:
            sb.append("BYTEA");
            break;
        // if (Randomly.getBoolean()) {
        // sb.append("(");
        // sb.append(Randomly.getNotCachedInteger(1, 100));
        // sb.append(")");
        // }
        default:
            throw new AssertionError(cast.getType());
        }
        Optional<Integer> size = compoundType.getSize();
        if (size.isPresent()) {
            sb.append("(");
            sb.append(size.get());
            sb.append(")");
        }
    }

}
