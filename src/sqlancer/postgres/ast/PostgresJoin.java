package sqlancer.postgres.ast;

import java.util.ArrayList;
import java.util.List;

import sqlancer.Randomly;
import sqlancer.common.ast.newast.Join;
import sqlancer.postgres.PostgresGlobalState;
import sqlancer.postgres.PostgresSchema.PostgresColumn;
import sqlancer.postgres.PostgresSchema.PostgresDataType;
import sqlancer.postgres.PostgresSchema.PostgresTable;
import sqlancer.postgres.gen.PostgresExpressionGenerator;

public class PostgresJoin implements PostgresExpression, Join<PostgresExpression, PostgresTable, PostgresColumn> {

    private final PostgresExpression tableReference;
    private PostgresExpression onClause;
    private Join.Type type;
    private final PostgresExpression leftTable;
    private final PostgresExpression rightTable;

    public PostgresJoin(PostgresExpression tableReference, PostgresExpression onClause, Join.Type type) {
        this.tableReference = tableReference;
        this.onClause = onClause;
        this.type = type;
        this.leftTable = null;
        this.rightTable = null;
    }

    public PostgresJoin(PostgresExpression leftTable, PostgresExpression rightTable, Join.Type joinType,
            PostgresExpression whereCondition) {
        this.leftTable = leftTable;
        this.rightTable = rightTable;
        this.type = joinType;
        this.onClause = whereCondition;
        this.tableReference = null;
    }

    public static PostgresJoin createJoin(PostgresExpression left, PostgresExpression right, Join.Type type,
            PostgresExpression onClause) {
        if (type == Join.Type.CROSS) {
            return new PostgresJoin(left, right, type, null);
        } else {
            return new PostgresJoin(left, right, type, onClause);
        }
    }

    public static List<PostgresExpression> getJoins(List<PostgresExpression> tableList,
            PostgresGlobalState globalState) {
        // Clone Table to prevent the original list from being manipulated
        List<PostgresExpression> tbl = new ArrayList<>(tableList);
        List<PostgresExpression> joinExpressions = new ArrayList<>();
        while (tbl.size() >= 2 && Randomly.getBoolean()) {
            PostgresTableReference left = (PostgresTableReference) tbl.remove(0);
            PostgresTableReference right = (PostgresTableReference) tbl.remove(0);
            List<PostgresColumn> columns = new ArrayList<>();
            columns.addAll(left.getTable().getColumns());
            columns.addAll(right.getTable().getColumns());
            PostgresExpressionGenerator joinGen = new PostgresExpressionGenerator(globalState).setColumns(columns);
            joinExpressions.add(PostgresJoin.createJoin(left, right, Join.Type.getRandom(),
                    joinGen.generateExpression(0, PostgresDataType.BOOLEAN)));
        }
        return joinExpressions;
    }

    @Override
    public void setOnClause(PostgresExpression clause) {
        this.onClause = clause;
    }

    public void setType(Join.Type type) {
        this.type = type;
    }

    public PostgresExpression getTableReference() {
        return tableReference;
    }

    public PostgresExpression getLeftTable() {
        return leftTable;
    }

    public PostgresExpression getRightTable() {
        return rightTable;
    }

    public PostgresExpression getOnClause() {
        return onClause;
    }

    public Join.Type getType() {
        return type;
    }

    @Override
    public PostgresDataType getExpressionType() {
        throw new AssertionError();
    }

    @Override
    public PostgresConstant getExpectedValue() {
        throw new AssertionError();
    }

}
