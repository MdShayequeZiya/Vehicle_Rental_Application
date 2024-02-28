package com.ff.rentalApp.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ApplicationException extends RuntimeException {
	
	
	String message = "You are not authorised to perform this operation";
	
	

}
