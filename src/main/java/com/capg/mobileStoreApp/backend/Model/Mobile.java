package com.capg.mobileStoreApp.backend.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mobile")
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mobileId;
	private String mobileName;
	private float mobileCost;
	private LocalDate mfd;
	private String modelNumber;
	private String companyName;
	private Category category;
	
	
	
	public Mobile() {
		super();
	}



	public Mobile(int mobileId, String mobileName, float mobileCost, LocalDate mfd, String modelNumber,
			String companyName, Category category) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileCost = mobileCost;
		this.mfd = mfd;
		this.modelNumber = modelNumber;
		this.companyName = companyName;
		this.category = category;
	}



	public int getMobileId() {
		return mobileId;
	}



	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}



	public String getMobileName() {
		return mobileName;
	}



	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}



	public float getMobileCost() {
		return mobileCost;
	}



	public void setMobileCost(float mobileCost) {
		this.mobileCost = mobileCost;
	}



	public LocalDate getMfd() {
		return mfd;
	}



	public void setMfd(LocalDate mfd) {
		this.mfd = mfd;
	}



	public String getModelNumber() {
		return modelNumber;
	}



	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}