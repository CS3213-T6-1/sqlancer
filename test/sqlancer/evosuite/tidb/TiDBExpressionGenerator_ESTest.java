/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 19:02:54 GMT 2025
 */

package sqlancer.evosuite.tidb;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import sqlancer.common.schema.AbstractTables;
import sqlancer.tidb.ast.TiDBBinaryLogicalOperation;
import sqlancer.tidb.ast.TiDBExpression;
import sqlancer.tidb.ast.TiDBJoin;
import sqlancer.tidb.ast.TiDBSelect;
import sqlancer.tidb.ast.TiDBUnaryPostfixOperation;
import sqlancer.tidb.ast.TiDBUnaryPrefixOperation;
import sqlancer.tidb.TiDBExpressionGenerator;
import sqlancer.tidb.TiDBProvider;
import sqlancer.tidb.TiDBSchema;

public class TiDBExpressionGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSelect tiDBSelect0 = tiDBExpressionGenerator0.generateSelect();
        boolean boolean0 = tiDBExpressionGenerator0.mutateJoin(tiDBSelect0);
        assertFalse(boolean0);
    }

    // @Test
    // public void test01() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBSelect tiDBSelect0 = new TiDBSelect();
    // tiDBSelect0.setWhereClause(tiDBSelect0);
    // tiDBExpressionGenerator0.generateConstant();
    // boolean boolean0 = tiDBExpressionGenerator0.mutate(tiDBSelect0);
    // assertTrue(boolean0);
    // }

    @Test
    public void test02() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        LinkedList<TiDBSchema.TiDBTable> linkedList0 = new LinkedList<TiDBSchema.TiDBTable>();
        AbstractTables<TiDBSchema.TiDBTable, TiDBSchema.TiDBColumn> abstractTables0 = new AbstractTables<TiDBSchema.TiDBTable, TiDBSchema.TiDBColumn>(
                linkedList0);
        TiDBExpressionGenerator tiDBExpressionGenerator1 = tiDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        List<TiDBExpression> list0 = tiDBExpressionGenerator1.getTableRefs();
        assertEquals(0, list0.size());
    }

    // @Test
    // public void test03() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.CHAR;
    // TiDBSchema.TiDBCompositeDataType tiDBSchema_TiDBCompositeDataType0 = new TiDBSchema.TiDBCompositeDataType(
    // tiDBSchema_TiDBDataType0, 14);
    // TiDBSchema.TiDBColumn tiDBSchema_TiDBColumn0 = new TiDBSchema.TiDBColumn(
    // "sqlancer.tidb.TiDBSchema$TiDBCompositeDataType", tiDBSchema_TiDBCompositeDataType0, true, true, true);
    // List<TiDBSchema.TiDBColumn> list0 = List.of(tiDBSchema_TiDBColumn0, tiDBSchema_TiDBColumn0,
    // tiDBSchema_TiDBColumn0, tiDBSchema_TiDBColumn0, tiDBSchema_TiDBColumn0, tiDBSchema_TiDBColumn0,
    // tiDBSchema_TiDBColumn0, tiDBSchema_TiDBColumn0);
    // tiDBExpressionGenerator0.setColumns(list0);
    // List<TiDBExpression> list1 = tiDBExpressionGenerator0.generateFetchColumns(true);
    // assertEquals(1, list1.size());
    // }

    @Test
    public void test04() throws Throwable {
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(
                (TiDBProvider.TiDBGlobalState) null);
        TiDBSchema.TiDBCompositeDataType tiDBSchema_TiDBCompositeDataType0 = TiDBSchema.TiDBCompositeDataType.getInt(4);
        TiDBSchema.TiDBColumn tiDBSchema_TiDBColumn0 = new TiDBSchema.TiDBColumn("", tiDBSchema_TiDBCompositeDataType0,
                false, true, false);
        List<TiDBSchema.TiDBColumn> list0 = List.of(tiDBSchema_TiDBColumn0, tiDBSchema_TiDBColumn0,
                tiDBSchema_TiDBColumn0, tiDBSchema_TiDBColumn0);
        tiDBExpressionGenerator0.setColumns(list0);
        TiDBExpression tiDBExpression0 = tiDBExpressionGenerator0.generateColumn();
        assertNotNull(tiDBExpression0);
    }

    @Test
    public void test05() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0
                    .setTablesAndColumns((AbstractTables<TiDBSchema.TiDBTable, TiDBSchema.TiDBColumn>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.mutateJoin((TiDBSelect) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.mutateHaving((TiDBSelect) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.mutate((TiDBSelect) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateOrderBys();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test10() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        LinkedList<TiDBSchema.TiDBColumn> linkedList0 = new LinkedList<TiDBSchema.TiDBColumn>();
        tiDBExpressionGenerator0.setColumns((List<TiDBSchema.TiDBColumn>) linkedList0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateFetchColumns(true);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test11() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateExpression(3);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test12() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSelect tiDBSelect0 = tiDBExpressionGenerator0.generateSelect();
        TiDBJoin.NaturalJoinType tiDBJoin_NaturalJoinType0 = TiDBJoin.NaturalJoinType.RIGHT;
        TiDBJoin tiDBJoin0 = TiDBJoin.createNaturalJoin(tiDBSelect0, tiDBSelect0, tiDBJoin_NaturalJoinType0);
        tiDBSelect0.setHint(tiDBJoin0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateExplainQuery(tiDBSelect0);
            fail("Expecting exception: StackOverflowError");

        } catch (StackOverflowError e) {
        }
    }

    @Test
    public void test13() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateExplainQuery((TiDBSelect) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test14() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        LinkedList<TiDBSchema.TiDBColumn> linkedList0 = new LinkedList<TiDBSchema.TiDBColumn>();
        tiDBExpressionGenerator0.setColumns((List<TiDBSchema.TiDBColumn>) linkedList0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateColumn();
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            verifyException("java.util.LinkedList", e);
        }
    }

    @Test
    public void test15() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        List<TiDBSchema.TiDBColumn> list0 = List.of();
        tiDBExpressionGenerator0.setColumns(list0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateColumn();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    // @Test
    // public void test16() throws Throwable {
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(
    // (TiDBProvider.TiDBGlobalState) null);
    // TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.INT;
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant(tiDBSchema_TiDBDataType0);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    // @Test
    // public void test17() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBSelect tiDBSelect0 = new TiDBSelect();
    // tiDBExpressionGenerator0.mutate(tiDBSelect0);
    // TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.INT;
    // TiDBConstant.TiDBNullConstant tiDBConstant_TiDBNullConstant0 = (TiDBConstant.TiDBNullConstant)
    // tiDBExpressionGenerator0
    // .generateConstant(tiDBSchema_TiDBDataType0);
    // assertEquals("NULL", tiDBConstant_TiDBNullConstant0.toString());
    // }

    @Test
    public void test18() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSelect tiDBSelect0 = tiDBExpressionGenerator0.generateSelect();
        tiDBSelect0.setWhereClause(tiDBSelect0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.mutateOr(tiDBSelect0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test19() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.mutateAnd(tiDBSelect0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test20() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.mutateHaving(tiDBSelect0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test21() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        TiDBBinaryLogicalOperation.TiDBBinaryLogicalOperator tiDBBinaryLogicalOperation_TiDBBinaryLogicalOperator0 = TiDBBinaryLogicalOperation.TiDBBinaryLogicalOperator.AND;
        TiDBBinaryLogicalOperation tiDBBinaryLogicalOperation0 = new TiDBBinaryLogicalOperation(tiDBSelect0,
                tiDBSelect0, tiDBBinaryLogicalOperation_TiDBBinaryLogicalOperator0);
        tiDBSelect0.setWhereClause(tiDBBinaryLogicalOperation0);
        tiDBExpressionGenerator0.mutateWhere(tiDBSelect0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.mutateOr(tiDBSelect0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test22() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSelect tiDBSelect0 = tiDBExpressionGenerator0.generateSelect();
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.mutateWhere(tiDBSelect0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    // @Test
    // public void test23() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBSelect tiDBSelect0 = tiDBExpressionGenerator0.generateSelect();
    // TiDBBugs.bug51525 = false;
    // boolean boolean0 = tiDBExpressionGenerator0.mutate(tiDBSelect0);
    // assertFalse(boolean0);
    // }
    //
    // @Test
    // public void test24() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBBugs.bug38319 = false;
    // TiDBSelect tiDBSelect0 = tiDBExpressionGenerator0.generateSelect();
    // boolean boolean0 = tiDBExpressionGenerator0.mutate(tiDBSelect0);
    // assertFalse(boolean0);
    // }

    // @Test
    // public void test25() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateFetchColumns(true);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.Randomly", e);
    // }
    // }

    @Test
    public void test26() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateFetchColumns(false);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.Randomly", e);
        }
    }

    // @Test
    // public void test27() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.BLOB;
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant(tiDBSchema_TiDBDataType0);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    @Test
    public void test28() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.NUMERIC;
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateConstant(tiDBSchema_TiDBDataType0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    // @Test
    // public void test29() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.DECIMAL;
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant(tiDBSchema_TiDBDataType0);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    // @Test
    // public void test30() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.CHAR;
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant(tiDBSchema_TiDBDataType0);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    // @Test
    // public void test31() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.FLOATING;
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant(tiDBSchema_TiDBDataType0);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    @Test
    public void test32() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.TEXT;
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateConstant(tiDBSchema_TiDBDataType0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    // @Test
    // public void test33() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBSchema.TiDBDataType tiDBSchema_TiDBDataType0 = TiDBSchema.TiDBDataType.BOOL;
    // TiDBConstant.TiDBBooleanConstant tiDBConstant_TiDBBooleanConstant0 = (TiDBConstant.TiDBBooleanConstant)
    // tiDBExpressionGenerator0
    // .generateConstant(tiDBSchema_TiDBDataType0);
    // assertEquals("false", tiDBConstant_TiDBBooleanConstant0.toString());
    // }

    // @Test
    // public void test34() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBSelect tiDBSelect0 = new TiDBSelect();
    // boolean boolean0 = tiDBExpressionGenerator0.mutate(tiDBSelect0);
    // boolean boolean1 = tiDBExpressionGenerator0.mutateLimit(tiDBSelect0);
    // assertTrue(boolean1 == boolean0);
    //
    // boolean boolean2 = tiDBExpressionGenerator0.mutateLimit(tiDBSelect0);
    // assertTrue(boolean2);
    // }

    @Test
    public void test35() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.mutateLimit(tiDBSelect0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    // @Test
    // public void test36() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant();
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    // @Test
    // public void test37() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant();
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    // @Test
    // public void test38() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant();
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    @Test
    public void test39() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateConstant();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    // @Test
    // public void test40() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBConstant.TiDBBooleanConstant tiDBConstant_TiDBBooleanConstant0 = (TiDBConstant.TiDBBooleanConstant)
    // tiDBExpressionGenerator0
    // .generateConstant();
    // assertFalse(tiDBConstant_TiDBBooleanConstant0.getValue());
    // }
    //
    // @Test
    // public void test41() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // tiDBExpressionGenerator0.generateLeafNode();
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant();
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    // @Test
    // public void test42() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant();
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    // @Test
    // public void test43() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // TiDBExpression tiDBExpression0 = tiDBExpressionGenerator0.generateConstant();
    // TiDBSelect tiDBSelect0 = new TiDBSelect();
    // tiDBSelect0.setWhereClause(tiDBExpression0);
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.mutateAnd(tiDBSelect0);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    // @Test
    // public void test44() throws Throwable {
    // TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
    // TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
    // // Undeclared exception!
    // try {
    // tiDBExpressionGenerator0.generateConstant();
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
    // }
    // }

    @Test
    public void test45() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.getTableRefs();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test46() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateBooleanExpression();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test47() throws Throwable {
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(
                (TiDBProvider.TiDBGlobalState) null);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateColumn();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.Randomly", e);
        }
    }

    @Test
    public void test48() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.getRandomJoinClauses();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.tidb.TiDBExpressionGenerator", e);
        }
    }

    @Test
    public void test49() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBSelect tiDBSelect0 = tiDBExpressionGenerator0.generateSelect();
        // Undeclared exception!
        try {
            tiDBExpressionGenerator0.generateExplainQuery(tiDBSelect0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test50() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        LinkedList<TiDBSchema.TiDBTable> linkedList0 = new LinkedList<TiDBSchema.TiDBTable>();
        AbstractTables<TiDBSchema.TiDBTable, TiDBSchema.TiDBColumn> abstractTables0 = new AbstractTables<TiDBSchema.TiDBTable, TiDBSchema.TiDBColumn>(
                linkedList0);
        TiDBExpressionGenerator tiDBExpressionGenerator1 = tiDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        List<TiDBJoin> list0 = tiDBExpressionGenerator1.getRandomJoinClauses();
        assertEquals(0, list0.size());
    }

    @Test
    public void test51() throws Throwable {
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(
                (TiDBProvider.TiDBGlobalState) null);
        TiDBUnaryPostfixOperation tiDBUnaryPostfixOperation0 = (TiDBUnaryPostfixOperation) tiDBExpressionGenerator0
                .isNull((TiDBExpression) tiDBSelect0);
        assertEquals("IS NULL", tiDBUnaryPostfixOperation0.getOperatorRepresentation());
    }

    @Test
    public void test52() throws Throwable {
        TiDBProvider.TiDBGlobalState tiDBProvider_TiDBGlobalState0 = new TiDBProvider.TiDBGlobalState();
        TiDBSelect tiDBSelect0 = new TiDBSelect();
        TiDBExpressionGenerator tiDBExpressionGenerator0 = new TiDBExpressionGenerator(tiDBProvider_TiDBGlobalState0);
        TiDBUnaryPrefixOperation tiDBUnaryPrefixOperation0 = (TiDBUnaryPrefixOperation) tiDBExpressionGenerator0
                .negatePredicate((TiDBExpression) tiDBSelect0);
        assertEquals("NOT", tiDBUnaryPrefixOperation0.getOperatorRepresentation());
    }
}
