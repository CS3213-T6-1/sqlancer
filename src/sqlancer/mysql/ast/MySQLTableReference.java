package sqlancer.mysql.ast;

import sqlancer.mysql.MySQLSchema.MySQLTable;

public class MySQLTableReference extends MySQLExpression {
	
	private MySQLTable table;

	public MySQLTableReference(MySQLTable table) {
		this.table = table;
	}
	
	public MySQLTable getTable() {
		return table;
	}
	
}
