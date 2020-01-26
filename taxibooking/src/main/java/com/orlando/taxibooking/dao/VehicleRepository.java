package com.orlando.taxibooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orlando.taxibooking.model.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
