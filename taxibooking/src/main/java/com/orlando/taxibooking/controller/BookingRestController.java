package com.orlando.taxibooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.taxibooking.model.Booking;
import com.orlando.taxibooking.serviceimpl.BookingServiceImpl;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class BookingRestController {
	@Autowired
	BookingServiceImpl bookingService;
	
	@PostMapping("/booking")
	public Booking bookVehicle(@RequestBody Booking b) {
		
		return bookingService.bookVehicle(b);
	}

}
