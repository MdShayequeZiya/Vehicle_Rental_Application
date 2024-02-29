package com.ff.rentalApp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String userName;
	
	@Column(unique = true)
	private String email;
	private String password;
	private long mobileNo;
	private String userRole;
	
	@OneToMany(mappedBy = "user")
	private List<Booking> listBooking;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn
	private Address address;
}
