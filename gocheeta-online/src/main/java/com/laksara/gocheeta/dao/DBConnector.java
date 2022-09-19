package com.laksara.gocheeta.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBConnector {
	public Connection getConnection() throws ClassNotFoundException, SQLException;

}
