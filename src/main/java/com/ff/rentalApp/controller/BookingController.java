package com.ff.rentalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ff.rentalApp.dto.ResponseStructure;
import com.ff.rentalApp.entity.Booking;
import com.ff.rentalApp.service.BookingService;

@RestController
@RequestMapping("/rent")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/book")
	public ResponseEntity<ResponseStructure<String>> saveBooking(@RequestHeader int userId, @RequestHeader int vehicleId, @RequestBody Booking booking){
		return bookingService.saveBooking(userId, vehicleId, booking);
	}

}
