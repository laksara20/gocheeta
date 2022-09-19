package com.laksara.gocheeta.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.laksara.gocheeta.model.VehicleCategory;

public class VehicleCategoryManagerImpl implements VehicleCategoryManager {

	/*
	 * 1. Import the Package 2. Load the Driver 3. Establish the connection 4.
	 * Create the statement 5. Execute the query 6. Process the result 7. Close the
	 * connection and the statement
	 */

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		MySQLDBConnectorImpl mysql = new MySQLDBConnectorImpl();
		return mysql.getConnection();

	}

	public boolean addVehicleCategory(VehicleCategory vehicleCategory) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();

		String query = "INSERT INTO vehicle_category(categoryID,categoryName) VALUES(?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, vehicleCategory.getCategoryID());
		ps.setString(2, vehicleCategory.getCategoryName());
		
		int result = ps.executeUpdate();
		connection.close();
		
		return result > 0;
	}

	public VehicleCategory getVehicleCategory(String categoryID) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "SELECT * FROM vehicle_category WHERE categoryID = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, categoryID);
		
		ResultSet rs = ps.executeQuery();
		
		VehicleCategory vehicleCategory = new VehicleCategory();
		
		while(rs.next()) {
			vehicleCategory.setCategoryID(rs.getString("categoryID"));
			vehicleCategory.setCategoryName(rs.getString("categoryName"));
		}
		
		ps.close();
		connection.close();
			
		return vehicleCategory;
	}

	public List<VehicleCategory> getVehicleCategories() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "SELECT * FROM vehicle_category";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		List<VehicleCategory> vehicleCategoryList  = new ArrayList();
		
		
		while(rs.next()) {
			VehicleCategory vehicleCategory = new VehicleCategory();
			vehicleCategory.setCategoryID(rs.getString("categoryID"));
			vehicleCategory.setCategoryName(rs.getString("categoryName"));
			
			vehicleCategoryList.add(vehicleCategory);
		}
		
		st.close();
		connection.close();
				
		return vehicleCategoryList;
	}

	public boolean updateVehicleCategory(VehicleCategory vehicleCategory) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "UPDATE vehicle_category SET categoryName = ? WHERE categoryID = ?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,vehicleCategory.getCategoryName());
		ps.setString(2, vehicleCategory.getCategoryID());
		
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		
		return result > 0;
	}

	public boolean deleteVehicleCategory(String categoryID) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "DELETE FROM vehicle_category WHERE categoryID = ?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,categoryID);
		
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		
		return result > 0;
	}

}
