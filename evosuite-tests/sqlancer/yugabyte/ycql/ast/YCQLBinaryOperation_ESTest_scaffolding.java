/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 07 13:36:39 GMT 2025
 */

package sqlancer.yugabyte.ycql.ast;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class YCQLBinaryOperation_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "sqlancer.yugabyte.ycql.ast.YCQLBinaryOperation"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\yewjo\\OneDrive\\Desktop\\NUS\\y4s2\\cs3213\\project\\sqlancer"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\yewjo\\AppData\\Local\\Temp\\"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(YCQLBinaryOperation_ESTest_scaffolding.class.getClassLoader() ,
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLTextConstant",
      "sqlancer.doris.ast.DorisLikeOperation$DorisLikeOperator$1",
      "sqlancer.doris.ast.DorisLikeOperation$DorisLikeOperator$2",
      "sqlancer.doris.ast.DorisExpression",
      "sqlancer.common.schema.AbstractSchema",
      "sqlancer.DatabendDorisPrestoConstant",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLDateConstant",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLIntConstant",
      "sqlancer.doris.ast.DorisLikeOperation",
      "sqlancer.common.ast.BinaryNode",
      "sqlancer.common.ast.BinaryOperatorNode",
      "sqlancer.common.visitor.BinaryOperation",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLDoubleConstant",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLNullConstant",
      "sqlancer.doris.ast.DorisLikeOperation$DorisLikeOperator",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLBooleanConstant",
      "sqlancer.yugabyte.ycql.ast.YCQLExpression",
      "sqlancer.common.ast.newast.Expression",
      "sqlancer.yugabyte.ycql.ast.YCQLBinaryOperation",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant",
      "sqlancer.common.ast.BinaryOperatorNode$Operator",
      "sqlancer.doris.DorisSchema",
      "sqlancer.doris.ast.DorisConstant",
      "sqlancer.common.ast.newast.NewBinaryOperatorNode"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(YCQLBinaryOperation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "sqlancer.common.ast.newast.NewBinaryOperatorNode",
      "sqlancer.yugabyte.ycql.ast.YCQLBinaryOperation",
      "sqlancer.yugabyte.ycql.YCQLSchema$YCQLCompositeDataType",
      "sqlancer.Randomly$StringGenerationStrategy$4",
      "sqlancer.Randomly$StringGenerationStrategy",
      "sqlancer.Randomly",
      "sqlancer.common.schema.AbstractTableColumn",
      "sqlancer.yugabyte.ycql.YCQLSchema$YCQLColumn",
      "sqlancer.common.ast.newast.ColumnReferenceNode",
      "sqlancer.yugabyte.ycql.ast.YCQLColumnReference",
      "sqlancer.postgres.ast.PostgresPOSIXRegularExpression$POSIXRegex",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLBooleanConstant",
      "sqlancer.tidb.ast.TiDBBinaryArithmeticOperation$TiDBBinaryArithmeticOperator",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLTimestampConstant",
      "sqlancer.tidb.ast.TiDBBinaryComparisonOperation$TiDBComparisonOperator",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLDoubleConstant",
      "sqlancer.materialize.ast.MaterializePostfixOperation$PostfixOperator",
      "sqlancer.common.ast.SelectBase",
      "sqlancer.yugabyte.ycql.ast.YCQLSelect",
      "sqlancer.h2.H2ExpressionGenerator$H2BinaryArithmeticOperator",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLIntConstant",
      "sqlancer.common.ast.newast.NewOrderingTerm",
      "sqlancer.yugabyte.ycql.ast.YCQLOrderingTerm",
      "sqlancer.cockroachdb.ast.CockroachDBBinaryComparisonOperator$CockroachDBComparisonOperator",
      "sqlancer.common.ast.newast.NewUnaryPrefixOperatorNode",
      "sqlancer.yugabyte.ycql.ast.YCQLUnaryPrefixOperation",
      "sqlancer.tidb.ast.TiDBBinaryBitOperation$TiDBBinaryBitOperator",
      "sqlancer.clickhouse.ast.ClickHouseUnaryFunctionOperation$ClickHouseUnaryFunctionOperator",
      "sqlancer.common.ast.newast.NewBetweenOperatorNode",
      "sqlancer.yugabyte.ycql.ast.YCQLBetweenOperation",
      "sqlancer.cockroachdb.ast.CockroachDBBinaryLogicalOperation$CockroachDBBinaryLogicalOperator",
      "sqlancer.doris.ast.DorisBinaryComparisonOperation$DorisBinaryComparisonOperator",
      "sqlancer.DatabendDorisPrestoConstant",
      "sqlancer.doris.ast.DorisConstant",
      "sqlancer.doris.ast.DorisConstant$DorisNullConstant",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLDateConstant",
      "sqlancer.cnosdb.ast.CnosDBBinaryLogicalOperation$BinaryLogicalOperator",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLTextConstant",
      "sqlancer.materialize.ast.MaterializePOSIXRegularExpression$POSIXRegex",
      "sqlancer.clickhouse.ast.ClickHouseUnaryPostfixOperation$ClickHouseUnaryPostfixOperator",
      "sqlancer.materialize.ast.MaterializeBinaryComparisonOperation$MaterializeBinaryComparisonOperator",
      "sqlancer.postgres.ast.PostgresBinaryArithmeticOperation$PostgresBinaryOperator",
      "sqlancer.tidb.ast.TiDBBinaryLogicalOperation$TiDBBinaryLogicalOperator",
      "sqlancer.common.ast.newast.NewFunctionNode",
      "sqlancer.yugabyte.ycql.ast.YCQLFunction",
      "sqlancer.postgres.ast.PostgresPostfixOperation$PostfixOperator",
      "sqlancer.postgres.ast.PostgresBinaryBitOperation$PostgresBinaryBitOperator",
      "sqlancer.doris.ast.DorisLikeOperation$DorisLikeOperator",
      "sqlancer.postgres.PostgresSchema$PostgresDataType",
      "sqlancer.postgres.ast.PostgresPrefixOperation$PrefixOperator",
      "sqlancer.hsqldb.ast.HSQLDBUnaryPostfixOperation$HSQLDBUnaryPostfixOperator",
      "sqlancer.yugabyte.ycql.ast.YCQLConstant$YCQLNullConstant",
      "sqlancer.tidb.ast.TiDBUnaryPostfixOperation$TiDBUnaryPostfixOperator",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator",
      "sqlancer.h2.H2ExpressionGenerator$H2BinaryComparisonOperator",
      "sqlancer.cnosdb.ast.CnosDBBinaryArithmeticOperation$CnosDBBinaryOperator",
      "sqlancer.common.ast.newast.NewInOperatorNode",
      "sqlancer.yugabyte.ycql.ast.YCQLInOperation",
      "sqlancer.databend.ast.DatabendConstant",
      "sqlancer.databend.ast.DatabendConstant$DatabendTemporalConstant",
      "sqlancer.databend.ast.DatabendConstant$DatabendDateConstant",
      "sqlancer.postgres.ast.PostgresBinaryComparisonOperation$PostgresBinaryComparisonOperator",
      "sqlancer.databend.ast.DatabendBinaryArithmeticOperation",
      "sqlancer.tidb.ast.TiDBRegexOperation$TiDBRegexOperator",
      "sqlancer.h2.H2ExpressionGenerator$H2UnaryPrefixOperator",
      "sqlancer.cockroachdb.ast.CockroachDBUnaryArithmeticOperation$CockroachDBUnaryAritmeticOperator",
      "sqlancer.common.schema.AbstractTable",
      "sqlancer.common.schema.AbstractRelationalTable",
      "sqlancer.yugabyte.ycql.YCQLSchema$YCQLTable",
      "sqlancer.SQLConstantUtils",
      "sqlancer.oceanbase.ast.OceanBaseUnaryPrefixOperation$OceanBaseUnaryPrefixOperator"
    );
  }
}
