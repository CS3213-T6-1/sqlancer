/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 07 13:28:23 GMT 2025
 */

package sqlancer.databend.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sqlancer.databend.ast.DatabendBinaryOperation;
import sqlancer.databend.ast.DatabendExpression;
import sqlancer.h2.H2ExpressionGenerator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DatabendBinaryOperation_ESTest extends DatabendBinaryOperation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      H2ExpressionGenerator.H2UnaryPostfixOperator h2ExpressionGenerator_H2UnaryPostfixOperator0 = H2ExpressionGenerator.H2UnaryPostfixOperator.IS_UNKNOWN;
      DatabendBinaryOperation databendBinaryOperation0 = new DatabendBinaryOperation((DatabendExpression) null, (DatabendExpression) null, h2ExpressionGenerator_H2UnaryPostfixOperator0);
  }
}
