package sqlancer.databend.ast;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import sqlancer.DatabendDorisConstant;
import sqlancer.databend.DatabendSchema.DatabendDataType;

public abstract class DatabendConstant extends DatabendDorisConstant implements DatabendExpression {

    public abstract DatabendConstant cast(DatabendDataType dataType);

    protected Timestamp truncateTimestamp(long val) {
        // Databend supports `date` and `timestamp` type where the year cannot exceed `9999`,
        // the value is truncated to ensure generate legitimate `date` and `timestamp` value.
        long t = val % 253380000000000L;
        return new Timestamp(t);
    }

    public abstract DatabendConstant isEquals(DatabendConstant rightVal);

    public abstract DatabendConstant isLessThan(DatabendConstant rightVal);

    // public abstract String getTextRepresentation();

    public static class DatabendNullConstant extends DatabendConstant {

        @Override
        public String toString() {
            return "NULL";
        }

        @Override
        public boolean isNull() {
            return true;
        }

        @Override
        public DatabendConstant cast(DatabendDataType dataType) {
            return DatabendConstant.createNullConstant();
        }

        @Override
        public DatabendConstant isEquals(DatabendConstant rightVal) {
            return DatabendConstant.createNullConstant();
        }

        @Override
        public DatabendConstant isLessThan(DatabendConstant rightVal) {
            return DatabendConstant.createNullConstant();
        }

        @Override
        public DatabendDataType getExpectedType() {
            return DatabendDataType.NULL;
        }

        // @Override
        // public DatabendConstant getExpectedValue() {
        // return super.getExpectedValue();
        // }
    }

    public abstract static class DatabendNumericConstant<T extends Number> extends DatabendConstant {
        protected final T value;

        public DatabendNumericConstant(T value) {
            this.value = value;
        }

        @Override
        public DatabendConstant isLessThan(DatabendConstant rightVal) {
            if (rightVal.isNull()) {
                return DatabendConstant.createNullConstant();
            } else if (rightVal.isInt()) {
                return DatabendConstant.createBooleanConstant(value.doubleValue() < rightVal.asInt());
            } else if (rightVal.isFloat()) {
                return DatabendConstant.createBooleanConstant(value.doubleValue() < rightVal.asFloat());
            } else {
                throw new AssertionError(rightVal);
            }
        }
    }

    public static class DatabendIntConstant extends DatabendNumericConstant<Long> {

