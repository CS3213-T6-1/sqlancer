package sqlancer.yugabyte.ysql.ast;

import sqlancer.common.ast.BinaryNode;
import sqlancer.yugabyte.ysql.YSQLSchema.YSQLDataType;

public class YSQLConcatOperation extends BinaryNode<YSQLExpression> implements YSQLExpression {

    public YSQLConcatOperation(YSQLExpression left, YSQLExpression right) {
        super(left, right);
    }

    @Override
    public YSQLDataType getExpressionType() {
        return YSQLDataType.TEXT;
    }

    @Override
    public YSQLConstant getExpectedValue() {
        try {
            // Get expected values with null checks
            YSQLConstant leftExpectedValue = getLeft() != null ? getLeft().getExpectedValue() : null;
            YSQLConstant rightExpectedValue = getRight() != null ? getRight().getExpectedValue() : null;

            if (leftExpectedValue == null || rightExpectedValue == null) {
                return null;
            }

            if (leftExpectedValue.isNull() || rightExpectedValue.isNull()) {
                return YSQLConstant.createNullConstant();
            }

            // Add null checks for cast results
            YSQLConstant leftCast = leftExpectedValue.cast(YSQLDataType.TEXT);
            YSQLConstant rightCast = rightExpectedValue.cast(YSQLDataType.TEXT);

            if (leftCast == null || rightCast == null) {
                return null;
            }

            String leftStr = leftCast.getUnquotedTextRepresentation();
            String rightStr = rightCast.getUnquotedTextRepresentation();

            if (leftStr == null || rightStr == null) {
                return null;
            }

            return YSQLConstant.createTextConstant(leftStr + rightStr);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String getOperatorRepresentation() {
        return "||";
    }

}
