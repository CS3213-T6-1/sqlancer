package sqlancer.cnosdb.ast;

import sqlancer.cnosdb.CnosDBSchema.CnosDBColumn;
import sqlancer.cnosdb.CnosDBSchema.CnosDBDataType;
import sqlancer.cnosdb.CnosDBSchema.CnosDBTable;
import sqlancer.common.ast.newast.Join;

public class CnosDBJoin implements CnosDBExpression, Join<CnosDBExpression, CnosDBTable, CnosDBColumn> {

    private final CnosDBExpression tableReference;
    private CnosDBExpression onClause;
    private final Join.Type type;

    public CnosDBJoin(CnosDBExpression tableReference, CnosDBExpression onClause, Join.Type type) {
        this.tableReference = tableReference;
        this.onClause = onClause;
        this.type = type;
    }

    public CnosDBExpression getTableReference() {
        return tableReference;
    }

    public CnosDBExpression getOnClause() {
        return onClause;
    }

    public Join.Type getType() {
        return type;
    }

    @Override
    public CnosDBDataType getExpressionType() {
        throw new AssertionError();
    }

    @Override
    public void setOnClause(CnosDBExpression onClause) {
        this.onClause = onClause;
    }

}
