package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile")
public class Mobile {
	@Column(name="modelName")
	private String modelName;
	@Id
	@Column(name="modelId")
	private int modelId;
	private String osName;
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
