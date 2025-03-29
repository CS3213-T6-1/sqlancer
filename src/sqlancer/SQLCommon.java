package sqlancer;

import java.util.List;
import java.util.stream.Collectors;

import sqlancer.common.query.ExpectedErrors;
import sqlancer.common.schema.AbstractRelationalTable;
import sqlancer.common.schema.AbstractTableColumn;

public final class SQLCommon {

    private SQLCommon() {
    }

    public static boolean appendIntDataType(StringBuilder sb, boolean allowSerial) {
        boolean serial = false;
        if (Randomly.getBoolean() && allowSerial) {
            serial = true;
            sb.append(Randomly.fromOptions("serial", "bigserial"));
        } else {
            sb.append(Randomly.fromOptions("smallint", "integer", "bigint"));
        }
        return serial;
    }

    public static void appendBitDataType(StringBuilder sb) {
        sb.append("BIT");
        // if (Randomly.getBoolean()) {
        sb.append(" VARYING");
        // }
        sb.append("(");
        sb.append(Randomly.getNotCachedInteger(1, 500));
        sb.append(")");
    }

    public static void appendInetDataType(StringBuilder sb) {
        sb.append("inet");
    }

    @SuppressWarnings("unchecked")
    public static void addTableConstraintForeignKey(
            List<? extends AbstractTableColumn<?, ?>> randomNonEmptyColumnSubset, StringBuilder sb,
            ExpandedGlobalState<?, ?> globalState, ExpectedErrors errors) {
        List<AbstractTableColumn<?, ?>> otherColumns;
        sb.append("FOREIGN KEY (");
        sb.append(randomNonEmptyColumnSubset.stream().map(c -> c.getName()).collect(Collectors.joining(", ")));
        sb.append(") REFERENCES ");
        AbstractRelationalTable<?, ?, ?> randomOtherTable = (AbstractRelationalTable<?, ?, ?>) globalState.getSchema()
                .getRandomTable(tab -> !tab.isView());
        sb.append(randomOtherTable.getName());
        if (randomOtherTable.getColumns().size() < randomNonEmptyColumnSubset.size()) {
            throw new IgnoreMeException();
        }
        otherColumns = (List<AbstractTableColumn<?, ?>>) randomOtherTable
                .getRandomNonEmptyColumnSubset(randomNonEmptyColumnSubset.size());
        sb.append("(");
        sb.append(otherColumns.stream().map(c -> c.getName()).collect(Collectors.joining(", ")));
        sb.append(")");
        if (Randomly.getBoolean()) {
            sb.append(" ");
            sb.append(Randomly.fromOptions("MATCH FULL", "MATCH SIMPLE"));
        }
        if (Randomly.getBoolean()) {
            sb.append(" ON DELETE ");
            errors.add("ERROR: invalid ON DELETE action for foreign key constraint containing generated column");
            deleteOrUpdateAction(sb);
        }
        if (Randomly.getBoolean()) {
            sb.append(" ON UPDATE ");
            errors.add("invalid ON UPDATE action for foreign key constraint containing generated column");
            deleteOrUpdateAction(sb);
        }
        if (Randomly.getBoolean()) {
            sb.append(" ");
            if (Randomly.getBoolean()) {
                sb.append("DEFERRABLE");
                if (Randomly.getBoolean()) {
                    sb.append(" ");
                    sb.append(Randomly.fromOptions("INITIALLY DEFERRED", "INITIALLY IMMEDIATE"));
                }
            } else {
                sb.append("NOT DEFERRABLE");
            }
        }
    }

    public static void appendExcludedElementHelper(StringBuilder sb, ExpandedGlobalState<?, ?> globalState) {
        if (Randomly.getBoolean()) {
            sb.append(" ");
            sb.append(Randomly.fromList(globalState.getOpClasses()));
        }
        if (Randomly.getBoolean()) {
            sb.append(" ");
            sb.append(Randomly.fromOptions("ASC", "DESC"));
        }
        if (Randomly.getBoolean()) {
            sb.append(" NULLS ");
            sb.append(Randomly.fromOptions("FIRST", "LAST"));
        }
    }

    private static void deleteOrUpdateAction(StringBuilder sb) {
        sb.append(Randomly.fromOptions("NO ACTION", "RESTRICT", "CASCADE", "SET NULL", "SET DEFAULT"));
    }
}
