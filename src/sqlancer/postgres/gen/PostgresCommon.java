package sqlancer.postgres.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import sqlancer.Randomly;
import sqlancer.SQLCommonUtils;
import sqlancer.common.DBMSCommon;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.postgres.PostgresGlobalState;
import sqlancer.postgres.PostgresProvider;
import sqlancer.postgres.PostgresSchema.PostgresColumn;
import sqlancer.postgres.PostgresSchema.PostgresDataType;
import sqlancer.postgres.PostgresSchema.PostgresTable;
import sqlancer.postgres.PostgresVisitor;

public final class PostgresCommon {

    private PostgresCommon() {
    }

    public static List<String> getCommonFetchErrors() {
        return DBMSCommon.getCommonFetchErrors();
    }

    public static void addCommonFetchErrors(ExpectedErrors errors) {
        errors.addAll(getCommonFetchErrors());
    }

    public static List<String> getCommonTableErrors() {
        return DBMSCommon.getCommonTableErrors();
    }

    public static void addCommonTableErrors(ExpectedErrors errors) {
        errors.addAll(getCommonTableErrors());
    }

    public static List<String> getCommonExpressionErrors() {
        List<String> errors = DBMSCommon.getCommonExpressionErrors();
        errors.addAll(getFunctionErrors());
        return errors;
    }

    public static List<Pattern> getCommonExpressionRegexErrors() {
        ArrayList<Pattern> errors = new ArrayList<>();

        errors.add(Pattern.compile("cannot convert infinity to \\w+"));
        errors.addAll(getFunctionRegexErrors());

        return errors;
    }

    public static void addCommonExpressionErrors(ExpectedErrors errors) {
        errors.addAll(getCommonExpressionErrors());
        errors.addAllRegexes(getCommonExpressionRegexErrors());
    }

    private static List<String> getFunctionErrors() {
        return DBMSCommon.getFunctionErrors();
    }

    private static List<Pattern> getFunctionRegexErrors() {
        ArrayList<Pattern> errors = new ArrayList<>();
        /*
         * PostgreSQL support only a few conversion variants to ASCII: LATIN1, LATIN2, LATIN9 and WINDOWS1250. So, it is
         * better to skip this error at all.
         */
        errors.add(Pattern.compile("encoding conversion from \\w+ to ASCII not supported"));

        /*
         * In accordance with PostgreSQL code, commit 0ab1a2e, conversions to or from SQL_ASCII is meaningless. So
         * disable errors on such an attempt.
         */
        errors.add(Pattern.compile("encoding conversion from SQL_ASCII to \\w+ not supported"));
        errors.add(Pattern.compile("encoding conversion from \\w+ to SQL_ASCII not supported"));

        return errors;
    }

    public static List<String> getCommonRangeExpressionErrors() {
        return DBMSCommon.getCommonRangeExpressionErrors();
    }

    public static void addCommonRangeExpressionErrors(ExpectedErrors errors) {
        errors.addAll(getCommonRangeExpressionErrors());
    }

    public static List<String> getCommonInsertUpdateErrors() {
        List<String> errors = DBMSCommon.getCommonInsertUpdateErrors();
        errors.add("cannot insert a non-DEFAULT value into column");
        return errors;
    }

    public static void addCommonInsertUpdateErrors(ExpectedErrors errors) {
        errors.addAll(getCommonInsertUpdateErrors());
    }

    public static List<String> getGroupingErrors() {
        List<String> errors = DBMSCommon.getGroupingErrors();
        errors.add("aggregate functions are not allowed in GROUP BY");
        return errors;
    }

    public static void addGroupingErrors(ExpectedErrors errors) {
        errors.addAll(getGroupingErrors());
    }

