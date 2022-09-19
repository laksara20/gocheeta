package com.laksara.gocheeta.dao;

import java.sql.SQLException;
import java.util.List;

import com.laksara.gocheeta.model.Vehicle;

public interface VehicleManager {
	public boolean addVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException;
	public Vehicle getVehicle(String numberPlate) throws ClassNotFoundException, SQLException;
	public List<Vehicle> getVehicles() throws ClassNotFoundException, SQLException;
	public boolean updateVehicle(Vehicle vehicle) throws ClassNotFoundException, SQLException;
	public boolean deleteVehicle(String numberPlate) throws ClassNotFoundException, SQLException;
}
