package sqlancer.clickhouse.ast.constant;

import com.clickhouse.client.ClickHouseDataType;

import sqlancer.clickhouse.ast.ClickHouseNumericConstant;

public class ClickHouseUInt16Constant extends ClickHouseNumericConstant<Long> {

    public ClickHouseUInt16Constant(long value) {
        super(value);
    }

    @Override
    public ClickHouseDataType getDataType() {
        return ClickHouseDataType.UInt16;
    }

    @Override
    public boolean compareInternal(Object val) {
        return value == (long) val;
    }

    @Override
    public long asInt() {
        return value;
    }

}
