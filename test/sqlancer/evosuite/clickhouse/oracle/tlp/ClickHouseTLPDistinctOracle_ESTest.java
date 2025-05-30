/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:44:39 GMT 2025
 */

package sqlancer.evosuite.clickhouse.oracle.tlp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqlancer.clickhouse.ClickHouseProvider;
import sqlancer.clickhouse.oracle.tlp.ClickHouseTLPDistinctOracle;

public class ClickHouseTLPDistinctOracle_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        ClickHouseProvider.ClickHouseGlobalState clickHouseProvider_ClickHouseGlobalState0 = new ClickHouseProvider.ClickHouseGlobalState();
        ClickHouseTLPDistinctOracle clickHouseTLPDistinctOracle0 = new ClickHouseTLPDistinctOracle(
                clickHouseProvider_ClickHouseGlobalState0);
        // Undeclared exception!
        try {
            clickHouseTLPDistinctOracle0.check();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        ClickHouseTLPDistinctOracle clickHouseTLPDistinctOracle0 = new ClickHouseTLPDistinctOracle(
                (ClickHouseProvider.ClickHouseGlobalState) null);
        // Undeclared exception!
        try {
            clickHouseTLPDistinctOracle0.check();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.clickhouse.oracle.tlp.ClickHouseTLPBase", e);
        }
    }
}
