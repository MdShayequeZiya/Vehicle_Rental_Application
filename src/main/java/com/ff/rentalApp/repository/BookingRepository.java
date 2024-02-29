package com.ff.rentalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ff.rentalApp.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
	
	public Booking findById(int id);

}
