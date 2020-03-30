package sqlancer.mysql.test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import sqlancer.TestOracle;
import sqlancer.mysql.MySQLGlobalState;
import sqlancer.mysql.MySQLSchema;
import sqlancer.mysql.MySQLSchema.MySQLTable;
import sqlancer.mysql.MySQLSchema.MySQLTables;
import sqlancer.mysql.ast.MySQLColumnValue;
import sqlancer.mysql.ast.MySQLExpression;
import sqlancer.mysql.ast.MySQLSelect;
import sqlancer.mysql.ast.MySQLTableReference;
import sqlancer.mysql.ast.MySQLUnaryPostfixOperator;
import sqlancer.mysql.ast.MySQLUnaryPrefixOperation;
import sqlancer.mysql.ast.MySQLUnaryPrefixOperation.MySQLUnaryPrefixOperator;
import sqlancer.mysql.gen.MySQLRandomExpressionGenerator;

public abstract class MySQLQueryPartitioningBase implements TestOracle {

	final MySQLGlobalState state;
	final Set<String> errors = new HashSet<>();

	MySQLSchema s;
	MySQLTables targetTables;
	MySQLRandomExpressionGenerator gen;
	MySQLSelect select;
	MySQLExpression predicate;
	MySQLExpression negatedPredicate;
	MySQLExpression isNullPredicate;

	public MySQLQueryPartitioningBase(MySQLGlobalState state) {
		this.state = state;
	}

	@Override
	public void check() throws SQLException {
		s = state.getSchema();
		targetTables = s.getRandomTableNonEmptyTables();
		gen = new MySQLRandomExpressionGenerator(state).setColumns(targetTables.getColumns());
		select = new MySQLSelect();
		select.setFetchColumns(generateFetchColumns());
		List<MySQLTable> tables = targetTables.getTables();
		List<MySQLExpression> tableList = tables.stream().map(t -> new MySQLTableReference(t))
				.collect(Collectors.toList());
//		List<MySQLExpression> joins = MySQLJoin.getJoins(tableList, state);
		select.setFromList(tableList);
		select.setWhereClause(null);
//		select.setJoins(joins);
		predicate = generatePredicate();
		negatedPredicate = new MySQLUnaryPrefixOperation(predicate, MySQLUnaryPrefixOperator.NOT);
		isNullPredicate = new MySQLUnaryPostfixOperator(predicate,
				MySQLUnaryPostfixOperator.UnaryPostfixOperator.IS_NULL, false);
	}

	List<MySQLExpression> generateFetchColumns() {
		return Arrays.asList(MySQLColumnValue.create(targetTables.getColumns().get(0), null));
	}

	MySQLExpression generatePredicate() {
		return gen.generateExpression();
	}

}
