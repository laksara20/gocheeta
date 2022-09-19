package com.laksara.gocheeta.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laksara.gocheeta.dao.VehicleCategoryFactory;
import com.laksara.gocheeta.dao.VehicleCategoryManager;
import com.laksara.gocheeta.model.VehicleCategory;

public class VehicleCategoryService {
	
	private static VehicleCategoryService vehicleCategoryServiceObj;

	private VehicleCategoryService() {

	}
	
	public static synchronized VehicleCategoryService getVehicleCategoryService() {
		if(vehicleCategoryServiceObj == null)
			vehicleCategoryServiceObj = new VehicleCategoryService();
		
		return vehicleCategoryServiceObj;
		
	}
	
	//Services provided by VehicleCategoryService Class
	
	//Create A Vehicle Category
	public boolean addVehicleCategory(VehicleCategory vehicleCategory) throws ClassNotFoundException, SQLException {
		VehicleCategoryManager vehicleCategoryManager = VehicleCategoryFactory.getVehicleCategoryManagerInstance();
		
		return vehicleCategoryManager.addVehicleCategory(vehicleCategory);
		
	}
	
	//Read A Vehicle Category
	public VehicleCategory getVehicleCategory(String categoryID) throws ClassNotFoundException, SQLException {
		VehicleCategoryManager vehicleCategoryManager = VehicleCategoryFactory.getVehicleCategoryManagerInstance();

		return vehicleCategoryManager.getVehicleCategory(categoryID);
	}
	
	
	//Read All Vehicle Categories
	public List<VehicleCategory> getVehicleCategories() throws ClassNotFoundException, SQLException{
		VehicleCategoryManager vehicleCategoryManager = VehicleCategoryFactory.getVehicleCategoryManagerInstance();
		
		
		return vehicleCategoryManager.getVehicleCategories();
		
	}
	
	//Update A Vehicle Category
	public boolean updateVehicleCategory(VehicleCategory vehicleCategory) throws ClassNotFoundException, SQLException {
		VehicleCategoryManager vehicleCategoryManager = VehicleCategoryFactory.getVehicleCategoryManagerInstance();
		return vehicleCategoryManager.updateVehicleCategory(vehicleCategory);
	}
	
	
	//Delete A Vehicle Category
	public boolean deleteVehicleCategory(String categoryID) throws ClassNotFoundException, SQLException {
		VehicleCategoryManager vehicleCategoryManager = VehicleCategoryFactory.getVehicleCategoryManagerInstance();
		return vehicleCategoryManager.deleteVehicleCategory(categoryID);
	}
	
}
