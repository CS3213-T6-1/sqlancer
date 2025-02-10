package sqlancer.yugabyte.ysql.ast;

import sqlancer.common.ast.newast.Join;
import sqlancer.yugabyte.ysql.YSQLSchema.YSQLColumn;
import sqlancer.yugabyte.ysql.YSQLSchema.YSQLDataType;
import sqlancer.yugabyte.ysql.YSQLSchema.YSQLTable;

public class YSQLJoin implements YSQLExpression, Join<YSQLExpression, YSQLTable, YSQLColumn> {

    private final YSQLExpression tableReference;
    private YSQLExpression onClause;
    private final Join.Type type;

    public YSQLJoin(YSQLExpression tableReference, YSQLExpression onClause, Join.Type type) {
        this.tableReference = tableReference;
        this.onClause = onClause;
        this.type = type;
    }

    public YSQLExpression getTableReference() {
        return tableReference;
    }

    public YSQLExpression getOnClause() {
        return onClause;
    }

    public Join.Type getType() {
        return type;
    }

    @Override
    public YSQLDataType getExpressionType() {
        throw new AssertionError();
    }

    @Override
    public YSQLConstant getExpectedValue() {
        throw new AssertionError();
    }

    @Override
    public void setOnClause(YSQLExpression onClause) {
        this.onClause = onClause;
    }
}
