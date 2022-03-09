package com.capg.mobileStoreApp.backend.Service;

import java.util.List;

import com.capg.mobileStoreApp.backend.Exceptions.MobileNotFoundException;
import com.capg.mobileStoreApp.backend.Model.Cart;
import com.capg.mobileStoreApp.backend.Model.Mobile;

public interface CartService {
	public Mobile addMobileItems(List<Mobile> mobiles);

	public Mobile deleteMobileItems(int mobileId) throws MobileNotFoundException;

	public Mobile updateMobileItemquantity(int mobileId);

	public List<Mobile> showAllMobileItems(int cartId);

	public int placeOrder(Cart cart);
}
