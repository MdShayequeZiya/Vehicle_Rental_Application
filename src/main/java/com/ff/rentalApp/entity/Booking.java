package com.ff.rentalApp.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Booking {
	
	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn
	private Vehicle vehicle;
	
	@ManyToOne
	@JoinColumn
	private User user;
	
	@OneToOne
	private Review review;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;
	
	

}
