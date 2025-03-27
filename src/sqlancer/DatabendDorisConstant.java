package sqlancer;

public class DatabendDorisConstant {

    public boolean isNull() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isBoolean() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public boolean isFloat() {
        return false;
    }

    public boolean asBoolean() {
        throw new UnsupportedOperationException(this.toString());

    }

    public long asInt() {
        throw new UnsupportedOperationException(this.toString());
    }

    public String asString() {
        throw new UnsupportedOperationException(this.toString());
    }

    public double asFloat() {
        throw new UnsupportedOperationException(this.toString());
    }

}