    public static boolean appendDataType(PostgresDataType type, StringBuilder sb, boolean allowSerial,
            boolean generateOnlyKnown, List<String> opClasses) throws AssertionError {
        boolean serial = false;
        switch (type) {
        case BOOLEAN:
            sb.append("boolean");
            break;
        case INT:
            serial = SQLCommonUtils.appendIntDataType(sb, allowSerial);
            break;
        case TEXT:
            if (Randomly.getBoolean()) {
                sb.append("TEXT");
            } else if (Randomly.getBoolean()) {
                // TODO: support CHAR (without VAR)
                if (PostgresProvider.generateOnlyKnown || Randomly.getBoolean()) {
                    sb.append("VAR");
                }
                sb.append("CHAR");
                sb.append("(");
                sb.append(ThreadLocalRandom.current().nextInt(1, 500));
                sb.append(")");
            } else {
                sb.append("name");
            }
            if (Randomly.getBoolean() && !PostgresProvider.generateOnlyKnown) {
                sb.append(" COLLATE ");
                sb.append('"');
                sb.append(Randomly.fromList(opClasses));
                sb.append('"');
            }
            break;
        case DECIMAL:
            sb.append("DECIMAL");
            break;
        case FLOAT:
            sb.append("REAL");
            break;
        case REAL:
            sb.append("FLOAT");
            break;
        case RANGE:
            sb.append(Randomly.fromOptions("int4range", "int4range")); // , "int8range", "numrange"
            break;
        case MONEY:
            sb.append("money");
            break;
        case BIT:
            SQLCommonUtils.appendBitDataType(sb);
            break;
        case INET:
            SQLCommonUtils.appendInetDataType(sb);
            break;
        default:
            throw new AssertionError(type);
        }
        return serial;
    }

    public enum TableConstraints {
        CHECK, UNIQUE, PRIMARY_KEY, FOREIGN_KEY, EXCLUDE
    }

    private enum StorageParameters {
        FILLFACTOR("fillfactor", (r) -> r.getInteger(10, 100)),
        // toast_tuple_target
        PARALLEL_WORKERS("parallel_workers", (r) -> r.getInteger(0, 1024)),
        AUTOVACUUM_ENABLED("autovacuum_enabled", (r) -> Randomly.fromOptions(0, 1)),
        AUTOVACUUM_VACUUM_THRESHOLD("autovacuum_vacuum_threshold", (r) -> r.getInteger(0, 2147483647)),
        OIDS("oids", (r) -> Randomly.fromOptions(0, 1)),
        AUTOVACUUM_VACUUM_SCALE_FACTOR("autovacuum_vacuum_scale_factor",
                (r) -> Randomly.fromOptions(0, 0.00001, 0.01, 0.1, 0.2, 0.5, 0.8, 0.9, 1)),
        AUTOVACUUM_ANALYZE_THRESHOLD("autovacuum_analyze_threshold", (r) -> r.getLong(0, Integer.MAX_VALUE)),
        AUTOVACUUM_ANALYZE_SCALE_FACTOR("autovacuum_analyze_scale_factor",
                (r) -> Randomly.fromOptions(0, 0.00001, 0.01, 0.1, 0.2, 0.5, 0.8, 0.9, 1)),
        AUTOVACUUM_VACUUM_COST_DELAY("autovacuum_vacuum_cost_delay", (r) -> r.getLong(0, 100)),
        AUTOVACUUM_VACUUM_COST_LIMIT("autovacuum_vacuum_cost_limit", (r) -> r.getLong(1, 10000)),
        AUTOVACUUM_FREEZE_MIN_AGE("autovacuum_freeze_min_age", (r) -> r.getLong(0, 1000000000)),
        AUTOVACUUM_FREEZE_MAX_AGE("autovacuum_freeze_max_age", (r) -> r.getLong(100000, 2000000000)),
        AUTOVACUUM_FREEZE_TABLE_AGE("autovacuum_freeze_table_age", (r) -> r.getLong(0, 2000000000));
        // TODO

        private String parameter;
        private Function<Randomly, Object> op;

        StorageParameters(String parameter, Function<Randomly, Object> op) {
            this.parameter = parameter;
            this.op = op;
        }
    }

    public static void generateWith(StringBuilder sb, PostgresGlobalState globalState, ExpectedErrors errors) {
        if (Randomly.getBoolean()) {
            sb.append(" WITH (");
            ArrayList<StorageParameters> values = new ArrayList<>(Arrays.asList(StorageParameters.values()));
            values.remove(StorageParameters.OIDS);
            errors.add("unrecognized parameter");
            errors.add("ALTER TABLE / ADD CONSTRAINT USING INDEX is not supported on partitioned tables");
            List<StorageParameters> subset = Randomly.nonEmptySubset(values);
            int i = 0;
            for (StorageParameters parameter : subset) {
                if (i++ != 0) {
                    sb.append(", ");
                }
                sb.append(parameter.parameter);
                sb.append("=");
                sb.append(parameter.op.apply(globalState.getRandomly()));
            }
            sb.append(")");
        }
    }

