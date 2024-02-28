package com.ff.rentalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ff.rentalApp.dao.BookingDao;
import com.ff.rentalApp.dto.ResponseStructure;

@Service
public class BookingService {
	
	@Autowired
	private BookingDao bookingDao;
	
	
	public ResponseEntity<ResponseStructure<String>> createReview(int userId, int bookingId){
		
		return null;
		
		
	}

}
