package com.orlando.taxibooking.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.taxibooking.dao.BookingRepository;
import com.orlando.taxibooking.model.Booking;
import com.orlando.taxibooking.serviceinterf.IBookingService;
@Service
public class BookingServiceImpl implements IBookingService{
    
	@Autowired
	BookingRepository bookingRepos;
	@Override
	public Booking bookVehicle(Booking b) {
		// TODO Auto-generated method stub
		return bookingRepos.save(b);
	}

}
