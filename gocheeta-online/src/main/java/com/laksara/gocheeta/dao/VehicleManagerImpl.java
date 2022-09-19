package com.laksara.gocheeta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.laksara.gocheeta.model.Vehicle;

public class VehicleManagerImpl implements VehicleManager{
	
	/*
	 * 1. Import the Package 2. Load the Driver 3. Establish the connection 4.
	 * Create the statement 5. Execute the query 6. Process the result 7. Close the
	 * connection and the statement
	 */

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		MySQLDBConnectorImpl mysql = new MySQLDBConnectorImpl();
		return mysql.getConnection();

	}


	public boolean addVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		
		String query = "INSERT INTO vehicle(numberPlate,categoryID) VALUES(?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, vehicle.getNumberPlate());
		ps.setString(2, vehicle.getCategoryID());
		
		int result = ps.executeUpdate();
		connection.close();
		
		return result > 0;
	}


	public Vehicle getVehicle(String numberPlate) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "SELECT * FROM vehicle WHERE numberPlate = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, numberPlate);
		
		ResultSet rs = ps.executeQuery();
		
		Vehicle vehicle = new Vehicle();
		
		while(rs.next()) {
			vehicle.setNumberPlate(rs.getString("numberPlate"));
			vehicle.setCategoryID(rs.getString("categoryID"));
		}
		
		ps.close();
		connection.close();
		
		return vehicle;
	}


	public List<Vehicle> getVehicles() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "SELECT * FROM vehicle";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		List<Vehicle> vehicleList = new ArrayList<>();
		
		while(rs.next()) {
			Vehicle vehicle = new Vehicle();
			vehicle.setNumberPlate(rs.getString("numberPlate"));
			vehicle.setCategoryID(rs.getString("categoryID"));
			vehicleList.add(vehicle);
		}
		
		st.close();
		connection.close();
		
		
		return vehicleList;
	}


	public boolean deleteVehicle(String numberPlate) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "DELETE FROM vehicle WHERE numberPlate = ?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, numberPlate);
		
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		
		return result > 0;
	}


	//no need to update a vehicle because there are only two fields
	public boolean updateVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {

		return false;
	}


}
