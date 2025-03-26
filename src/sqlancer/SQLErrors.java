package sqlancer;

import java.util.ArrayList;
import java.util.List;

import sqlancer.common.query.ExpectedErrors;

public class SQLErrors {

    protected SQLErrors() {
    }

    public static List<String> getExpressionErrors() {
        ArrayList<String> errors = new ArrayList<>();

        return errors;
    }

    public static void addExpressionErrors(ExpectedErrors errors) {
        errors.addAll(getExpressionErrors());
    }


    public static void addInsertErrors(ExpectedErrors errors) {
        errors.addAll(getInsertErrors());
    }

    public static List<String> getInsertErrors() {
        ArrayList<String> errors = new ArrayList<>();

        errors.add("Duplicate entry");
        errors.add("cannot be null");
        errors.add("doesn't have a default value");
        errors.add("Out of range value");
        errors.add("Incorrect double value");
        errors.add("Incorrect float value");
        errors.add("Incorrect int value");
        errors.add("Incorrect tinyint value");
        errors.add("Data truncation");
        errors.add("Bad Number");
        errors.add("The value specified for generated column"); // TODO: do not insert data into generated columns
        errors.add("incorrect utf8 value");
        errors.add("Data truncation: %s value is out of range in '%s'");
        errors.add("Incorrect smallint value");
        errors.add("Incorrect bigint value");
        errors.add("Incorrect decimal value");
        errors.add("error parsing regexp");

        return errors;
    }
}
