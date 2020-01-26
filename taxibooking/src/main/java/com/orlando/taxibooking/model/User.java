package com.orlando.taxibooking.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
    
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
    private String name;
    private String contact;
    private String address;
    private String email;
    private String password;
    
    @OneToOne
    @JoinColumn(name="roleId")

    @JsonIgnore
    private Role role;
     
    @OneToMany(mappedBy = "user")
    private List<Booking> booking;
    
    @OneToMany(mappedBy = "user")
    private List<Vehicle> vehicle;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public User(Integer id, String name, String contact, String address, String email, String password, Role role,
			List<Booking> booking, List<Vehicle> vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.password = password;
		this.role = role;
		this.booking = booking;
		this.vehicle = vehicle;
	}

	public User() {
		super();
	}

	

	
}
