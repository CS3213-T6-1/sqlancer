package sqlancer.dbms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

import sqlancer.Main;

public class TestPostgresNoREC {

    @Test
    public void testNoREC_customTables() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.POSTGRES_ENV));
        assertEquals(0, Main.executeMain(new String[] { "--random-seed", "0", "--timeout-seconds", TestConfig.SECONDS,
                "--num-threads", "1", "--num-queries", TestConfig.NUM_QUERIES, "postgres", "--test-collations", "false",
                "--oracle", "NOREC", "--use-custom-script", "test/sqlancer/postgres_custom_tables.sql" }));
    }

    @Test
    public void testNoREC() {
        assumeTrue(TestConfig.isEnvironmentTrue(TestConfig.POSTGRES_ENV));
        assertEquals(0,
                Main.executeMain(new String[] { "--random-seed", "0", "--timeout-seconds", TestConfig.SECONDS,
                        "--num-threads", "4", "--num-queries", TestConfig.NUM_QUERIES, "postgres", "--test-collations",
                        "false", "--oracle", "NOREC" }));
    }
}
