/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 07 14:18:04 GMT 2025
 */

package sqlancer.evosuite.common.ast.newast;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import sqlancer.common.ast.newast.NewOrderingTerm;

public class NewOrderingTerm_ESTest {

    @Test
    public void test0() throws Throwable {
        Object object0 = new Object();
        NewOrderingTerm.Ordering newOrderingTerm_Ordering0 = NewOrderingTerm.Ordering.DESC;
        NewOrderingTerm<Object> newOrderingTerm0 = new NewOrderingTerm<Object>(object0, newOrderingTerm_Ordering0);
        NewOrderingTerm.Ordering newOrderingTerm_Ordering1 = newOrderingTerm0.getOrdering();
        assertSame(newOrderingTerm_Ordering0, newOrderingTerm_Ordering1);
    }

    @Test
    public void test1() throws Throwable {
        NewOrderingTerm.Ordering newOrderingTerm_Ordering0 = NewOrderingTerm.Ordering.ASC;
        NewOrderingTerm<Object> newOrderingTerm0 = new NewOrderingTerm<Object>((Object) null,
                newOrderingTerm_Ordering0);
        Object object0 = newOrderingTerm0.getExpr();
        assertNull(object0);
    }

    @Test
    public void test2() throws Throwable {
        Object object0 = new Object();
        NewOrderingTerm.Ordering newOrderingTerm_Ordering0 = NewOrderingTerm.Ordering.DESC;
        NewOrderingTerm<Object> newOrderingTerm0 = new NewOrderingTerm<Object>(object0, newOrderingTerm_Ordering0);
        Object object1 = newOrderingTerm0.getExpr();
        assertSame(object0, object1);
    }

    @Test
    public void test3() throws Throwable {
        NewOrderingTerm<Object> newOrderingTerm0 = new NewOrderingTerm<Object>((Object) null,
                (NewOrderingTerm.Ordering) null);
        newOrderingTerm0.getOrdering();
    }

    // @Test
    // public void test4() throws Throwable {
    // NewOrderingTerm.Ordering newOrderingTerm_Ordering0 = NewOrderingTerm.Ordering.getRandom();
    // assertEquals(NewOrderingTerm.Ordering.ASC, newOrderingTerm_Ordering0);
    // }
}
