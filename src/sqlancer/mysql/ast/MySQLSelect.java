package sqlancer.mysql.ast;

import java.util.Collections;
import java.util.List;

public class MySQLSelect extends MySQLExpression {

	private SelectType fromOptions;
	private List<MySQLExpression> fromList = Collections.emptyList();
	private MySQLExpression whereClause;
	private List<MySQLExpression> groupByClause = Collections.emptyList();
	private MySQLExpression limitClause;
	private List<MySQLExpression> orderByClause = Collections.emptyList();
	private MySQLExpression offsetClause;
	private List<MySQLExpression> fetchColumns = Collections.emptyList();
	private List<MySQLJoin> joinStatements = Collections.emptyList();
	private List<String> modifiers = Collections.emptyList();

	public enum SelectType {
		DISTINCT, ALL, DISTINCTROW;
	}

	public void setSelectType(SelectType fromOptions) {
		this.setFromOptions(fromOptions);
	}

	public void setFromTables(List<MySQLExpression> fromTables) {
		this.setFromList(fromTables);
	}

	public SelectType getFromOptions() {
		return fromOptions;
	}

	public void setFromOptions(SelectType fromOptions) {
		this.fromOptions = fromOptions;
	}

	public List<MySQLExpression> getFromList() {
		return fromList;
	}

	public void setFromList(List<MySQLExpression> fromList) {
		this.fromList = fromList;
	}

	public MySQLExpression getWhereClause() {
		return whereClause;
	}

	public void setWhereClause(MySQLExpression whereClause) {
		this.whereClause = whereClause;
	}

	public void setGroupByClause(List<MySQLExpression> groupByClause) {
		this.groupByClause = groupByClause;
	}

	public List<MySQLExpression> getGroupByClause() {
		return groupByClause;
	}

	public void setLimitClause(MySQLExpression limitClause) {
		this.limitClause = limitClause;
	}

	public MySQLExpression getLimitClause() {
		return limitClause;
	}

	public List<MySQLExpression> getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(List<MySQLExpression> orderBy) {
		this.orderByClause = orderBy;
	}

	public void setOffsetClause(MySQLExpression offsetClause) {
		this.offsetClause = offsetClause;
	}

	public MySQLExpression getOffsetClause() {
		return offsetClause;
	}

	public void setFetchColumns(List<MySQLExpression> fetchColumns) {
		this.fetchColumns = fetchColumns;
	}

	public List<MySQLExpression> getFetchColumns() {
		return fetchColumns;
	}

	public void setJoinClauses(List<MySQLJoin> joinStatements) {
		this.joinStatements = joinStatements;
	}

	public List<MySQLJoin> getJoinClauses() {
		return joinStatements;
	}

	public void setModifiers(List<String> modifiers) {
		this.modifiers = modifiers;
	}

	public List<String> getModifiers() {
		return modifiers;
	}

	@Override
	public MySQLConstant getExpectedValue() {
		return null;
	}
	
}
