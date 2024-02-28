package com.ff.rentalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ff.rentalApp.service.BookingService;

@RestController
@RequestMapping("/rent")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	

}
