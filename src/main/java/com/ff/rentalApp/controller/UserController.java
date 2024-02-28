package com.ff.rentalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ff.rentalApp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

}
