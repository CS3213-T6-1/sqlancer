package sqlancer.evosuite.citus.gen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

import sqlancer.citus.gen.CitusUpdateGenerator;
import sqlancer.postgres.PostgresGlobalState;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CitusUpdateGenerator_ESTest {

    @Test
    public void test0() throws Throwable {
        PostgresGlobalState postgresGlobalState0 = new PostgresGlobalState();
        // Undeclared exception!
        try {
            CitusUpdateGenerator.create(postgresGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        // Undeclared exception!
        try {
            CitusUpdateGenerator.create((PostgresGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.postgres.gen.PostgresUpdateGenerator", e);
        }
    }

    private void verifyException(String s, NullPointerException e) {
    }
}
