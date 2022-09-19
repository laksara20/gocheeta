package com.laksara.gocheeta.dao;

public class VehicleFactory {
	public static VehicleManager getVehicleManagerInstance() {
		return new VehicleManagerImpl();
		
	}
}
