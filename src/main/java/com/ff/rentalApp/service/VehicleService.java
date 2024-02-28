package com.ff.rentalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ff.rentalApp.dao.VehicleDao;
import com.ff.rentalApp.dto.ResponseStructure;
import com.ff.rentalApp.entity.Vehicle;

@Service
public class VehicleService {
	@Autowired
	private VehicleDao vehicleDao;
	
	public ResponseEntity<ResponseStructure<Vehicle>> saveVehicle(Vehicle vehicle){
		Vehicle receivedVehicle= vehicleDao.saveVehicle(vehicle);
		ResponseStructure<Vehicle> response=new ResponseStructure<Vehicle>();
		response.setStatusCode(HttpStatus.CREATED.value());
		response.setMessage("vehicle is added");
		response.setData(receivedVehicle);
		return new ResponseEntity<ResponseStructure<Vehicle>>(response,HttpStatus.CREATED);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
