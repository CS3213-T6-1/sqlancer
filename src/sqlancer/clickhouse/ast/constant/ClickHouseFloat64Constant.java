package sqlancer.clickhouse.ast.constant;

import com.clickhouse.client.ClickHouseDataType;

import sqlancer.SQLConstantUtils;
import sqlancer.clickhouse.ast.ClickHouseNumericConstant;

public class ClickHouseFloat64Constant extends ClickHouseNumericConstant<Double> {

    public ClickHouseFloat64Constant(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return SQLConstantUtils.clickhouseFloatToString(value);
    }

    @Override
    public boolean compareInternal(Object val) {
        return Double.compare(value, (double) val) == 0;
    }

    @Override
    public boolean asBooleanNotNull() {
        return Double.compare(value, 0.0) == 0;
    }

    @Override
    public ClickHouseDataType getDataType() {
        return ClickHouseDataType.Float64;
    }

    @Override
    public double asDouble() {
        return value;
    }
}
