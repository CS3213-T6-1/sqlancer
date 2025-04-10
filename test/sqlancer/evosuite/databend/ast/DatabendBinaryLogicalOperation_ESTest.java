/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 07 13:19:46 GMT 2025
 */

package sqlancer.evosuite.databend.ast;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import sqlancer.databend.DatabendSchema;
import sqlancer.databend.ast.DatabendBetweenOperation;
import sqlancer.databend.ast.DatabendBinaryLogicalOperation;

import sqlancer.databend.ast.DatabendColumnValue;
import sqlancer.databend.ast.DatabendConstant;
import sqlancer.databend.ast.DatabendExpression;
import sqlancer.databend.ast.DatabendLikeOperation;
import sqlancer.databend.ast.DatabendUnaryPostfixOperation;

public class DatabendBinaryLogicalOperation_ESTest {

    @Test
    public void test00() throws Throwable {
        DatabendSchema.DatabendDataType databendSchema_DatabendDataType0 = DatabendSchema.DatabendDataType.VARCHAR;
        DatabendSchema.DatabendCompositeDataType databendSchema_DatabendCompositeDataType0 = new DatabendSchema.DatabendCompositeDataType(
                databendSchema_DatabendDataType0, 0);
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn("kh;t",
                databendSchema_DatabendCompositeDataType0, false, false);
        DatabendConstant.DatabendNullConstant databendConstant_DatabendNullConstant0 = new DatabendConstant.DatabendNullConstant();
        DatabendColumnValue databendColumnValue0 = DatabendColumnValue.create(databendSchema_DatabendColumn0,
                databendConstant_DatabendNullConstant0);
        DatabendBetweenOperation databendBetweenOperation0 = new DatabendBetweenOperation(databendColumnValue0,
                databendColumnValue0, databendColumnValue0, false);
        DatabendConstant databendConstant0 = databendBetweenOperation0.getExpectedValue();
        assertFalse(databendConstant0.isString());
    }

