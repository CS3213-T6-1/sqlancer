/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 07 13:52:13 GMT 2025
 */

package sqlancer.evosuite.doris.oracle.tlp;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import sqlancer.common.gen.ExpressionGenerator;
import sqlancer.doris.DorisProvider;
import sqlancer.doris.DorisSchema;
import sqlancer.doris.ast.DorisExpression;
import sqlancer.doris.ast.DorisSelect;
import sqlancer.doris.oracle.tlp.DorisQueryPartitioningBase;

public class DorisQueryPartitioningBase_ESTest {

    // @Test
    // public void test0() throws Throwable {
    // DorisQueryPartitioningBase dorisQueryPartitioningBase0 = new DorisQueryPartitioningBase(
    // (DorisProvider.DorisGlobalState) null);
    // DorisSelect dorisSelect0 = new DorisSelect();
    // DorisExpression[] dorisExpressionArray0 = new DorisExpression[4];
    // dorisExpressionArray0[1] = (DorisExpression) dorisSelect0;
    // List<DorisExpression> list0 = Randomly.nonEmptySubset(dorisExpressionArray0);
    // dorisSelect0.setFetchColumns(list0);
    // // Undeclared exception!
    // try {
    // dorisQueryPartitioningBase0.getQueryStrings(dorisSelect0);
    // fail("Expecting exception: StackOverflowError");
    //
    // } catch (StackOverflowError e) {
    // }
    // }

    @Test
    public void test1() throws Throwable {
        DorisQueryPartitioningBase dorisQueryPartitioningBase0 = new DorisQueryPartitioningBase(
                (DorisProvider.DorisGlobalState) null);
        DorisSelect dorisSelect0 = new DorisSelect();
        // Undeclared exception!
        try {
            dorisQueryPartitioningBase0.getQueryStrings(dorisSelect0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        DorisProvider.DorisGlobalState dorisProvider_DorisGlobalState0 = new DorisProvider.DorisGlobalState();
        DorisQueryPartitioningBase dorisQueryPartitioningBase0 = new DorisQueryPartitioningBase(
                dorisProvider_DorisGlobalState0);
        LinkedList<DorisSchema.DorisTable> linkedList0 = new LinkedList<DorisSchema.DorisTable>();
        DorisSchema.DorisTables dorisSchema_DorisTables0 = new DorisSchema.DorisTables(linkedList0);
        dorisQueryPartitioningBase0.targetTables = dorisSchema_DorisTables0;
        // Undeclared exception!
        try {
            dorisQueryPartitioningBase0.generateFetchColumns();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test3() throws Throwable {
        DorisQueryPartitioningBase dorisQueryPartitioningBase0 = new DorisQueryPartitioningBase(
                (DorisProvider.DorisGlobalState) null);
        // Undeclared exception!
        try {
            dorisQueryPartitioningBase0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.oracle.tlp.DorisQueryPartitioningBase", e);
        }
    }

    // @Test
    // public void test4() throws Throwable {
    // DorisProvider.DorisGlobalState dorisProvider_DorisGlobalState0 = new DorisProvider.DorisGlobalState();
    // DorisQueryPartitioningBase dorisQueryPartitioningBase0 = new DorisQueryPartitioningBase(
    // dorisProvider_DorisGlobalState0);
    // // Undeclared exception!
    // try {
    // dorisQueryPartitioningBase0.generateFetchColumns();
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.doris.oracle.tlp.DorisQueryPartitioningBase", e);
    // }
    // }

    @Test
    public void test5() throws Throwable {
        DorisProvider.DorisGlobalState dorisProvider_DorisGlobalState0 = new DorisProvider.DorisGlobalState();
        DorisQueryPartitioningBase dorisQueryPartitioningBase0 = new DorisQueryPartitioningBase(
                dorisProvider_DorisGlobalState0);
        // Undeclared exception!
        try {
            dorisQueryPartitioningBase0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test6() throws Throwable {
        DorisQueryPartitioningBase dorisQueryPartitioningBase0 = new DorisQueryPartitioningBase(
                (DorisProvider.DorisGlobalState) null);
        // Undeclared exception!
        try {
            dorisQueryPartitioningBase0.getQueryStrings((DorisSelect) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.oracle.tlp.DorisQueryPartitioningBase", e);
        }
    }

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test7() throws Throwable {
        DorisProvider.DorisGlobalState dorisProvider_DorisGlobalState0 = new DorisProvider.DorisGlobalState();
        DorisQueryPartitioningBase dorisQueryPartitioningBase0 = new DorisQueryPartitioningBase(
                dorisProvider_DorisGlobalState0);
        ExpressionGenerator<DorisExpression> expressionGenerator0 = dorisQueryPartitioningBase0.getGen();
        assertNull(expressionGenerator0);
    }
}
