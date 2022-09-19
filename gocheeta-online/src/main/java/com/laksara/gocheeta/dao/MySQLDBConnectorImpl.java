package com.laksara.gocheeta.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDBConnectorImpl implements DBConnector {

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/gocheeta";
		String username = "root";
		String password = "password";
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

}
