package com.orlando.taxibooking.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.taxibooking.dao.VehicleRepository;
import com.orlando.taxibooking.model.Vehicle;
import com.orlando.taxibooking.serviceinterf.IVehicleService;

@Service
public class VehicleServiceImpl implements IVehicleService{
    
	@Autowired
	VehicleRepository vehicleRespos;
	
	@Override
	public Vehicle addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		return vehicleRespos.save(v);
	}

	@Override
	public List<Vehicle> findAllVehicle() {
		// TODO Auto-generated method stub
		return vehicleRespos.findAll();
				
	}

}