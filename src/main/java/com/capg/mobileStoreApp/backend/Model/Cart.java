package com.capg.mobileStoreApp.backend.Model;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User user;
	
	@OneToMany
	private Set<Mobile> mobile = new HashSet<Mobile>();
	
	
	private int quantity;
	private int cost;
	
	public Cart() {
		super();
	}

	public Cart(Integer cartId, User user, Set<Mobile> mobile, int quantity, int cost) {
		super();
		this.cartId = cartId;
		this.user = user;
		this.mobile = mobile;
		this.quantity = quantity;
		this.cost = cost;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(Set<Mobile> mobile) {
		this.mobile = mobile;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
