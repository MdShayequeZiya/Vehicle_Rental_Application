package com.ff.rentalApp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.ff.rentalApp.entity.User;
=======
>>>>>>> cb087c285a22052e4b16e46e85450d47d36f818c
import com.ff.rentalApp.entity.Vehicle;
import com.ff.rentalApp.repository.VehicleRepository;

@Repository
public class VehicleDao {
	@Autowired
	private VehicleRepository vehicleRepository;
	@Autowired
	private UserDao userDao;

	// save vehicle
	public Vehicle saveVehicle(int id, Vehicle vehicle) {
		User receivedUser = userDao.findUserbyId(id);
		if (receivedUser != null && receivedUser.getUserRole().equalsIgnoreCase("merchant")) {
			return vehicleRepository.save(vehicle);

		} else
			return null;
	}

	// update vehicle details
	public Vehicle updateVehicle(int userId, int vehicleId, Vehicle vehicle) {
		User receivedUser = userDao.findUserbyId(userId);

		if (receivedUser != null && "merchant".equalsIgnoreCase(receivedUser.getUserRole())) {
			Optional<Vehicle> optionalVehicle = vehicleRepository.findById(vehicleId);
			if (optionalVehicle.isPresent()) {
				Vehicle updatedVehicle = optionalVehicle.get();
				updatedVehicle.setType(vehicle.getType());
				updatedVehicle.setLocation(vehicle.getLocation());
				updatedVehicle.setAvailable(vehicle.isAvailable());
				updatedVehicle.setModel(vehicle.getModel());
				updatedVehicle.setVehicleNumber(vehicle.getVehicleNumber());
				
				return vehicleRepository.save(updatedVehicle);
			} else {
				return null;
			}
		} else {
			return null;
		}
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

	// delete the vehicle
	public String deleteVehicle(int userId, int vehicleId) {
		User receivedUser = userDao.findUserbyId(userId);
		if (receivedUser != null && receivedUser.getUserRole().equalsIgnoreCase("merchant")) {
			Optional<Vehicle> option = vehicleRepository.findById(vehicleId);
			if (option.isPresent()) {
				vehicleRepository.deleteById(vehicleId);
				return "vehicle is removed";
			} else
				return null;
		} else
			return null;
	}

}
