/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 16:55:50 GMT 2025
 */

package sqlancer.evosuite.tidb.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.tidb.ast.TiDBAggregate;

public class TiDBAggregate_ESTest {

    @Test
    public void test0() throws Throwable {
        TiDBAggregate.TiDBAggregateFunction tiDBAggregate_TiDBAggregateFunction0 = TiDBAggregate.TiDBAggregateFunction
                .getRandom();
        int int0 = tiDBAggregate_TiDBAggregateFunction0.getNrArgs();
        assertEquals(1, int0);
    }

    // @Test
    // public void test1() throws Throwable {
    // TiDBAggregate.TiDBAggregateFunction tiDBAggregate_TiDBAggregateFunction0 =
    // TiDBAggregate.TiDBAggregateFunction.COUNT;
    // TiDBAggregate tiDBAggregate0 = new TiDBAggregate((List<TiDBExpression>) null,
    // tiDBAggregate_TiDBAggregateFunction0);
    // }
}
