package sqlancer.mysql.ast;

import sqlancer.common.schema.AbstractPostfixOperation;

public class MySQLUnaryPostfixOperation implements MySQLExpression, AbstractPostfixOperation<MySQLExpression> {

    private final MySQLExpression expression;
    private final UnaryPostfixOperator operator;
    private boolean negate;

    public enum UnaryPostfixOperator {
        IS_NULL, IS_TRUE, IS_FALSE;
    }

    public MySQLUnaryPostfixOperation(MySQLExpression expr, UnaryPostfixOperator op, boolean negate) {
        this.expression = expr;
        this.operator = op;
        this.setNegate(negate);
    }

    @Override
    public MySQLExpression getExpression() {
        return expression;
    }

    @Override
    public UnaryPostfixOperator getOperator() {
        return operator;
    }

    @Override
    public boolean isNegated() {
        return negate;
    }

    public void setNegate(boolean negate) {
        this.negate = negate;
    }

    @Override
    public MySQLConstant getExpectedValue() {
        boolean val;
        MySQLConstant expectedValue = expression.getExpectedValue();
        switch (operator) {
        case IS_NULL:
            val = expectedValue.isNull();
            break;
        case IS_FALSE:
            val = !expectedValue.isNull() && !expectedValue.asBooleanNotNull();
            break;
        case IS_TRUE:
            val = !expectedValue.isNull() && expectedValue.asBooleanNotNull();
            break;
        default:
            throw new AssertionError(operator);
        }
        if (negate) {
            val = !val;
        }
        return MySQLConstant.createIntConstant(val ? 1 : 0);
    }

}
