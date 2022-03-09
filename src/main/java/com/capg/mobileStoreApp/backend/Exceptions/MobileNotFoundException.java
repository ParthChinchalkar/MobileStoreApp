package com.capg.mobileStoreApp.backend.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MobileNotFoundException extends Exception {
	
	String msg;

	public MobileNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	
}
