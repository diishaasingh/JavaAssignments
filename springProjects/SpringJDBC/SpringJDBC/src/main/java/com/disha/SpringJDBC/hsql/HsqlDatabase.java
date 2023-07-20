package com.disha.SpringJDBC.hsql;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HsqlDatabase {

	public Connection conn;

	public HsqlDatabase() {
		try {
			loadJDBCDriverForHsqlDb();
			setupConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void setupConnection() throws SQLException {
		conn = DriverManager.getConnection("jdbc:hsqldb:db_file", "sa", "");

	}
    private void loadJDBCDriverForHsqlDb() throws ClassNotFoundException {
		Class.forName("org.hsqldb.jdbcDriver");
	}
    private void shutdownHsqlDatabase() throws SQLException {
		Statement st = conn.createStatement();
		st.execute("SHUTDOWN");
	}

	public void closeConnection() throws SQLException {
		shutdownHsqlDatabase();
		conn.close(); // if there are no other open connection
	}

}