        public DatabendIntConstant(long value) {
            super(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public long getValue() {
            return value;
        }

        @Override
        public boolean isInt() {
            return true;
        }

        @Override
        public DatabendConstant cast(DatabendDataType dataType) {
            switch (dataType) {
            case BOOLEAN:
                return new DatabendBooleanConstant(value != 0);
            case INT:
                return this;
            case VARCHAR:
                return new DatabendStringConstant(String.valueOf(value));
            case DATE:
                return new DatabendDateConstant(value);
            case TIMESTAMP:
                return new DatabendTimestampConstant(value);
            default:
                return null;
            }
        }

        @Override
        public long asInt() {
            return value;
        }

        @Override
        public DatabendConstant isEquals(DatabendConstant rightVal) {
            if (rightVal.isNull()) {
                return DatabendConstant.createNullConstant();
            } else if (rightVal.isInt()) {
                return DatabendConstant.createBooleanConstant(value == rightVal.asInt());
            } else {
                throw new AssertionError(rightVal);
            }

        }

        @Override
        public DatabendDataType getExpectedType() {
            return DatabendDataType.INT;
        }
    }

    public static class DatabendFloatConstant extends DatabendNumericConstant<Double> {

        public DatabendFloatConstant(double value) {
            super(value);
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean isFloat() {
            return true;
        }

        @Override
        public String toString() {
            if (value == Double.POSITIVE_INFINITY) {
                return "3.40282347e+38";
            } else if (value == Double.NEGATIVE_INFINITY) {
                return "-3.40282347e+38";
            }

            return String.valueOf(value);
        }

        @Override
        public DatabendConstant cast(DatabendDataType dataType) {
            switch (dataType) {
            case FLOAT:
                return this;
            case INT:
                return DatabendConstant.createIntConstant(value.longValue());
            case BOOLEAN:
                return DatabendConstant.createBooleanConstant(value != 0);
            case VARCHAR:
                return DatabendConstant.createStringConstant(String.valueOf(value));
            default:
                return null;
            }
        }

        @Override
        public double asFloat() {
            return value;
        }

        @Override
        public DatabendConstant isEquals(DatabendConstant rightVal) {
            return null;
        }
    }

    public static class DatabendStringConstant extends DatabendConstant {

        private final String value;

        public DatabendStringConstant(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "'" + value.replace("'", "''") + "'";
        }

        @Override
        public String asString() {
            return value;
        }

        @Override
        public boolean isString() {
            return true;
        }

        @Override
        public DatabendConstant cast(DatabendDataType dataType) {
            switch (dataType) {
            case VARCHAR:
                return this;
            case INT:
                try {
                    return new DatabendIntConstant(Long.parseLong(value));
                } catch (NumberFormatException e) {
                    return new DatabendIntConstant(-1);
                }
            case BOOLEAN:
                if ("false".contentEquals(value.toLowerCase())) {
                    return new DatabendBooleanConstant(false);
                } else if ("true".contentEquals(value.toLowerCase())) {
                    return new DatabendBooleanConstant(true);
                } else {
                    throw new AssertionError(String.format("string: %s, cannot be forced to boolean", value));
                }
            case FLOAT:
                try {
                    return new DatabendFloatConstant(Double.parseDouble(value));
                } catch (NumberFormatException e) {
                    return new DatabendFloatConstant(-1);
                }
            default:
                return null;
            }
        }

        @Override
        public DatabendConstant isEquals(DatabendConstant rightVal) {
            if (rightVal.isNull()) {
                return DatabendConstant.createNullConstant();
            } else if (rightVal.isString()) {
                return DatabendConstant.createBooleanConstant(value.contentEquals(rightVal.asString()));
            } else {
                // TODO 可以比较 date和timestamp类型，待添加
                throw new AssertionError(rightVal);
            }
        }

        @Override
        public DatabendConstant isLessThan(DatabendConstant rightVal) {
            if (rightVal.isNull()) {
                return DatabendConstant.createNullConstant();
            } else if (rightVal.isString()) {
                return DatabendConstant.createBooleanConstant(value.compareTo(rightVal.asString()) < 0);
            } else {
                throw new AssertionError(rightVal);
            }
        }
    }

    public abstract static class DatabendTemporalConstant extends DatabendConstant {
        protected String textRepr;

        public DatabendTemporalConstant(long val) {
            Timestamp timestamp = truncateTimestamp(val);
            SimpleDateFormat dateFormat;
            if (this instanceof DatabendDateConstant) {
                dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            } else {
                dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }
            textRepr = dateFormat.format(timestamp);
        }

        public String getValue() {
            return textRepr;
        }

        @Override
        public DatabendConstant cast(DatabendDataType dataType) {
            return null;
        }

        @Override
        public DatabendConstant isEquals(DatabendConstant rightVal) {
            return null;
        }

        @Override
        public DatabendConstant isLessThan(DatabendConstant rightVal) {
            return null;
        }
    }

    public static class DatabendDateConstant extends DatabendTemporalConstant {

        public DatabendDateConstant(long val) {
            super(val);
        }

        @Override
        public String toString() {
            return String.format("DATE '%s'", textRepr);
        }
    }

    public static class DatabendTimestampConstant extends DatabendTemporalConstant {

        public DatabendTimestampConstant(long val) {
            super(val);
        }

        @Override
        public String toString() {
            return String.format("TIMESTAMP '%s'", textRepr);
        }
    }

    public static class DatabendBooleanConstant extends DatabendConstant {

        private final boolean value;

        public DatabendBooleanConstant(boolean value) {
            this.value = value;
        }

        public boolean getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @Override
        public boolean asBoolean() {
            return value;
        }

        @Override
        public boolean isBoolean() {
            return true;
        }

        @Override
        public DatabendConstant cast(DatabendDataType dataType) {
            switch (dataType) {
            case BOOLEAN:
                return this;
            case INT:
                return new DatabendIntConstant(value ? 1 : 0);
            case FLOAT:
                return new DatabendFloatConstant(value ? 1 : 0);
            case VARCHAR:
                return new DatabendStringConstant(value ? "1" : "0");
            default:
                return null;
            }
        }

        @Override
        public DatabendConstant isEquals(DatabendConstant rightVal) {
            if (rightVal.isNull()) {
                return DatabendConstant.createNullConstant();
            } else if (rightVal.isBoolean()) {
                return DatabendConstant.createBooleanConstant(value == rightVal.asBoolean());
            } else {
                throw new AssertionError(rightVal);
            }

        }

        @Override
        public DatabendConstant isLessThan(DatabendConstant rightVal) {
            if (rightVal.isNull()) {
                return DatabendConstant.createNullConstant();
            } else if (rightVal.isBoolean()) {
                return DatabendConstant.createBooleanConstant((value ? 1 : 0) < (rightVal.asBoolean() ? 1 : 0));
            } else {
                throw new AssertionError(rightVal);
            }
        }

    }

    public static DatabendConstant createStringConstant(String text) {
        return new DatabendStringConstant(text);
    }

    public static DatabendConstant createFloatConstant(double val) {
        return new DatabendFloatConstant(val);
    }

    public static DatabendConstant createIntConstant(long val) {
        return new DatabendIntConstant(val);
    }

    public static DatabendConstant createNullConstant() {
        return new DatabendNullConstant();
    }

    public static DatabendConstant createBooleanConstant(boolean val) {
        return new DatabendBooleanConstant(val);
    }

    public static DatabendConstant createDateConstant(long integer) {
        return new DatabendDateConstant(integer);
    }

    public static DatabendConstant createTimestampConstant(long integer) {
        return new DatabendTimestampConstant(integer);
    }

}
