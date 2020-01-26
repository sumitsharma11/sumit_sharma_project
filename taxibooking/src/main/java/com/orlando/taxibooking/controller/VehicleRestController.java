package com.orlando.taxibooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.orlando.taxibooking.model.Vehicle;
import com.orlando.taxibooking.serviceimpl.VehicleServiceImpl;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class VehicleRestController {

	@Autowired
	VehicleServiceImpl vehicleService;
	
	@PostMapping("/vehicleregister")
	public Vehicle addVehicle(@RequestBody Vehicle v)
	{
		return vehicleService.addVehicle(v);
	}
	
	@GetMapping("/vehicle")
	public List<Vehicle> findAllVehicle() 
	{
		return vehicleService.findAllVehicle();
		
	}
	
	
}
