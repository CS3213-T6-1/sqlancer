/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:27:40 GMT 2025
 */

package sqlancer.evosuite;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.function.UnaryOperator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;
import sqlancer.citus.CitusGlobalState;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.ComparatorHelper;
import sqlancer.materialize.MaterializeGlobalState;
import sqlancer.SQLGlobalState;

public class ComparatorHelper_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        List<String> list0 = citusGlobalState0.getCollates();
        String[] stringArray0 = new String[1];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        // Undeclared exception!
        try {
            ComparatorHelper.getCombinedResultSetNoDuplicates("", "", (String) null, list0, true, citusGlobalState0,
                    expectedErrors0);
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.AbstractList", e);
        }
    }

    @Test
    public void test01() throws Throwable {
        MaterializeGlobalState materializeGlobalState0 = new MaterializeGlobalState();
        List<String> list0 = materializeGlobalState0.getCollates();
        String[] stringArray0 = new String[1];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        // Undeclared exception!
        try {
            ComparatorHelper.getCombinedResultSet("!2q/>", "dA^kCU>moX]t|", "\u0002RbHa", list0, true,
                    materializeGlobalState0, expectedErrors0);
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.AbstractList", e);
        }
    }

    @Test
    public void test02() throws Throwable {
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        List<String> list0 = citusGlobalState0.getCollates();
        List<String> list1 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0);
        UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
        // Undeclared exception!
        try {
            ComparatorHelper.assumeResultSetsAreEqual(list1, list1, "~cE\"O/fZ+Dy", list0,
                    (SQLGlobalState<?, ?>) citusGlobalState0, unaryOperator0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.ComparatorHelper", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        List<String> list0 = List.of("0.0", "-- Query: \"%s\"; It misses: \"%s\"", "/sYsr`]X*<h*yW>~[");
        UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
        // Undeclared exception!
        try {
            ComparatorHelper.assumeResultSetsAreEqual((List<String>) linkedList0, list0, "/sYsr`]X*<h*yW>~[", list0,
                    (SQLGlobalState<?, ?>) citusGlobalState0, unaryOperator0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.ComparatorHelper", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        List<String> list0 = List.of("0.0", "-- Query: \"%s\"; It misses: \"%s\"", "/sYsr`]X*<h*yW>~[");
        // Undeclared exception!
        try {
            ComparatorHelper.assumeResultSetsAreEqual(list0, (List<String>) linkedList0, "*S*K5nf", list0,
                    (SQLGlobalState<?, ?>) citusGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.ComparatorHelper", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        boolean boolean0 = ComparatorHelper.equals(1.0, Double.NEGATIVE_INFINITY);
        assertFalse(boolean0);
    }

    @Test
    public void test06() throws Throwable {
        boolean boolean0 = ComparatorHelper.equals(0.0, (-1222.0034506));
        assertFalse(boolean0);
    }

    @Test
    public void test07() throws Throwable {
        boolean boolean0 = ComparatorHelper.isEqualDouble("-0.0", "6");
        assertFalse(boolean0);
    }

    @Test
    public void test08() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        // Undeclared exception!
        try {
            ComparatorHelper.getCombinedResultSet("-- Query: \"%s\"; It misses: \"%s\"",
                    "-- Query: \"%s\"; It misses: \"%s\"", "-- Query: \"%s\"; It misses: \"%s\"", linkedList0, true,
                    citusGlobalState0, expectedErrors0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.ComparatorHelper", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        boolean boolean0 = ComparatorHelper.isEqualDouble("-0.0", "-0.0");
        assertTrue(boolean0);
    }

    @Test
    public void test10() throws Throwable {
        String string0 = ComparatorHelper.canonicalizeResultValue("");
        assertEquals("", string0);
    }

    @Test
    public void test11() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        // Undeclared exception!
        try {
            ComparatorHelper.getResultSetFirstColumnAsString("-0", expectedErrors0, citusGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.ComparatorHelper", e);
        }
    }

    @Test
    public void test12() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        List<String> list0 = citusGlobalState0.getCollates();
        // Undeclared exception!
        try {
            ComparatorHelper.assumeResultSetsAreEqual(list0, list0, (String) null, list0,
                    (SQLGlobalState<?, ?>) citusGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.ComparatorHelper", e);
        }
    }

    @Test
    public void test13() throws Throwable {
        String string0 = ComparatorHelper.canonicalizeResultValue("-0.0");
        assertEquals("0.0", string0);
    }

    @Test
    public void test14() throws Throwable {
        String string0 = ComparatorHelper.canonicalizeResultValue("-0");
        assertEquals("0", string0);
    }

    @Test
    public void test15() throws Throwable {
        String string0 = ComparatorHelper.canonicalizeResultValue((String) null);
        assertNull(string0);
    }

    @Test
    public void test16() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        // Undeclared exception!
        try {
            ComparatorHelper.getCombinedResultSetNoDuplicates("Cq=zSuVB(MhQfv", "Cq=zSuVB(MhQfv", "Cq=zSuVB(MhQfv",
                    linkedList0, true, citusGlobalState0, (ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.ComparatorHelper", e);
        }
    }

    @Test
    public void test17() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        String[] stringArray0 = new String[0];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        // Undeclared exception!
        try {
            ComparatorHelper.getCombinedResultSetNoDuplicates("J.l7;.@o%6n@9", "d3;Me:qoH", "XL,", linkedList0, false,
                    citusGlobalState0, expectedErrors0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.ComparatorHelper", e);
        }
    }

    // @Test
    // public void test18() throws Throwable {
    // MaterializeGlobalState materializeGlobalState0 = new MaterializeGlobalState();
    // List<String> list0 = materializeGlobalState0.getCollates();
    // ExpectedErrors expectedErrors0 = new ExpectedErrors();
    // // Undeclared exception!
    // try {
    // ComparatorHelper.getCombinedResultSet("Second query: \"%s\"", (String) null, "", list0, false,
    // materializeGlobalState0, expectedErrors0);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.ComparatorHelper", e);
    // }
    // }

    @Test
    public void test19() throws Throwable {
        boolean boolean0 = ComparatorHelper.equals(2311.985, 2312.0257);
        assertTrue(boolean0);
    }

    @Test
    public void test20() throws Throwable {
        boolean boolean0 = ComparatorHelper.isEqualDouble("XQ9OkI`5+tS<u)-", "Second query: \"%s\"");
        assertFalse(boolean0);
    }
}
