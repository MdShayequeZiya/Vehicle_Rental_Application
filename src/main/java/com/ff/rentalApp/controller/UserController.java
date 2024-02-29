package com.ff.rentalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ff.rentalApp.dto.ResponseStructure;
import com.ff.rentalApp.entity.User;
import com.ff.rentalApp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<ResponseStructure<User>> userSignup(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	@PostMapping("/login")
	public ResponseEntity<ResponseStructure<User>>userLogin(@RequestParam String email, @RequestParam String password){
		return userService.findUser(email, password);
	}
	

}
