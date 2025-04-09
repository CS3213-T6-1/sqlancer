/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 07 13:38:09 GMT 2025
 */

package sqlancer.evosuite.common.oracle;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import sqlancer.postgres.PostgresGlobalState;
import sqlancer.postgres.oracle.PostgresPivotedQuerySynthesisOracle;
import sqlancer.sqlite3.SQLite3GlobalState;
import sqlancer.sqlite3.oracle.SQLite3PivotedQuerySynthesisOracle;

public class PivotedQuerySynthesisBase_ESTest {

    @Test
    public void test0() throws Throwable {
        PostgresGlobalState postgresGlobalState0 = new PostgresGlobalState();
        PostgresPivotedQuerySynthesisOracle postgresPivotedQuerySynthesisOracle0 = new PostgresPivotedQuerySynthesisOracle(
                postgresGlobalState0);
        // Undeclared exception!
        try {
            postgresPivotedQuerySynthesisOracle0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3PivotedQuerySynthesisOracle sQLite3PivotedQuerySynthesisOracle0 = new SQLite3PivotedQuerySynthesisOracle(
                sQLite3GlobalState0);
        try {
            sQLite3PivotedQuerySynthesisOracle0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.oracle.SQLite3PivotedQuerySynthesisOracle", e);
        }
    }

    private void verifyException(String s, NullPointerException e) {
    }
}