    public static void addTableConstraints(boolean excludePrimaryKey, StringBuilder sb, PostgresTable table,
            PostgresGlobalState globalState, ExpectedErrors errors) {
        // TODO constraint name
        List<TableConstraints> tableConstraints = Randomly.nonEmptySubset(TableConstraints.values());
        if (excludePrimaryKey) {
            tableConstraints.remove(TableConstraints.PRIMARY_KEY);
        }
        if (globalState.getSchema().getDatabaseTables().isEmpty()) {
            tableConstraints.remove(TableConstraints.FOREIGN_KEY);
        }
        for (TableConstraints t : tableConstraints) {
            sb.append(", ");
            // TODO add index parameters
            addTableConstraint(sb, table, globalState, t, errors);
        }
    }

    public static void addTableConstraint(StringBuilder sb, PostgresTable table, PostgresGlobalState globalState,
            ExpectedErrors errors) {
        addTableConstraint(sb, table, globalState, Randomly.fromOptions(TableConstraints.values()), errors);
    }

    private static void addTableConstraint(StringBuilder sb, PostgresTable table, PostgresGlobalState globalState,
            TableConstraints t, ExpectedErrors errors) {
        List<PostgresColumn> randomNonEmptyColumnSubset = table.getRandomNonEmptyColumnSubset();
        PostgresCommon.addCommonExpressionErrors(errors);
        switch (t) {
        case CHECK:
            sb.append("CHECK(");
            sb.append(PostgresVisitor.getExpressionAsString(globalState, PostgresDataType.BOOLEAN, table.getColumns()));
            sb.append(")");
            errors.add("constraint must be added to child tables too");
            errors.add("missing FROM-clause entry for table");
            break;
        case UNIQUE:
            sb.append("UNIQUE(");
            sb.append(randomNonEmptyColumnSubset.stream().map(c -> c.getName()).collect(Collectors.joining(", ")));
            sb.append(")");
            appendIndexParameters(sb, globalState, errors);
            break;
        case PRIMARY_KEY:
            sb.append("PRIMARY KEY(");
            sb.append(randomNonEmptyColumnSubset.stream().map(c -> c.getName()).collect(Collectors.joining(", ")));
            sb.append(")");
            appendIndexParameters(sb, globalState, errors);
            break;
        case FOREIGN_KEY:
            SQLCommonUtils.addTableConstraintForeignKey(randomNonEmptyColumnSubset, sb, globalState, errors);
            break;
        case EXCLUDE:
            sb.append("EXCLUDE ");
            sb.append("(");
            // TODO [USING index_method ]
            for (int i = 0; i < Randomly.smallNumber() + 1; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                appendExcludeElement(sb, globalState, table.getColumns());
                sb.append(" WITH ");
                appendOperator(sb, globalState.getOperators());
            }
            sb.append(")");
            appendIndexParameters(sb, globalState, errors);
            SQLCommonUtils.appendTableConstraintExclude(errors);
            // TODO: index parameters
            if (Randomly.getBoolean()) {
                sb.append(" WHERE ");
                sb.append("(");
                sb.append(PostgresVisitor.asString(PostgresExpressionGenerator.generateExpression(globalState,
                        table.getColumns(), PostgresDataType.BOOLEAN)));
                sb.append(")");
            }
            break;
        default:
            throw new AssertionError(t);
        }
    }

    private static void appendIndexParameters(StringBuilder sb, PostgresGlobalState globalState,
            ExpectedErrors errors) {
        if (Randomly.getBoolean()) {
            generateWith(sb, globalState, errors);
        }
        // TODO: [ USING INDEX TABLESPACE tablespace ]
    }

    private static void appendOperator(StringBuilder sb, List<String> operators) {
        sb.append(Randomly.fromList(operators));
    }

    // complete
    private static void appendExcludeElement(StringBuilder sb, PostgresGlobalState globalState,
            List<PostgresColumn> columns) {
        if (Randomly.getBoolean()) {
            // append column name
            sb.append(Randomly.fromList(columns).getName());
        } else {
            // append expression
            sb.append("(");
            sb.append(PostgresVisitor.asString(PostgresExpressionGenerator.generateExpression(globalState, columns)));
            sb.append(")");
        }
        SQLCommonUtils.appendExcludedElementHelper(sb, globalState);
    }
}
