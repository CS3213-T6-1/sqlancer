/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 03:00:56 GMT 2025
 */

package sqlancer.evosuite.materialize.oracle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.materialize.ast.MaterializeConstant;
import sqlancer.materialize.ast.MaterializeExpression;
import sqlancer.materialize.ast.MaterializeLikeOperation;
import sqlancer.materialize.ast.MaterializeOrderByTerm;
import sqlancer.materialize.ast.MaterializePOSIXRegularExpression;
import sqlancer.materialize.ast.MaterializePrefixOperation;
import sqlancer.materialize.ast.MaterializeSelect;
import sqlancer.materialize.MaterializeGlobalState;
import sqlancer.materialize.MaterializeSchema;
import sqlancer.materialize.oracle.MaterializePivotedQuerySynthesisOracle;

public class MaterializePivotedQuerySynthesisOracle_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        MaterializeGlobalState materializeGlobalState0 = new MaterializeGlobalState();
        SQLQueryAdapter sQLQueryAdapter0 = new SQLQueryAdapter("");
        MaterializePivotedQuerySynthesisOracle materializePivotedQuerySynthesisOracle0 = new MaterializePivotedQuerySynthesisOracle(
                materializeGlobalState0);
        // Undeclared exception!
        try {
            materializePivotedQuerySynthesisOracle0.getContainmentCheckQuery(sQLQueryAdapter0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.materialize.oracle.MaterializePivotedQuerySynthesisOracle", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        MaterializePivotedQuerySynthesisOracle materializePivotedQuerySynthesisOracle0 = new MaterializePivotedQuerySynthesisOracle(
                (MaterializeGlobalState) null);
        MaterializeConstant.MaterializeNullConstant materializeConstant_MaterializeNullConstant0 = new MaterializeConstant.MaterializeNullConstant();
        String string0 = materializePivotedQuerySynthesisOracle0
                .getExpectedValues(materializeConstant_MaterializeNullConstant0);
        assertEquals("NULL -- NULL\n", string0);
    }

    @Test
    public void test2() throws Throwable {
        MaterializeGlobalState materializeGlobalState0 = new MaterializeGlobalState();
        MaterializePivotedQuerySynthesisOracle materializePivotedQuerySynthesisOracle0 = new MaterializePivotedQuerySynthesisOracle(
                materializeGlobalState0);
        MaterializeOrderByTerm.MaterializeOrder materializeOrderByTerm_MaterializeOrder0 = MaterializeOrderByTerm.MaterializeOrder.ASC;
        MaterializeOrderByTerm materializeOrderByTerm0 = new MaterializeOrderByTerm((MaterializeExpression) null,
                materializeOrderByTerm_MaterializeOrder0);
        String string0 = materializePivotedQuerySynthesisOracle0.getExpectedValues(materializeOrderByTerm0);
        assertEquals("", string0);
    }

    @Test
    public void test3() throws Throwable {
        MaterializePivotedQuerySynthesisOracle materializePivotedQuerySynthesisOracle0 = new MaterializePivotedQuerySynthesisOracle(
                (MaterializeGlobalState) null);
        // Undeclared exception!
        try {
            materializePivotedQuerySynthesisOracle0.getRectifiedQuery();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.materialize.oracle.MaterializePivotedQuerySynthesisOracle", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        MaterializeGlobalState materializeGlobalState0 = new MaterializeGlobalState();
        MaterializePivotedQuerySynthesisOracle materializePivotedQuerySynthesisOracle0 = new MaterializePivotedQuerySynthesisOracle(
                materializeGlobalState0);
        // Undeclared exception!
        try {
            materializePivotedQuerySynthesisOracle0.getRectifiedQuery();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test5() throws Throwable {
        MaterializePivotedQuerySynthesisOracle materializePivotedQuerySynthesisOracle0 = new MaterializePivotedQuerySynthesisOracle(
                (MaterializeGlobalState) null);
        MaterializeConstant.MaterializeNullConstant materializeConstant_MaterializeNullConstant0 = new MaterializeConstant.MaterializeNullConstant();
        MaterializePrefixOperation.PrefixOperator materializePrefixOperation_PrefixOperator0 = MaterializePrefixOperation.PrefixOperator.UNARY_MINUS;
        MaterializePrefixOperation materializePrefixOperation0 = new MaterializePrefixOperation(
                materializeConstant_MaterializeNullConstant0, materializePrefixOperation_PrefixOperator0);
        MaterializePOSIXRegularExpression.POSIXRegex materializePOSIXRegularExpression_POSIXRegex0 = MaterializePOSIXRegularExpression.POSIXRegex.MATCH_CASE_INSENSITIVE;
        MaterializePOSIXRegularExpression materializePOSIXRegularExpression0 = new MaterializePOSIXRegularExpression(
                materializeConstant_MaterializeNullConstant0, materializePrefixOperation0,
                materializePOSIXRegularExpression_POSIXRegex0);
        // Undeclared exception!
        try {
            materializePivotedQuerySynthesisOracle0.getExpectedValues(materializePOSIXRegularExpression0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.materialize.ast.MaterializePrefixOperation$PrefixOperator$3", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        MaterializeGlobalState materializeGlobalState0 = new MaterializeGlobalState();
        MaterializePivotedQuerySynthesisOracle materializePivotedQuerySynthesisOracle0 = new MaterializePivotedQuerySynthesisOracle(
                materializeGlobalState0);
        MaterializeConstant.DoubleConstant materializeConstant_DoubleConstant0 = new MaterializeConstant.DoubleConstant(
                (-1.0));
        MaterializeLikeOperation materializeLikeOperation0 = new MaterializeLikeOperation(
                materializeConstant_DoubleConstant0, materializeConstant_DoubleConstant0);
        // Undeclared exception!
        try {
            materializePivotedQuerySynthesisOracle0.getExpectedValues(materializeLikeOperation0);
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // -1.0
            //
            verifyException("sqlancer.materialize.ast.MaterializeConstant", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        MaterializeGlobalState materializeGlobalState0 = new MaterializeGlobalState();
        MaterializePivotedQuerySynthesisOracle materializePivotedQuerySynthesisOracle0 = new MaterializePivotedQuerySynthesisOracle(
                materializeGlobalState0);
        MaterializeSelect materializeSelect0 = new MaterializeSelect();
        MaterializeSelect.MaterializeSubquery materializeSelect_MaterializeSubquery0 = new MaterializeSelect.MaterializeSubquery(
                materializeSelect0, "nf'FJ");
        // Undeclared exception!
        try {
            materializePivotedQuerySynthesisOracle0.getExpectedValues(materializeSelect_MaterializeSubquery0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        MaterializePivotedQuerySynthesisOracle materializePivotedQuerySynthesisOracle0 = new MaterializePivotedQuerySynthesisOracle(
                (MaterializeGlobalState) null);
        // Undeclared exception!
        try {
            materializePivotedQuerySynthesisOracle0.getExpectedValues((MaterializeExpression) null);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test9() throws Throwable {
        MaterializeGlobalState materializeGlobalState0 = new MaterializeGlobalState();
        MaterializePivotedQuerySynthesisOracle materializePivotedQuerySynthesisOracle0 = new MaterializePivotedQuerySynthesisOracle(
                materializeGlobalState0);
        MaterializeSelect.MaterializeFromTable materializeSelect_MaterializeFromTable0 = new MaterializeSelect.MaterializeFromTable(
                (MaterializeSchema.MaterializeTable) null, false);
        // Undeclared exception!
        try {
            materializePivotedQuerySynthesisOracle0.getExpectedValues(materializeSelect_MaterializeFromTable0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.materialize.MaterializeToStringVisitor", e);
        }
    }
}
