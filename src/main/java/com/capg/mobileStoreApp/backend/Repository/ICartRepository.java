package com.capg.mobileStoreApp.backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.mobileStoreApp.backend.Exceptions.MobileNotFoundException;
import com.capg.mobileStoreApp.backend.Model.Cart;
import com.capg.mobileStoreApp.backend.Model.Mobile;


public interface ICartRepository extends JpaRepository<Cart, Integer> {

	
}
