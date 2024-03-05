package com.ff.rentalApp.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ff.rentalApp.entity.Booking;
import com.ff.rentalApp.entity.User;
import com.ff.rentalApp.entity.Vehicle;


@SpringBootTest
class BookingDaoTest {
	
	
	@Autowired
	private BookingDao bookingDao;
	
	@Autowired
	private VehicleDao vehicleDao;
	
	@Autowired UserDao userDao;
	
	
	@Test
	public void testSave() {
		
		Vehicle vehicle = vehicleDao.findVehicleById(1);
		
		User user = userDao.findUserbyId(1);
		
		
		Booking booking = new Booking();
		booking.setStartTime(LocalDateTime.of(2024, 3, 7, 12, 00, 00));
		booking.setEndTime(LocalDateTime.of(2024, 03, 8, 12, 00, 00));
		booking.setUser(user);
		booking.setVehicle(vehicle);
		
		
		Booking savedBooking = bookingDao.saveBooking(booking);
		
		assertNotNull(savedBooking.getId());
		assertEquals("Ziya", savedBooking.getUser().getUserName());		
		
	}
	
	
	@Test
	public void testFindById() {
		
		
		int bookingId = 52;
		
		Booking booking = bookingDao.findBookingById(bookingId);
		
		assertNotNull(booking.getStartTime());
		assertNotNull(booking.getEndTime());
		
	}
	
	
	@Test
	public void testDeleteBooking() {
		
		Booking booking = bookingDao.findBookingById(102);
		
		bookingDao.deleteBooking(booking);
		
		booking = bookingDao.findBookingById(102);
		
		assertNull(booking);
		
		
	}

	

}
