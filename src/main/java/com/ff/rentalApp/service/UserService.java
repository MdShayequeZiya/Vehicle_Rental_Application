package com.ff.rentalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ff.rentalApp.dao.UserDao;
import com.ff.rentalApp.dto.ResponseStructure;
import com.ff.rentalApp.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public ResponseEntity<ResponseStructure<User>> saveUser(User user) {

		User receivedUser = userDao.saveUser(user);

		ResponseStructure<User> rs = new ResponseStructure<User>();
		rs.setMessage("User successfully added");
		rs.setStatusCode(HttpStatus.CREATED.value());
		rs.setData(receivedUser);

		return new ResponseEntity<ResponseStructure<User>>(rs, HttpStatus.CREATED);

	}

	public ResponseEntity<ResponseStructure<User>> findUser(String email, String password) {
		User receivedUser = userDao.findUser(email, password);

		ResponseStructure<User> rs = new ResponseStructure<User>();
		rs.setMessage("User Fetched successfully added");
		rs.setStatusCode(HttpStatus.CREATED.value());
		rs.setData(receivedUser);

		return new ResponseEntity<ResponseStructure<User>>(rs, HttpStatus.CREATED);

	}

	public ResponseEntity<ResponseStructure<User>> findUserbyId(int id) {
		User receivedUser = userDao.findUserbyId(id);

		ResponseStructure<User> rs = new ResponseStructure<User>();
		rs.setMessage("User Fetched successfully added");
		rs.setStatusCode(HttpStatus.CREATED.value());
		rs.setData(receivedUser);

		return new ResponseEntity<ResponseStructure<User>>(rs, HttpStatus.CREATED);

	}
}
