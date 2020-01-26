package com.orlando.taxibooking.serviceinterf;

import java.util.List;

import com.orlando.taxibooking.model.User;
import com.orlando.taxibooking.model.Vehicle;

public interface IVehicleService {
      
	public Vehicle addVehicle(Vehicle v);
	public List<Vehicle> findAllVehicle();
}
 