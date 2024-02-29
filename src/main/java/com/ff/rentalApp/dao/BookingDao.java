package com.ff.rentalApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ff.rentalApp.entity.Booking;
import com.ff.rentalApp.repository.BookingRepository;

@Repository
public class BookingDao {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	
	public Booking saveBooking(Booking booking) {
	
		return bookingRepository.save(booking);
		
	}
	
	
	public Booking findBookingById(int id) {
		
		return bookingRepository.findById(id);
	}
	
	
	public void deleteBooking(Booking booking) {
		
		bookingRepository.delete(booking);
		
		
	}

}
