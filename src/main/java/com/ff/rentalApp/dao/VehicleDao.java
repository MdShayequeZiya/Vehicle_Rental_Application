package com.ff.rentalApp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.rentalApp.entity.Vehicle;
import com.ff.rentalApp.exception.ApplicationException;
import com.ff.rentalApp.repository.VehicleRepository;

@Repository
public class VehicleDao {
	@Autowired
	private VehicleRepository vehicleRepository;

	// save vehicle
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	// update vehicle details
	public Vehicle updateVehicle(int id, Vehicle vehicle) {
		Optional<Vehicle> option = vehicleRepository.findById(id);
		if (option.isPresent()) {
			return vehicleRepository.save(vehicle);
		} else
			return null;
	}

	// find the vehicle by id
	public Vehicle findVehicleById(int id) {
		Optional<Vehicle> option = vehicleRepository.findById(id);
		if (option.isPresent()) {
			Vehicle vehicle = option.get();
			return vehicle;
		} else
			return null;
	}

     //delete the vehicle
	public String deleteVehicle(int id) {
		Optional<Vehicle> option = vehicleRepository.findById(id);
		if (option.isPresent()) {
			vehicleRepository.deleteById(id);
			return "vehicle is removed";
		} else
			return null;
	}
}
