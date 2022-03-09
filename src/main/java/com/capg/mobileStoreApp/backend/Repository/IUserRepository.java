package com.capg.mobileStoreApp.backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.mobileStoreApp.backend.Exceptions.UserNotFoundException;
import com.capg.mobileStoreApp.backend.Model.User;



public interface IUserRepository extends JpaRepository<User, Long>{
	
}
