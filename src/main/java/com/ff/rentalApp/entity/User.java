package com.ff.rentalApp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String userName;
	private String email;
	private String password;
	private double mobileNo;
	private String userRole;
	
	@OneToMany(mappedBy = "user")
	private List<Booking> listBooking;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	
	
}
