package com.ff.rentalApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.rentalApp.entity.Vehicle;
import com.ff.rentalApp.repository.VehicleRepository;

@Repository
public class VehicleDao {
	@Autowired
	private VehicleRepository vehicleRepository;
	
	//save vehicle
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
