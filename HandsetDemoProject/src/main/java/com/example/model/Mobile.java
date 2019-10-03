package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile")
public class Mobile {
	@Column(name="Model_name")
	private String modelName;
	@Id
	@Column(name="Model_id")
	private int modelId;
	@Column(name="Os_name")
	private String osName;
	@Column(name="Price")
	private double price;
	public String getModelName() {
		return modelName;
	}
	public Mobile() {
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
