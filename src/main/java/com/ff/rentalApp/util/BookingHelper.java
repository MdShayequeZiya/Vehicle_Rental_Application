package com.ff.rentalApp.util;

import java.util.List;

import com.ff.rentalApp.entity.Booking;
import com.ff.rentalApp.entity.Vehicle;

public class BookingHelper {
	
	public static boolean isAvailable(Booking newBooking, Vehicle receivedVehicle) {
		List<Booking> bookings = receivedVehicle.getBookings();
		for(Booking booking: bookings) {
			if(booking.getStartTime().isBefore(booking.getEndTime())) {
				return false;
			}
		}
		return true;
	}
}
