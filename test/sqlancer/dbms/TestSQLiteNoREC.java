package sqlancer.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sqlancer.Main;

public class TestSQLiteNoREC {

    @Test
    public void testSqliteNoREC() {
        assertEquals(0, Main.executeMain(new String[] { "--random-seed", "0", "--timeout-seconds", TestConfig.SECONDS,
                "--num-threads", "1", "--num-queries", TestConfig.NUM_QUERIES, "sqlite3", "--oracle", "NoREC" }));
    }

    @Test
    public void testSqliteNoREC_customTable() {
        assertEquals(0, Main.executeMain(new String[] { "--random-seed", "0", "--timeout-seconds", TestConfig.SECONDS,
                "--num-threads", "1", "--num-queries", TestConfig.NUM_QUERIES, "sqlite3", "--oracle", "NoREC",
                "--use-custom-script", "test/sqlancer/custom_tables.sql" }));
    }
}
