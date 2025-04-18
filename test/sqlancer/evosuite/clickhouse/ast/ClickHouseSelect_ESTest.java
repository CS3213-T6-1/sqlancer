/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 22:38:24 GMT 2025
 */

package sqlancer.evosuite.clickhouse.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import sqlancer.clickhouse.ast.ClickHouseExpression;
import sqlancer.clickhouse.ast.ClickHouseJoin;
import sqlancer.clickhouse.ast.ClickHouseJoinOnClause;
import sqlancer.clickhouse.ast.ClickHousePostfixText;
import sqlancer.clickhouse.ast.ClickHouseSelect;
import sqlancer.clickhouse.ast.ClickHouseTableReference;
import sqlancer.clickhouse.ast.ClickHouseUnaryPrefixOperation;
import sqlancer.clickhouse.ast.constant.ClickHouseInt32Constant;
import sqlancer.clickhouse.ClickHouseSchema;
import sqlancer.common.ast.JoinBase;

public class ClickHouseSelect_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        clickHouseSelect0.setOrderByClauses((List<ClickHouseExpression>) null);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getOrderByClauses();
        assertNull(list0);
    }

    @Test
    public void test01() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        LinkedList<ClickHouseExpression> linkedList0 = new LinkedList<ClickHouseExpression>();
        linkedList0.add((ClickHouseExpression) clickHouseSelect0);
        clickHouseSelect0.setOrderByClauses(linkedList0);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getOrderByClauses();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test02() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        ClickHouseUnaryPrefixOperation.ClickHouseUnaryPrefixOperator clickHouseUnaryPrefixOperation_ClickHouseUnaryPrefixOperator0 = ClickHouseUnaryPrefixOperation.ClickHouseUnaryPrefixOperator.NOT;
        ClickHouseUnaryPrefixOperation clickHouseUnaryPrefixOperation0 = new ClickHouseUnaryPrefixOperation(
                clickHouseSelect0, clickHouseUnaryPrefixOperation_ClickHouseUnaryPrefixOperator0);
        clickHouseSelect0.setOffsetClause((ClickHouseExpression) clickHouseUnaryPrefixOperation0);
        ClickHouseExpression clickHouseExpression0 = clickHouseSelect0.getOffsetClause();
        assertSame(clickHouseExpression0, clickHouseUnaryPrefixOperation0);
    }

    @Test
    public void test03() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        List<JoinBase<ClickHouseExpression>> linkedList0 = new LinkedList<JoinBase<ClickHouseExpression>>();
        clickHouseSelect0.setJoinClauses(linkedList0);
        List<JoinBase<ClickHouseExpression>> list0 = clickHouseSelect0.getJoinClauses();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test04() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        LinkedList<JoinBase<ClickHouseExpression>> linkedList0 = new LinkedList<JoinBase<ClickHouseExpression>>();
        ClickHouseJoin.JoinType clickHouseExpression_ClickHouseJoin_JoinType0 = ClickHouseJoin.JoinType.INNER;
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                (ClickHouseSchema.ClickHouseTable) null, (String) null);
        ClickHouseJoinOnClause clickHouseExpression_ClickHouseJoinOnClause0 = new ClickHouseJoinOnClause(
                clickHouseSelect0, clickHouseTableReference0);
        ClickHouseJoin clickHouseExpression_ClickHouseJoin0 = new ClickHouseJoin((ClickHouseTableReference) null,
                (ClickHouseTableReference) null, clickHouseExpression_ClickHouseJoin_JoinType0,
                clickHouseExpression_ClickHouseJoinOnClause0);
        linkedList0.add(clickHouseExpression_ClickHouseJoin0);
        clickHouseSelect0.setJoinClauses(linkedList0);
        List<JoinBase<ClickHouseExpression>> list0 = clickHouseSelect0.getJoinClauses();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test05() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        ClickHouseInt32Constant clickHouseInt32Constant0 = new ClickHouseInt32Constant(0L);
        ClickHousePostfixText clickHouseExpression_ClickHousePostfixText0 = new ClickHousePostfixText("Cng*')OvI9h,",
                clickHouseInt32Constant0);
        clickHouseSelect0.setHavingClause((ClickHouseExpression) clickHouseExpression_ClickHousePostfixText0);
        clickHouseSelect0.getHavingClause();
    }

    @Test
    public void test06() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        clickHouseSelect0.setGroupByClause((List<ClickHouseExpression>) null);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getGroupByClause();
        assertNull(list0);
    }

    @Test
    public void test07() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        LinkedList<ClickHouseExpression> linkedList0 = new LinkedList<ClickHouseExpression>();
        clickHouseSelect0.setGroupByClause(linkedList0);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getGroupByClause();
        assertEquals(0, list0.size());
    }

    @Test
    public void test08() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        LinkedList<ClickHouseExpression> linkedList0 = new LinkedList<ClickHouseExpression>();
        linkedList0.add((ClickHouseExpression) clickHouseSelect0);
        clickHouseSelect0.setGroupByClause(linkedList0);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getGroupByClause();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test09() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        LinkedList<ClickHouseExpression> linkedList0 = new LinkedList<ClickHouseExpression>();
        linkedList0.add((ClickHouseExpression) clickHouseSelect0);
        clickHouseSelect0.setFromList(linkedList0);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getFromList();
        assertEquals(1, list0.size());
    }

    @Test
    public void test10() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        clickHouseSelect0.setFetchColumns((List<ClickHouseExpression>) null);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getFetchColumns();
        assertNull(list0);
    }

    @Test
    public void test11() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        LinkedList<ClickHouseExpression> linkedList0 = new LinkedList<ClickHouseExpression>();
        clickHouseSelect0.setFetchColumns(linkedList0);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getFetchColumns();
        assertEquals(0, list0.size());
    }

    @Test
    public void test12() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        LinkedList<ClickHouseExpression> linkedList0 = new LinkedList<ClickHouseExpression>();
        linkedList0.add((ClickHouseExpression) clickHouseSelect0);
        clickHouseSelect0.setFetchColumns(linkedList0);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getFetchColumns();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test13() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        // Undeclared exception!
        try {
            clickHouseSelect0.setFromClause((ClickHouseExpression) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.Objects", e);
        }
    }

    @Test
    public void test14() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        List<ClickHouseExpression> list0 = List.of((ClickHouseExpression) clickHouseSelect0,
                (ClickHouseExpression) clickHouseSelect0, (ClickHouseExpression) clickHouseSelect0,
                (ClickHouseExpression) clickHouseSelect0, (ClickHouseExpression) clickHouseSelect0);
        clickHouseSelect0.setOrderByClauses(list0);
        // Undeclared exception!
        try {
            clickHouseSelect0.asString();
            fail("Expecting exception: StackOverflowError");

        } catch (StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test15() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        clickHouseSelect0.setGroupByClause((List<ClickHouseExpression>) null);
        // Undeclared exception!
        try {
            clickHouseSelect0.asString();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test16() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        ClickHouseExpression clickHouseExpression0 = clickHouseSelect0.getHavingClause();
        assertNull(clickHouseExpression0);
    }

    @Test
    public void test17() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        clickHouseSelect0.setOrderByClauses((List<ClickHouseExpression>) null);
        // Undeclared exception!
        try {
            clickHouseSelect0.getHavingClause();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test18() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        ClickHouseExpression clickHouseExpression0 = clickHouseSelect0.getWhereClause();
        assertNull(clickHouseExpression0);
    }

    @Test
    public void test19() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        ClickHouseSelect.SelectType clickHouseSelect_SelectType0 = clickHouseSelect0.getFromOptions();
        clickHouseSelect0.setFromOptions(clickHouseSelect_SelectType0);
        assertEquals(ClickHouseSelect.SelectType.ALL, clickHouseSelect0.getFromOptions());
    }

    @Test
    public void test20() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        clickHouseSelect0.setOrderByClauses((List<ClickHouseExpression>) null);
        // Undeclared exception!
        try {
            clickHouseSelect0.asString();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test21() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        clickHouseSelect0.setJoinClauses((List<JoinBase<ClickHouseExpression>>) null);
        List<JoinBase<ClickHouseExpression>> list0 = clickHouseSelect0.getJoinClauses();
        assertNull(list0);
    }

    @Test
    public void test22() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        clickHouseSelect0.setFromClause(clickHouseSelect0);
        assertEquals(ClickHouseSelect.SelectType.ALL, clickHouseSelect0.getFromOptions());
    }

    @Test
    public void test23() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        ClickHouseExpression clickHouseExpression0 = clickHouseSelect0.getOffsetClause();
        assertNull(clickHouseExpression0);
    }

    @Test
    public void test24() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        clickHouseSelect0.setWhereClause((ClickHouseExpression) clickHouseSelect0);
        ClickHouseExpression clickHouseExpression0 = clickHouseSelect0.getWhereClause();
        assertSame(clickHouseExpression0, clickHouseSelect0);
    }

    @Test
    public void test25() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        LinkedList<ClickHouseExpression> linkedList0 = new LinkedList<ClickHouseExpression>();
        clickHouseSelect0.setOrderByClauses(linkedList0);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getOrderByClauses();
        assertEquals(0, list0.size());
    }

    @Test
    public void test26() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        clickHouseSelect0.setLimitClause((ClickHouseExpression) clickHouseSelect0);
        ClickHouseExpression clickHouseExpression0 = clickHouseSelect0.getLimitClause();
        assertSame(clickHouseExpression0, clickHouseSelect0);
    }

    @Test
    public void test27() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        String string0 = clickHouseSelect0.asString();
        assertEquals("(SELECT )", string0);
    }

    @Test
    public void test28() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        List<ClickHouseExpression> list0 = clickHouseSelect0.getFromList();
        clickHouseSelect0.setGroupByClause(list0);
        assertEquals(ClickHouseSelect.SelectType.ALL, clickHouseSelect0.getFromOptions());
    }

    @Test
    public void test29() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        LinkedList<ClickHouseExpression> linkedList0 = new LinkedList<ClickHouseExpression>();
        clickHouseSelect0.setFromList(linkedList0);
        List<ClickHouseExpression> list0 = clickHouseSelect0.getFromList();
        assertEquals(0, list0.size());
    }

    @Test
    public void test30() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        ClickHouseExpression clickHouseExpression0 = clickHouseSelect0.getLimitClause();
        assertNull(clickHouseExpression0);
    }

    @Test
    public void test31() throws Throwable {
        ClickHouseSelect clickHouseSelect0 = new ClickHouseSelect();
        ClickHouseSelect.SelectType clickHouseSelect_SelectType0 = clickHouseSelect0.getFromOptions();
        clickHouseSelect0.setSelectType(clickHouseSelect_SelectType0);
        assertEquals(ClickHouseSelect.SelectType.ALL, clickHouseSelect0.getFromOptions());
    }
}
