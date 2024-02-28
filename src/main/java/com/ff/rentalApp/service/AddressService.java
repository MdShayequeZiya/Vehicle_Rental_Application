package com.ff.rentalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ff.rentalApp.dao.AddressDao;

@Service
public class AddressService {

	@Autowired
	private AddressDao addressDao;
	
}
