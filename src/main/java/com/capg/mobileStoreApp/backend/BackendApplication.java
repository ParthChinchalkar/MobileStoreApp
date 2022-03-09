package com.capg.mobileStoreApp.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capg.mobileStoreApp.backend.Model.User;
import com.capg.mobileStoreApp.backend.Repository.ICartRepository;
import com.capg.mobileStoreApp.backend.Repository.IUserRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{
	
	@Autowired
	IUserRepository iUserRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		iUserRepository.save(new User("Parth Chinchalkar", "Parth@12345", 80850101, "Parth@gmail.com", "customer"));
	}

}
