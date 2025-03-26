package sqlancer.oceanbase;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import sqlancer.SQLErrors;
import sqlancer.common.query.ExpectedErrors;

public final class OceanBaseErrors extends SQLErrors {

    private OceanBaseErrors() {
    }

    public static List<String> getExpressionErrors() {
        List<String> errors = SQLErrors.getExpressionErrors();

        errors.add("BIGINT value is out of range"); // e.g., CAST(-('-1e500') AS SIGNED)
        errors.add("is not valid for CHARACTER SET");
        errors.add("The observer or zone is not the master");
        errors.add("Incorrect integer value");
        errors.add("Truncated incorrect DOUBLE value");
        errors.add("Invalid numeric");
        errors.add("Data truncated for argument");
        errors.add("Data truncated for column");

        return errors;
    }

    public static List<Pattern> getExpressionErrorsRegex() {
        ArrayList<Pattern> errors = new ArrayList<>();
        errors.add(Pattern.compile("Unknown column '.+' in 'order clause'"));

        return errors;
    }

    public static void addExpressionErrors(ExpectedErrors errors) {
        errors.addAll(getExpressionErrors());
    }

    public static List<String> getInsertErrors() {
        List<String> errors = SQLErrors.getInsertErrors();

        return errors;
    }
}
