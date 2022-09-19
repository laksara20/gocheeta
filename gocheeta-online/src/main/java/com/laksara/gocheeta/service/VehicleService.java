package com.laksara.gocheeta.service;

import java.sql.SQLException;
import java.util.List;

import com.laksara.gocheeta.dao.VehicleFactory;
import com.laksara.gocheeta.dao.VehicleManager;
import com.laksara.gocheeta.model.Vehicle;

public class VehicleService {
	private static VehicleService vehicleServiceObj;
	
	private VehicleService() {
		
	}
	
	public static synchronized VehicleService getVehicleService() {
		if(vehicleServiceObj == null)
			vehicleServiceObj = new VehicleService();
		
		return vehicleServiceObj;
	}
	
	//Service provided by VehicleService class
	
	//Create A Vehicle
	public boolean addVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {
		VehicleManager vehicleManager = VehicleFactory.getVehicleManagerInstance();
		return vehicleManager.addVehicle(vehicle);
	}
	
	//Read A Vehicle
	public Vehicle getVehicle(String numberPlate) throws ClassNotFoundException, SQLException {
		VehicleManager vehicleManager = VehicleFactory.getVehicleManagerInstance();
		return vehicleManager.getVehicle(numberPlate);
	}
	
	//Read All Vehicles
	public List<Vehicle> getVehicles() throws ClassNotFoundException, SQLException{
		VehicleManager vehicleManager = VehicleFactory.getVehicleManagerInstance();
		return vehicleManager.getVehicles();
	}
	
	//Update A Vehicle
	public boolean updateVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException {
		VehicleManager vehicleManager = VehicleFactory.getVehicleManagerInstance();
		return vehicleManager.updateVehicle(vehicle);
	}
	
	//Delete A Vehicle
	public boolean deleteVehicle(String numberPlate) throws ClassNotFoundException, SQLException {
		VehicleManager vehicleManager = VehicleFactory.getVehicleManagerInstance();
		return vehicleManager.deleteVehicle(numberPlate);
	}
}
