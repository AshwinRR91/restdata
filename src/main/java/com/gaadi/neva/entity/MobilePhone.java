package com.gaadi.neva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity(name = "mobile")
public class MobilePhone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "model")
	private String model;
	
	
	@Column(name = "image_url")
	private String imageURL;
	
	@Column(name = "price")
	private int priceInRs;
	
	public MobilePhone() {
	
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public MobilePhone(String companyName, String model, String imageURL, int priceInRs) {
		
		this.companyName = companyName;
		this.model = model;
		this.imageURL = imageURL;
		this.priceInRs = priceInRs;
	}


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPriceInRs() {
		return priceInRs;
	}

	public void setPriceInRs(int priceInRs) {
		this.priceInRs = priceInRs;
	}
	
}
