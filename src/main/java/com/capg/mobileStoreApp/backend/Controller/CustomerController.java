package com.capg.mobileStoreApp.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/")
public class CustomerController {
	
	@GetMapping("/api/v1/")
	public String sayHello() {
		return "Hello Mobile APP";
	}
}
