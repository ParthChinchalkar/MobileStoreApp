package com.capg.mobileStoreApp.backend.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends Exception {
	
	String msg;

	public CustomerNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	
}