    @Test
    public void test01() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
                .getRandom();
        DatabendConstant.DatabendIntConstant databendConstant_DatabendIntConstant0 = new DatabendConstant.DatabendIntConstant(
                (-129L));
        DatabendConstant databendConstant0 = databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0
                .apply(databendConstant_DatabendIntConstant0, databendConstant_DatabendIntConstant0);
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                databendConstant0, databendConstant0, databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        DatabendConstant.DatabendBooleanConstant databendConstant_DatabendBooleanConstant0 = (DatabendConstant.DatabendBooleanConstant) databendBinaryLogicalOperation0
                .getRightExpr();
        assertTrue(databendConstant_DatabendBooleanConstant0.asBoolean());
    }

    // @Test
    // public void test02() throws Throwable {
    // DatabendSchema.DatabendColumn[] databendSchema_DatabendColumnArray0 = new DatabendSchema.DatabendColumn[9];
    // List<DatabendSchema.DatabendColumn> list0 = Randomly.subset((-2624), databendSchema_DatabendColumnArray0);
    // DatabendSchema.DatabendTable databendSchema_DatabendTable0 = new DatabendSchema.DatabendTable(
    // "/yLd0RP-6G6Kn5MB", list0, false);
    // DatabendTableReference databendTableReference0 = new DatabendTableReference(databendSchema_DatabendTable0);
    // DatabendJoin databendJoin0 = DatabendJoin.createLeftOuterJoin(databendTableReference0, databendTableReference0,
    // databendTableReference0);
    // DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
    // databendJoin0, databendTableReference0,
    // (DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator) null);
    // databendBinaryLogicalOperation0.getOp();
    // }

    @Test
    public void test03() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
                .getRandom();
        DatabendConstant.DatabendFloatConstant databendConstant_DatabendFloatConstant0 = new DatabendConstant.DatabendFloatConstant(
                0.0);
        DatabendUnaryPostfixOperation.DatabendUnaryPostfixOperator databendUnaryPostfixOperation_DatabendUnaryPostfixOperator0 = DatabendUnaryPostfixOperation.DatabendUnaryPostfixOperator.IS_NULL;
        DatabendUnaryPostfixOperation databendUnaryPostfixOperation0 = new DatabendUnaryPostfixOperation(
                databendConstant_DatabendFloatConstant0, databendUnaryPostfixOperation_DatabendUnaryPostfixOperator0);
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                (DatabendExpression) null, databendUnaryPostfixOperation0,
                databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        DatabendExpression databendExpression0 = databendBinaryLogicalOperation0.getLeftExpr();
        assertNull(databendExpression0);
    }

    @Test
    public void test04() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
                .getRandom();
        DatabendSchema.DatabendDataType databendSchema_DatabendDataType0 = DatabendSchema.DatabendDataType.BOOLEAN;
        DatabendSchema.DatabendCompositeDataType databendSchema_DatabendCompositeDataType0 = new DatabendSchema.DatabendCompositeDataType(
                databendSchema_DatabendDataType0, 0);
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn(
                "Asia/Kathmandu", databendSchema_DatabendCompositeDataType0, true, false);
        DatabendConstant databendConstant0 = DatabendConstant.createFloatConstant(1.0);
        DatabendColumnValue databendColumnValue0 = new DatabendColumnValue(databendSchema_DatabendColumn0,
                databendConstant0);
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(databendColumnValue0,
                databendColumnValue0, databendLikeOperation_DatabendLikeOperator0);
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                databendLikeOperation0, databendConstant0,
                databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        // Undeclared exception!
        try {
            databendBinaryLogicalOperation0.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // sqlancer.databend.ast.DatabendConstant$DatabendFloatConstant@0000000003
            //
            verifyException("sqlancer.DatabendDorisPrestoConstant", e);
        }
    }

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test05() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator.OR;
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                (DatabendExpression) null, (DatabendExpression) null,
                databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        // Undeclared exception!
        try {
            databendBinaryLogicalOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.databend.ast.DatabendBinaryLogicalOperation", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
                .getRandom();
        DatabendSchema.DatabendCompositeDataType databendSchema_DatabendCompositeDataType0 = DatabendSchema.DatabendCompositeDataType
                .getRandomWithoutNull();
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn("",
                databendSchema_DatabendCompositeDataType0, true, true);
        DatabendConstant databendConstant0 = DatabendConstant.createStringConstant("Europe/Samara");
        DatabendColumnValue databendColumnValue0 = DatabendColumnValue.create(databendSchema_DatabendColumn0,
                databendConstant0);
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                databendColumnValue0, databendColumnValue0,
                databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        // Undeclared exception!
        try {
            databendBinaryLogicalOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // string: Europe/Samara, cannot be forced to boolean
            //
        }
    }

    @Test
    public void test07() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
                .getRandom();
        DatabendConstant.DatabendIntConstant databendConstant_DatabendIntConstant0 = new DatabendConstant.DatabendIntConstant(
                (-129L));
        DatabendConstant databendConstant0 = databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0
                .apply(databendConstant_DatabendIntConstant0, databendConstant_DatabendIntConstant0);
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                databendConstant0, (DatabendExpression) null,
                databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        DatabendExpression databendExpression0 = databendBinaryLogicalOperation0.getRightExpr();
        assertNull(databendExpression0);
    }

    // @Test
    // public void test08() throws Throwable {
    // DatabendSchema.DatabendColumn[] databendSchema_DatabendColumnArray0 = new DatabendSchema.DatabendColumn[0];
    // List<DatabendSchema.DatabendColumn> list0 = Randomly.subset((-387), databendSchema_DatabendColumnArray0);
    // DatabendSchema.DatabendTable databendSchema_DatabendTable0 = new DatabendSchema.DatabendTable("", list0, false);
    // DatabendTableReference databendTableReference0 = new DatabendTableReference(databendSchema_DatabendTable0);
    // DatabendJoin databendJoin0 = DatabendJoin.createLeftOuterJoin(databendTableReference0, databendTableReference0,
    // databendTableReference0);
    // DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
    // databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 =
    // DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator.AND;
    // DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
    // databendJoin0, databendTableReference0, databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
    // DatabendExpression databendExpression0 = databendBinaryLogicalOperation0.getLeftExpr();
    // assertSame(databendJoin0, databendExpression0);
    // }

    @Test
    public void test09() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
                .getRandom();
        DatabendConstant.DatabendNullConstant databendConstant_DatabendNullConstant0 = new DatabendConstant.DatabendNullConstant();
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                databendConstant_DatabendNullConstant0, databendConstant_DatabendNullConstant0,
                databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator1 = databendBinaryLogicalOperation0
                .getOp();
        assertSame(databendBinaryLogicalOperation_DatabendBinaryLogicalOperator1,
                databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
    }

    @Test
    public void test10() throws Throwable {
        DatabendConstant.DatabendNullConstant databendConstant_DatabendNullConstant0 = new DatabendConstant.DatabendNullConstant();
        DatabendConstant.DatabendIntConstant databendConstant_DatabendIntConstant0 = new DatabendConstant.DatabendIntConstant(
                1000L);
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator.OR;
        DatabendConstant.DatabendBooleanConstant databendConstant_DatabendBooleanConstant0 = (DatabendConstant.DatabendBooleanConstant) databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0
                .apply(databendConstant_DatabendNullConstant0, databendConstant_DatabendIntConstant0);
        assertTrue(databendConstant_DatabendBooleanConstant0.getValue());
    }

    @Test
    public void test11() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator.OR;
        DatabendConstant.DatabendFloatConstant databendConstant_DatabendFloatConstant0 = new DatabendConstant.DatabendFloatConstant(
                0.0);
        DatabendConstant databendConstant0 = databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0
                .apply(databendConstant_DatabendFloatConstant0, databendConstant_DatabendFloatConstant0);
        assertEquals("false", databendConstant0.toString());
    }

    @Test
    public void test12() throws Throwable {
        DatabendConstant databendConstant0 = DatabendConstant.createBooleanConstant(true);
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator.OR;
        DatabendConstant databendConstant1 = databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0
                .apply(databendConstant0, databendConstant0);
        assertEquals("true", databendConstant1.toString());
    }

    @Test
    public void test13() throws Throwable {
        DatabendSchema.DatabendDataType databendSchema_DatabendDataType0 = DatabendSchema.DatabendDataType.NULL;
        DatabendSchema.DatabendCompositeDataType databendSchema_DatabendCompositeDataType0 = new DatabendSchema.DatabendCompositeDataType(
                databendSchema_DatabendDataType0, 1);
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn("",
                databendSchema_DatabendCompositeDataType0, false, false);
        DatabendConstant.DatabendNullConstant databendConstant_DatabendNullConstant0 = new DatabendConstant.DatabendNullConstant();
        DatabendColumnValue databendColumnValue0 = DatabendColumnValue.create(databendSchema_DatabendColumn0,
                databendConstant_DatabendNullConstant0);
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator.OR;
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                databendColumnValue0, databendColumnValue0,
                databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        DatabendConstant databendConstant0 = databendBinaryLogicalOperation0.getExpectedValue();
        assertFalse(databendConstant0.isBoolean());
    }

    @Test
    public void test14() throws Throwable {
        DatabendConstant databendConstant0 = DatabendConstant.createNullConstant();
        DatabendConstant.DatabendBooleanConstant databendConstant_DatabendBooleanConstant0 = new DatabendConstant.DatabendBooleanConstant(
                false);
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator.OR;
        DatabendConstant databendConstant1 = databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0
                .apply(databendConstant_DatabendBooleanConstant0, databendConstant0);
        assertFalse(databendConstant1.equals((Object) databendConstant0));
    }

    @Test
    public void test15() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
                .getRandom();
        DatabendConstant.DatabendNullConstant databendConstant_DatabendNullConstant0 = new DatabendConstant.DatabendNullConstant();
        DatabendConstant.DatabendIntConstant databendConstant_DatabendIntConstant0 = new DatabendConstant.DatabendIntConstant(
                (-1508L));
        DatabendConstant databendConstant0 = databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0
                .apply(databendConstant_DatabendIntConstant0, databendConstant_DatabendNullConstant0);
        assertFalse(databendConstant0.isString());
    }

    @Test
    public void test16() throws Throwable {
        DatabendSchema.DatabendDataType databendSchema_DatabendDataType0 = DatabendSchema.DatabendDataType.FLOAT;
        DatabendSchema.DatabendCompositeDataType databendSchema_DatabendCompositeDataType0 = new DatabendSchema.DatabendCompositeDataType(
                databendSchema_DatabendDataType0, 4357);
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn("RPAD2",
                databendSchema_DatabendCompositeDataType0, true, false);
        DatabendConstant.DatabendIntConstant databendConstant_DatabendIntConstant0 = new DatabendConstant.DatabendIntConstant(
                (-1399L));
        DatabendConstant databendConstant0 = DatabendConstant.createIntConstant((-1125L));
        DatabendConstant databendConstant1 = databendConstant_DatabendIntConstant0.isEquals(databendConstant0);
        DatabendColumnValue databendColumnValue0 = DatabendColumnValue.create(databendSchema_DatabendColumn0,
                databendConstant1);
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator.AND;
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                databendColumnValue0, databendColumnValue0,
                databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        DatabendConstant databendConstant2 = databendBinaryLogicalOperation0.getExpectedValue();
        assertNotNull(databendConstant2);
        assertEquals("false", databendConstant2.toString());
    }

    @Test
    public void test17() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
                .getRandom();
        DatabendConstant.DatabendNullConstant databendConstant_DatabendNullConstant0 = new DatabendConstant.DatabendNullConstant();
        DatabendConstant.DatabendIntConstant databendConstant_DatabendIntConstant0 = new DatabendConstant.DatabendIntConstant(
                0L);
        DatabendConstant.DatabendBooleanConstant databendConstant_DatabendBooleanConstant0 = (DatabendConstant.DatabendBooleanConstant) databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0
                .apply(databendConstant_DatabendNullConstant0, databendConstant_DatabendIntConstant0);
        assertFalse(databendConstant_DatabendBooleanConstant0.getValue());
    }

    // @Test
    // public void test18() throws Throwable {
    // DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
    // databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 =
    // DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
    // .getRandom();
    // DatabendConstant.DatabendNullConstant databendConstant_DatabendNullConstant0 = new
    // DatabendConstant.DatabendNullConstant();
    // DatabendConstant.DatabendFloatConstant databendConstant_DatabendFloatConstant0 = new
    // DatabendConstant.DatabendFloatConstant(
    // (-1.0));
    // DatabendConstant databendConstant0 = databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0
    // .apply(databendConstant_DatabendNullConstant0, databendConstant_DatabendFloatConstant0);
    // assertEquals("NULL", databendConstant0.toString());
    // }

    @Test
    public void test19() throws Throwable {
        DatabendConstant databendConstant0 = DatabendConstant.createNullConstant();
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator.OR;
        DatabendColumnValue databendColumnValue0 = DatabendColumnValue.create((DatabendSchema.DatabendColumn) null,
                databendConstant0);
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                databendColumnValue0, databendConstant0, databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        DatabendConstant databendConstant1 = databendBinaryLogicalOperation0.getExpectedValue();
        assertNull(databendConstant1);
    }

    // @Test
    // public void test20() throws Throwable {
    // DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
    // databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 =
    // DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
    // .getRandom();
    // String string0 = databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0.getTextRepresentation();
    // assertEquals("and", string0);
    // }
    //
    // @Test
    // public void test21() throws Throwable {
    // DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
    // databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 =
    // DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
    // .getRandom();
    // DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
    // databendBinaryLogicalOperation_DatabendBinaryLogicalOperator1 =
    // databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0
    // .getRandomOp();
    // assertFalse(databendBinaryLogicalOperation_DatabendBinaryLogicalOperator1
    // .equals((Object) databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0));
    // }

    @Test
    public void test22() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
                .getRandom();
        DatabendConstant databendConstant0 = DatabendConstant.createNullConstant();
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                databendConstant0, databendConstant0, databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        DatabendSchema.DatabendDataType databendSchema_DatabendDataType0 = databendBinaryLogicalOperation0
                .getExpectedType();
        assertEquals(DatabendSchema.DatabendDataType.BOOLEAN, databendSchema_DatabendDataType0);
    }

    @Test
    public void test23() throws Throwable {
        DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0 = DatabendBinaryLogicalOperation.DatabendBinaryLogicalOperator
                .getRandom();
        DatabendConstant databendConstant0 = DatabendConstant.createNullConstant();
        DatabendBinaryLogicalOperation databendBinaryLogicalOperation0 = new DatabendBinaryLogicalOperation(
                databendConstant0, databendConstant0, databendBinaryLogicalOperation_DatabendBinaryLogicalOperator0);
        DatabendConstant databendConstant1 = databendBinaryLogicalOperation0.getExpectedValue();
        assertNull(databendConstant1);
    }
}
