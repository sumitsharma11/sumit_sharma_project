package com.orlando.taxibooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer vehicleId;

    private String vehicleName;
	private String image;
	private Double rent;
	
	@ManyToOne
	@JoinColumn(name="id")
	//@JsonManagedReference()
    private User user;

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getRent() {
		return rent;
	}

	public void setRent(Double rent) {
		this.rent = rent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vehicle(Integer vehicleId, String vehicleName, String image, Double rent, User user) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.image = image;
		this.rent = rent;
		this.user = user;
	}

	public Vehicle() {
		super();
	}
	
	

}
