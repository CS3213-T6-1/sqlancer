package sqlancer;

import java.util.List;
import java.util.function.Function;

import sqlancer.common.DBMSCommon;
import sqlancer.common.ast.newast.Expression;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.common.schema.AbstractRelationalTable;
import sqlancer.common.schema.TableIndex;

public abstract class SQLIndexGenerator {

    protected SQLIndexGenerator() {
    }

    public enum IndexType {
        BTREE, HASH, GIST, GIN
    }

    protected static ExpectedErrors generateErrors() {
        ExpectedErrors errors = new ExpectedErrors();

        errors.add("already contains data"); // CONCURRENT INDEX failed
        errors.add("You might need to add explicit type casts");
        errors.add(" collations are not supported"); // TODO check
        errors.add("because it has pending trigger events");
        errors.add("could not determine which collation to use for index expression");
        errors.add("could not determine which collation to use for string comparison");
        errors.add("is duplicated");
        errors.add("access method \"gin\" does not support unique indexes");
        errors.add("access method \"hash\" does not support unique indexes");
        errors.add("already exists");
        errors.add("could not create unique index");
        errors.add("has no default operator class");
        errors.add("does not support");
        errors.add("unsupported UNIQUE constraint with partition key definition");
        errors.add("insufficient columns in UNIQUE constraint definition");
        errors.add("invalid input syntax for");
        errors.add("must be type ");
        errors.add("integer out of range");
        errors.add("division by zero");
        errors.add("out of range");
        errors.add("functions in index predicate must be marked IMMUTABLE");
        errors.add("functions in index expression must be marked IMMUTABLE");
        errors.add("result of range difference would not be contiguous");
        errors.add("which is part of the partition key");

        return errors;

    }

    protected static <G extends ExpandedGlobalState<?, ?>, T extends AbstractRelationalTable<?, ?, ?>, C, E extends Expression<?>> IndexType generateHelper(
            G globalState, ExpectedErrors errors, StringBuilder sb, T randomTable,
            SQLExpressionGenerator<G, C, E> expressionGenerator, Function<E, String> asString) {
        sb.append("CREATE");
        if (Randomly.getBoolean()) {
            sb.append(" UNIQUE");
        }
        sb.append(" INDEX ");
        // views
        String indexName = getNewIndexName(randomTable);
        sb.append(indexName);
        sb.append(" ON ");
        if (Randomly.getBoolean()) {
            sb.append("ONLY ");
        }
        sb.append(randomTable.getName());
        IndexType method;
        if (Randomly.getBoolean()) {
            sb.append(" USING ");
            method = Randomly.fromOptions(IndexType.values());
            sb.append(method);
        } else {
            method = IndexType.BTREE;
        }

        sb.append("(");
        if (method == IndexType.HASH) {
            sb.append(randomTable.getRandomColumn().getName());
        } else {
            for (int i = 0; i < Randomly.smallNumber() + 1; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                if (Randomly.getBoolean()) {
                    sb.append(randomTable.getRandomColumn().getName());
                } else {
                    sb.append("(");
                    @SuppressWarnings("unchecked")
                    E expression = expressionGenerator.generate(globalState, (List<C>) randomTable.getColumns());
                    sb.append(asString.apply(expression));
                    sb.append(")");
                }

                if (Randomly.getBooleanWithRatherLowProbability()) {
                    sb.append(" ");
                    sb.append(globalState.getRandomOpclass());
                    errors.add("does not accept");
                    errors.add("does not exist for access method");
                }
                if (Randomly.getBoolean()) {
                    sb.append(" ");
                    sb.append(Randomly.fromOptions("ASC", "DESC"));
                }
                if (Randomly.getBooleanWithRatherLowProbability()) {
                    sb.append(" NULLS ");
                    sb.append(Randomly.fromOptions("FIRST", "LAST"));
                }
            }
        }

        sb.append(")");
        return method;
    }

    private static String getNewIndexName(AbstractRelationalTable<?, ?, ?> randomTable) {
        @SuppressWarnings("unchecked")
        List<TableIndex> indexes = (List<TableIndex>) randomTable.getIndexes();
        int indexI = 0;
        while (true) {
            String indexName = DBMSCommon.createIndexName(indexI++);
            if (indexes.stream().noneMatch(i -> i.getIndexName().equals(indexName))) {
                return indexName;
            }
        }
    }
}
