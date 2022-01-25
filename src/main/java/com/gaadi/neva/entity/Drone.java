package com.gaadi.neva.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "drone")
public class Drone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "image_url")
	private String imageURL;
	
	@Column(name = "price")
	private Integer priceInRs;

	public Drone(String model, String imageURL, Integer price) {
		this.model = model;
		this.imageURL = imageURL;
		this.priceInRs = price;
	}

	public int getId() {
		return id;
	}

	public Drone() {
			}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getPriceInRs() {
		return priceInRs;
	}

	public void setPriceInRs(Integer priceInRs) {
		this.priceInRs = priceInRs;
	}

		
	
}
