package com.ff.rentalApp.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Size(min = 4)
	private String userName;
	
	@Column(unique = true)
	@Email
	private String email;
	@Size(min = 8)
	private String password;
	private long mobileNo;
	
	@Pattern(regexp = "[A-Z]+", message = "String must consist of uppercase letters only")
	private String userRole;
	
	@OneToMany(mappedBy = "user")
	@JsonIgnore
	private List<Booking> listBooking;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Address address;
}
