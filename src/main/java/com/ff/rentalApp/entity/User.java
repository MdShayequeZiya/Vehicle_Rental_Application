package com.ff.rentalApp.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
	
	@Id
	private int id;
	
	private String userName;
	private String email;
	private String password;
	private double mobileNo;
	private String userRole;
	
	@OneToMany
	private List<Booking> listBooking;
	
	@OneToOne
	private Address address;
	
	
	
}
