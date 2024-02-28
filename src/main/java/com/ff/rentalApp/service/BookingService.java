package com.ff.rentalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ff.rentalApp.dao.BookingDao;
import com.ff.rentalApp.dao.UserDao;
import com.ff.rentalApp.dao.VehicleDao;
import com.ff.rentalApp.dto.ResponseStructure;
import com.ff.rentalApp.entity.Booking;
import com.ff.rentalApp.entity.Review;
import com.ff.rentalApp.entity.User;
import com.ff.rentalApp.entity.Vehicle;
import com.ff.rentalApp.exception.ApplicationException;
import com.ff.rentalApp.util.BookingHelper;

@Service
public class BookingService {

	@Autowired
	private BookingDao bookingDao;

	@Autowired
	private UserDao userDao;

	@Autowired
	private VehicleDao vehicleDao;

	public ResponseEntity<ResponseStructure<String>> createReview(int userId, int bookingId, Review review) {

		User receivedUser = userDao.findUserbyId(userId);
		Booking booking = bookingDao.findBookingById(bookingId);

		if (receivedUser != null && receivedUser.getUserRole().equals("customer")) {

			if (booking != null) {

				booking.setReview(review);

				bookingDao.saveBooking(booking);

				ResponseStructure<String> rs = new ResponseStructure<>();
				rs.setStatusCode(HttpStatus.CREATED.value());
				rs.setMessage("Success");
				rs.setData("Review added successfully!");

				return new ResponseEntity<ResponseStructure<String>>(rs, HttpStatus.OK);

			} else {
				throw new ApplicationException("Wrong Booking Id!!!");
			}

		} else {
			throw new ApplicationException("Customer does not exist!!!");
		}

	}

	public ResponseEntity<ResponseStructure<String>> saveBooking(int userId, int vehicleId, Booking booking) {

		User receivedUser = userDao.findUserbyId(userId);
		Vehicle receivedVehicle = vehicleDao.findVehicle(vehicleId);

		if (receivedUser != null && receivedUser.getUserRole().equals("customer")) {
			if (receivedVehicle != null && BookingHelper.isAvailable(booking, receivedVehicle)) {
				booking.setVehicle(receivedVehicle);
				booking.setUser(receivedUser);
				bookingDao.saveBooking(booking);
				// response structure
				ResponseStructure<String> responseStructure = new ResponseStructure<String>();
				responseStructure.setData("Booking saved successfully!!!");
				responseStructure.setStatusCode(HttpStatus.CREATED.value());
				responseStructure.setMessage("Success");
				return new ResponseEntity<ResponseStructure<String>>(responseStructure, HttpStatus.CREATED);
			} else {
				throw new ApplicationException("Vehicle not available for booking!!!");
			}
		} else {
			throw new ApplicationException("Customer does not exist!!!");
		}

	}

}
