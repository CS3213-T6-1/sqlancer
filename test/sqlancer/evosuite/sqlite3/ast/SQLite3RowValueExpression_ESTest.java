/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 07 13:00:32 GMT 2025
 */

package sqlancer.evosuite.sqlite3.ast;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;

import sqlancer.Randomly;
import sqlancer.sqlite3.ast.SQLite3Constant;
import sqlancer.sqlite3.ast.SQLite3Expression;
import sqlancer.sqlite3.ast.SQLite3RowValueExpression;
import sqlancer.sqlite3.ast.SQLite3Select;
import sqlancer.sqlite3.ast.SQLite3WindowFunctionExpression;

public class SQLite3RowValueExpression_ESTest {

    @Test
    public void test0() throws Throwable {
        SQLite3RowValueExpression sQLite3RowValueExpression0 = new SQLite3RowValueExpression(
                (List<SQLite3Expression>) null);
        List<SQLite3Expression> list0 = sQLite3RowValueExpression0.getExpressions();
        assertNull(list0);
    }

    @Test
    public void test1() throws Throwable {
        SQLite3Constant.SQLite3TextConstant sQLite3Constant_SQLite3TextConstant0 = new SQLite3Constant.SQLite3TextConstant(
                "]icvi5h8Ap");
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3Constant_SQLite3TextConstant0);
        List<SQLite3Expression> list0 = sQLite3WindowFunctionExpression0.getPartitionBy();
        SQLite3RowValueExpression sQLite3RowValueExpression0 = new SQLite3RowValueExpression(list0);
        List<SQLite3Expression> list1 = sQLite3RowValueExpression0.getExpressions();
        assertEquals(0, list1.size());
    }

    @Test
    public void test2() throws Throwable {
        SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[9];
        List<SQLite3Expression> list0 = Randomly.subset(8, sQLite3ExpressionArray0);
        SQLite3RowValueExpression sQLite3RowValueExpression0 = new SQLite3RowValueExpression(list0);
        List<SQLite3Expression> list1 = sQLite3RowValueExpression0.getExpressions();
        assertSame(list0, list1);
    }

    // @Test
    // public void test3() throws Throwable {
    // SQLite3Select sQLite3Select0 = new SQLite3Select();
    // SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[8];
    // SQLite3Schema.SQLite3Column.SQLite3CollateSequence sQLite3Schema_SQLite3Column_SQLite3CollateSequence0 =
    // SQLite3Schema.SQLite3Column.SQLite3CollateSequence.NOCASE;
    // SQLite3CollateOperation sQLite3CollateOperation0 = new SQLite3CollateOperation(sQLite3Select0,
    // sQLite3Schema_SQLite3Column_SQLite3CollateSequence0);
    // sQLite3ExpressionArray0[0] = (SQLite3Expression) sQLite3CollateOperation0;
    // List<SQLite3Expression> list0 = Randomly.subset(1, sQLite3ExpressionArray0);
    // SQLite3RowValueExpression sQLite3RowValueExpression0 = new SQLite3RowValueExpression(list0);
    // SQLite3Schema.SQLite3Column.SQLite3CollateSequence sQLite3Schema_SQLite3Column_SQLite3CollateSequence1 =
    // sQLite3RowValueExpression0
    // .getExplicitCollateSequence();
    // assertSame(sQLite3Schema_SQLite3Column_SQLite3CollateSequence1,
    // sQLite3Schema_SQLite3Column_SQLite3CollateSequence0);
    // }

    @Test
    public void test4() throws Throwable {
        SQLite3Select sQLite3Select0 = new SQLite3Select();
        SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[9];
        sQLite3ExpressionArray0[0] = (SQLite3Expression) sQLite3Select0;
        List<SQLite3Expression> list0 = Randomly.subset(1, sQLite3ExpressionArray0);
        SQLite3RowValueExpression sQLite3RowValueExpression0 = new SQLite3RowValueExpression(list0);
        sQLite3RowValueExpression0.getExplicitCollateSequence();
    }

    @Test
    public void test5() throws Throwable {
        SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[9];
        List<SQLite3Expression> list0 = Randomly.subset(8, sQLite3ExpressionArray0);
        SQLite3RowValueExpression sQLite3RowValueExpression0 = new SQLite3RowValueExpression(list0);
        // Undeclared exception!
        try {
            sQLite3RowValueExpression0.getExplicitCollateSequence();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.ast.SQLite3RowValueExpression", e);
        }
    }

    private void verifyException(String s, NullPointerException e) {
    }
}
