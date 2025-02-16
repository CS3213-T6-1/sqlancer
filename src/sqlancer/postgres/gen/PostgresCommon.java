package sqlancer.postgres.gen;

import java.util.List;

import sqlancer.common.gen.PostgresLikeCommon;
import sqlancer.common.query.ExpectedErrors;

public final class PostgresCommon extends PostgresLikeCommon {

    private PostgresCommon() {
    }

    public static void addCommonExpressionErrors(ExpectedErrors errors) {
        PostgresLikeCommon.addCommonExpressionErrors(errors);
        errors.addAllRegexes(getCommonExpressionRegexErrors());
    }

    public static List<String> getCommonInsertUpdateErrors() {
        List<String> errors = PostgresLikeCommon.getCommonInsertUpdateErrors();
        errors.add("cannot insert a non-DEFAULT value into column");
        return errors;
    }

    public static List<String> getGroupingErrors() {
        List<String> errors = PostgresLikeCommon.getCommonExpressionErrors();
        errors.add("aggregate functions are not allowed in GROUP BY");
        return errors;
    }

}
