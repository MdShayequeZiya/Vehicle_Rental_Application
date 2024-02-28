package com.ff.rentalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ff.rentalApp.dto.ResponseStructure;
import com.ff.rentalApp.entity.Vehicle;
import com.ff.rentalApp.service.VehicleService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
//@RequestMapping("/vehicles")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;

	
	@ApiResponses(value = @ApiResponse(description = "vehicle created", responseCode = "201"))
	@Operation(description = "To save the Vehicle information", summary = "The Vehicle datas are saved in the database")
	@PostMapping("/vehicles")
	public ResponseEntity<ResponseStructure<Vehicle>> saveUser(@RequestBody Vehicle vehicle) {
		return vehicleService.saveVehicle(vehicle);
	}	
	
	
	
	
	
	
	
	
	
	
}
