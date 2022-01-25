package com.gaadi.neva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cars")
public class Car {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "price")
	private Integer priceInRs;

	@Column(name = "image_url")
	private String imageURL;

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public Car() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Integer getPriceInRs() {
		return priceInRs;
	}

	public void setPriceInRs(Integer priceInRs) {
		this.priceInRs = priceInRs;
	}

		
	
	
	
}
