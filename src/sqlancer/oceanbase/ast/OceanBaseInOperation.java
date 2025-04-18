package sqlancer.oceanbase.ast;

import java.util.List;

import sqlancer.common.schema.AbstractInOperation;

public class OceanBaseInOperation implements OceanBaseExpression, AbstractInOperation<OceanBaseExpression> {

    private final OceanBaseExpression expr;
    private final List<OceanBaseExpression> listElements;
    private final boolean isTrue;

    public OceanBaseInOperation(OceanBaseExpression expr, List<OceanBaseExpression> listElements, boolean isTrue) {
        this.expr = expr;
        this.listElements = listElements;
        this.isTrue = isTrue;
    }

    @Override
    public OceanBaseExpression getExpr() {
        return expr;
    }

    @Override
    public List<OceanBaseExpression> getListElements() {
        return listElements;
    }

    @Override
    public OceanBaseConstant getExpectedValue() {
        OceanBaseConstant leftVal = expr.getExpectedValue();
        if (leftVal.isNull()) {
            return OceanBaseConstant.createNullConstant();
        }
        boolean isNull = false;
        for (OceanBaseExpression rightExpr : listElements) {
            OceanBaseConstant rightVal = rightExpr.getExpectedValue();

            OceanBaseConstant convertedRightVal = rightVal;
            OceanBaseConstant isEquals = leftVal.isEquals(convertedRightVal);
            if (isEquals.isNull()) {
                isNull = true;
            } else {
                if (isEquals.getInt() == 1) {
                    return OceanBaseConstant.createBoolean(isTrue);
                }
            }
        }
        if (isNull) {
            return OceanBaseConstant.createNullConstant();
        } else {
            return OceanBaseConstant.createBoolean(!isTrue);
        }

    }

    @Override
    public boolean isTrue() {
        return isTrue;
    }
}
