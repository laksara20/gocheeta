package com.laksara.gocheeta.dao;

public class VehicleCategoryFactory {
	public static VehicleCategoryManager getVehicleCategoryManagerInstance() {
		return new VehicleCategoryManagerImpl();
		
	}
}
