package sqlancer.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sqlancer.Main;

public class TestDuckDBNoREC {
    @Test
    public void testDuckDBNoREC_customTable() {
        // run with one thread due to multithreading issues, see
        // https://github.com/sqlancer/sqlancer/pull/45
        assertEquals(0, Main.executeMain(new String[] { "--random-seed", "0", "--timeout-seconds", TestConfig.SECONDS,
                "--num-threads", "1", "--num-queries", TestConfig.NUM_QUERIES, "duckdb", "--oracle", "NOREC",
                "--use-custom-script", "test/sqlancer/duckdb_custom_tables.sql" }));
    }

    @Test
    public void testDuckDBNoREC() {
        // run with one thread due to multithreading issues, see
        // https://github.com/sqlancer/sqlancer/pull/45
        assertEquals(0, Main.executeMain(new String[] { "--random-seed", "0", "--timeout-seconds", TestConfig.SECONDS,
                "--num-threads", "1", "--num-queries", TestConfig.NUM_QUERIES, "duckdb", "--oracle", "NOREC" }));
    }
}
