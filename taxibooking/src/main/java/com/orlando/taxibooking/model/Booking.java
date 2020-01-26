package com.orlando.taxibooking.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer bookingId;
	private Date bookingDate;
	private Double bookingAmount;
	
	@ManyToOne
	@JoinColumn(name = "id")
//	@JsonManagedReference
	private User user;

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Double getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(Double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Booking(Integer bookingId, Date bookingDate, Double bookingAmount, User user) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.bookingAmount = bookingAmount;
		this.user = user;
	}

	public Booking() {
		super();
	}
	
	
}