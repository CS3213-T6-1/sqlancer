/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 07 13:19:46 GMT 2025
 */

package sqlancer.databend.ast;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DatabendBinaryLogicalOperation_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "sqlancer.databend.ast.DatabendBinaryLogicalOperation"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DatabendBinaryLogicalOperation_ESTest_scaffolding.class.getClassLoader() ,
      "sqlancer.databend.DatabendSchema$DatabendTable",
      "sqlancer.databend.ast.DatabendBinaryLogicalOperation$DatabendBinaryLogicalOperator",
      "sqlancer.databend.ast.DatabendUnaryPostfixOperation",
      "sqlancer.SQLProviderAdapter",
      "sqlancer.databend.DatabendProvider",
      "sqlancer.databend.DatabendProvider$DatabendGlobalState",
      "sqlancer.databend.ast.DatabendConstant$DatabendFloatConstant",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator$6",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator$5",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator$4",
      "sqlancer.Randomly$StringGenerationStrategy",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator$3",
      "sqlancer.databend.DatabendSchema",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator$8",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator$7",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator$2",
      "sqlancer.common.schema.AbstractTable",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator$1",
      "sqlancer.databend.DatabendSchema$DatabendCompositeDataType",
      "sqlancer.GlobalState",
      "sqlancer.databend.ast.DatabendBinaryLogicalOperation",
      "sqlancer.databend.ast.DatabendConstant$DatabendDateConstant",
      "sqlancer.databend.ast.DatabendConstant$DatabendNumericConstant",
      "sqlancer.databend.DatabendSchema$DatabendRowValue",
      "sqlancer.common.schema.AbstractSchema",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator",
      "sqlancer.common.ast.newast.Join",
      "sqlancer.databend.ast.DatabendConstant$DatabendTemporalConstant",
      "sqlancer.databend.ast.DatabendConstant$DatabendStringConstant",
      "sqlancer.DatabaseProvider",
      "sqlancer.databend.ast.DatabendConstant$DatabendBooleanConstant",
      "sqlancer.common.schema.AbstractRelationalTable",
      "sqlancer.ProviderAdapter",
      "sqlancer.databend.ast.DatabendTableReference",
      "sqlancer.common.ast.JoinBase",
      "sqlancer.common.ast.newast.NewUnaryPostfixOperatorNode",
      "sqlancer.MainOptions",
      "sqlancer.common.ast.newast.ColumnReferenceNode",
      "sqlancer.Randomly",
      "sqlancer.DatabendDorisPrestoConstant",
      "sqlancer.databend.ast.DatabendJoin$OuterType",
      "sqlancer.common.ast.BinaryNode",
      "sqlancer.common.ast.BinaryOperatorNode",
      "sqlancer.common.visitor.BinaryOperation",
      "sqlancer.common.schema.AbstractTableColumn",
      "sqlancer.databend.ast.DatabendConstant",
      "sqlancer.common.ast.JoinBase$JoinType",
      "sqlancer.databend.ast.DatabendColumnValue",
      "sqlancer.databend.ast.DatabendConstant$DatabendIntConstant",
      "sqlancer.common.ast.newast.Expression",
      "sqlancer.SQLGlobalState",
      "sqlancer.common.ast.BinaryOperatorNode$Operator",
      "sqlancer.Randomly$StringGenerationStrategy$4",
      "sqlancer.Randomly$StringGenerationStrategy$3",
      "sqlancer.Randomly$StringGenerationStrategy$2",
      "sqlancer.common.ast.newast.NewBinaryOperatorNode",
      "sqlancer.Randomly$StringGenerationStrategy$1",
      "sqlancer.databend.ast.DatabendUnaryPostfixOperation$DatabendUnaryPostfixOperator$1",
      "sqlancer.databend.ast.DatabendUnaryPostfixOperation$DatabendUnaryPostfixOperator$2",
      "sqlancer.databend.ast.DatabendJoin",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation",
      "sqlancer.databend.DatabendSchema$DatabendColumn",
      "sqlancer.databend.ast.DatabendBetweenOperation",
      "sqlancer.databend.ast.DatabendLikeOperation$DatabendLikeOperator",
      "sqlancer.databend.DatabendSchema$DatabendDataType",
      "sqlancer.common.ast.newast.NewBetweenOperatorNode",
      "sqlancer.databend.ast.DatabendBinaryLogicalOperation$DatabendBinaryLogicalOperator$2",
      "sqlancer.databend.ast.DatabendBinaryLogicalOperation$DatabendBinaryLogicalOperator$1",
      "sqlancer.databend.ast.DatabendConstant$DatabendNullConstant",
      "sqlancer.IgnoreMeException",
      "sqlancer.databend.ast.DatabendConstant$DatabendTimestampConstant",
      "sqlancer.common.schema.AbstractRowValue",
      "sqlancer.common.schema.TableIndex",
      "sqlancer.databend.ast.DatabendExpression",
      "sqlancer.databend.ast.DatabendLikeOperation",
      "sqlancer.databend.ast.DatabendUnaryPostfixOperation$DatabendUnaryPostfixOperator",
      "sqlancer.common.ast.newast.TableReferenceNode"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DatabendBinaryLogicalOperation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "sqlancer.common.ast.newast.NewBinaryOperatorNode",
      "sqlancer.databend.ast.DatabendBinaryLogicalOperation",
      "sqlancer.databend.ast.DatabendBinaryLogicalOperation$DatabendBinaryLogicalOperator",
      "sqlancer.databend.DatabendSchema$DatabendDataType",
      "sqlancer.Randomly$StringGenerationStrategy$4",
      "sqlancer.Randomly$StringGenerationStrategy",
      "sqlancer.Randomly",
      "sqlancer.DatabendDorisPrestoConstant",
      "sqlancer.databend.ast.DatabendConstant",
      "sqlancer.databend.ast.DatabendConstant$DatabendBooleanConstant",
      "sqlancer.databend.ast.DatabendBinaryArithmeticOperation",
      "sqlancer.databend.ast.DatabendConstant$DatabendTemporalConstant",
      "sqlancer.databend.ast.DatabendConstant$DatabendTimestampConstant",
      "sqlancer.databend.DatabendSchema$DatabendCompositeDataType",
      "sqlancer.common.schema.AbstractTableColumn",
      "sqlancer.databend.DatabendSchema$DatabendColumn",
      "sqlancer.common.ast.newast.ColumnReferenceNode",
      "sqlancer.databend.ast.DatabendColumnReference",
      "sqlancer.databend.ast.DatabendConstant$DatabendNumericConstant",
      "sqlancer.databend.ast.DatabendConstant$DatabendFloatConstant",
      "sqlancer.common.ast.newast.NewUnaryPostfixOperatorNode",
      "sqlancer.databend.ast.DatabendUnaryPostfixOperation",
      "sqlancer.common.schema.AbstractTable",
      "sqlancer.common.schema.AbstractRelationalTable",
      "sqlancer.databend.DatabendSchema$DatabendTable",
      "sqlancer.common.ast.newast.TableReferenceNode",
      "sqlancer.databend.ast.DatabendTableReference",
      "sqlancer.databend.ast.DatabendLikeOperation",
      "sqlancer.databend.ast.DatabendConstant$DatabendDateConstant",
      "sqlancer.cockroachdb.ast.CockroachDBUnaryPostfixOperation$CockroachDBUnaryPostfixOperator",
      "sqlancer.databend.ast.DatabendConstant$DatabendStringConstant",
      "sqlancer.common.ast.JoinBase",
      "sqlancer.databend.ast.DatabendJoin",
      "sqlancer.common.ast.JoinBase$JoinType",
      "sqlancer.databend.ast.DatabendConstant$DatabendIntConstant",
      "sqlancer.databend.ast.DatabendConstant$DatabendNullConstant",
      "sqlancer.databend.ast.DatabendColumnValue",
      "sqlancer.common.ast.SelectBase",
      "sqlancer.databend.ast.DatabendSelect",
      "sqlancer.common.ast.newast.NewFunctionNode",
      "sqlancer.databend.ast.DatabendFunctionOperation",
      "sqlancer.databend.ast.DatabendAggregateOperation",
      "sqlancer.common.ast.newast.NewBetweenOperatorNode",
      "sqlancer.databend.ast.DatabendBetweenOperation",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation",
      "sqlancer.postgres.ast.PostgresBinaryLogicalOperation$BinaryLogicalOperator",
      "sqlancer.common.ast.newast.NewPostfixTextNode",
      "sqlancer.databend.ast.DatabendPostFixText",
      "sqlancer.common.ast.newast.NewOrderingTerm",
      "sqlancer.databend.ast.DatabendOrderByTerm",
      "sqlancer.databend.ast.DatabendCastOperation",
      "sqlancer.databend.ast.DatabendCastOperation$1",
      "sqlancer.common.ast.newast.NewUnaryPrefixOperatorNode",
      "sqlancer.databend.ast.DatabendUnaryPrefixOperation",
      "sqlancer.common.ast.newast.NewAliasNode",
      "sqlancer.databend.ast.DatabendAlias",
      "sqlancer.common.ast.newast.NewInOperatorNode",
      "sqlancer.databend.ast.DatabendInOperation",
      "sqlancer.databend.ast.DatabendBinaryOperation",
      "sqlancer.tidb.ast.TiDBBinaryComparisonOperation$TiDBComparisonOperator",
      "sqlancer.postgres.PostgresSchema$PostgresDataType",
      "sqlancer.postgres.ast.PostgresPrefixOperation$PrefixOperator",
      "sqlancer.materialize.ast.MaterializeBinaryRangeOperation$MaterializeBinaryRangeOperator",
      "sqlancer.clickhouse.ast.ClickHouseUnaryFunctionOperation$ClickHouseUnaryFunctionOperator",
      "sqlancer.postgres.ast.PostgresBinaryRangeOperation$PostgresBinaryRangeOperator",
      "sqlancer.cockroachdb.ast.CockroachDBBinaryComparisonOperator$CockroachDBComparisonOperator",
      "sqlancer.h2.H2ExpressionGenerator$H2UnaryPostfixOperator",
      "sqlancer.cnosdb.ast.CnosDBBinaryArithmeticOperation$CnosDBBinaryOperator",
      "sqlancer.doris.DorisSchema$DorisDataType",
      "sqlancer.doris.ast.DorisUnaryPrefixOperation$DorisUnaryPrefixOperator",
      "sqlancer.cnosdb.ast.CnosDBBinaryLogicalOperation$BinaryLogicalOperator",
      "sqlancer.h2.H2ExpressionGenerator$H2UnaryPrefixOperator",
      "sqlancer.materialize.ast.MaterializePostfixOperation$PostfixOperator",
      "sqlancer.doris.ast.DorisBinaryLogicalOperation$DorisBinaryLogicalOperator",
      "sqlancer.h2.H2ExpressionGenerator$H2BinaryArithmeticOperator",
      "sqlancer.common.ast.newast.NewToStringVisitor",
      "sqlancer.databend.DatabendToStringVisitor",
      "sqlancer.h2.H2ExpressionGenerator$H2BinaryComparisonOperator",
      "sqlancer.materialize.MaterializeSchema$MaterializeDataType",
      "sqlancer.materialize.ast.MaterializePrefixOperation$PrefixOperator",
      "sqlancer.clickhouse.ClickHouseSchema$ClickHouseColumn",
      "sqlancer.clickhouse.ClickHouseSchema$ClickHouseLancerDataType",
      "sqlancer.tidb.ast.TiDBRegexOperation$TiDBRegexOperator",
      "sqlancer.postgres.ast.PostgresPostfixOperation$PostfixOperator",
      "sqlancer.postgres.ast.PostgresBinaryComparisonOperation$PostgresBinaryComparisonOperator",
      "sqlancer.presto.ast.PrestoUnaryPostfixOperation$PrestoUnaryPostfixOperator",
      "sqlancer.materialize.ast.MaterializeBinaryComparisonOperation$MaterializeBinaryComparisonOperator",
      "sqlancer.materialize.ast.MaterializeBinaryLogicalOperation$BinaryLogicalOperator",
      "sqlancer.mysql.ast.MySQLUnaryPrefixOperation$MySQLUnaryPrefixOperator",
      "sqlancer.h2.H2ExpressionGenerator$H2BinaryLogicalOperator",
      "sqlancer.materialize.ast.MaterializeBinaryArithmeticOperation$MaterializeBinaryOperator",
      "sqlancer.oceanbase.ast.OceanBaseUnaryPrefixOperation$OceanBaseUnaryPrefixOperator",
      "sqlancer.cnosdb.ast.CnosDBPostfixOperation$PostfixOperator",
      "sqlancer.doris.ast.DorisBinaryComparisonOperation$DorisBinaryComparisonOperator",
      "sqlancer.doris.ast.DorisUnaryPostfixOperation$DorisUnaryPostfixOperator",
      "sqlancer.GlobalState",
      "sqlancer.SQLGlobalState",
      "sqlancer.databend.DatabendProvider$DatabendGlobalState",
      "sqlancer.doris.ast.DorisLikeOperation$DorisLikeOperator",
      "sqlancer.tidb.ast.TiDBUnaryPrefixOperation$TiDBUnaryPrefixOperator",
      "sqlancer.postgres.ast.PostgresBinaryArithmeticOperation$PostgresBinaryOperator",
      "sqlancer.postgres.ast.PostgresPOSIXRegularExpression$POSIXRegex",
      "sqlancer.common.query.Query",
      "sqlancer.common.query.SQLQueryAdapter",
      "sqlancer.common.query.ExpectedErrors",
      "sqlancer.IgnoreMeException",
      "sqlancer.tidb.ast.TiDBBinaryArithmeticOperation$TiDBBinaryArithmeticOperator",
      "sqlancer.postgres.ast.PostgresBinaryBitOperation$PostgresBinaryBitOperator",
      "sqlancer.cockroachdb.ast.CockroachDBUnaryArithmeticOperation$CockroachDBUnaryAritmeticOperator",
      "sqlancer.tidb.ast.TiDBUnaryPostfixOperation$TiDBUnaryPostfixOperator",
      "sqlancer.materialize.ast.MaterializePOSIXRegularExpression$POSIXRegex",
      "sqlancer.cockroachdb.ast.CockroachDBBinaryArithmeticOperation$CockroachDBBinaryArithmeticOperator",
      "sqlancer.postgres.ast.PostgresConstant",
      "sqlancer.postgres.ast.PostgresConstant$PostgresConstantBase",
      "sqlancer.postgres.ast.PostgresConstant$BitConstant",
      "sqlancer.postgres.ast.PostgresPostfixOperation",
      "sqlancer.postgres.ast.PostgresConstant$BooleanConstant",
      "sqlancer.cnosdb.CnosDBSchema$CnosDBDataType",
      "sqlancer.cnosdb.ast.CnosDBPrefixOperation$PrefixOperator",
      "sqlancer.hsqldb.HSQLDBSchema$HSQLDBDataType",
      "sqlancer.hsqldb.ast.HSQLDBUnaryPrefixOperation$HSQLDBUnaryPrefixOperator",
      "sqlancer.presto.PrestoSchema$PrestoDataType",
      "sqlancer.cnosdb.ast.CnosDBBinaryComparisonOperation$CnosDBBinaryComparisonOperator",
      "sqlancer.cockroachdb.ast.CockroachDBBinaryLogicalOperation$CockroachDBBinaryLogicalOperator",
      "sqlancer.clickhouse.ast.ClickHouseUnaryPostfixOperation$ClickHouseUnaryPostfixOperator",
      "sqlancer.tidb.ast.TiDBBinaryLogicalOperation$TiDBBinaryLogicalOperator",
      "sqlancer.databend.ast.DatabendBinaryComparisonOperation$DatabendBinaryComparisonOperator"
    );
  }
}
