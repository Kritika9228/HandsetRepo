package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile")
public class Mobile {
	
	@Id
	@Column(name="Model_id")
	private long modelId;
	
	@Column(name="Model_name")
	private String modelName;
	
	@Column(name="Os_name")
	private String osName;
	
	@Column(name="Price")
	private double price;
	
	@Column(name="Manufacturer_company")
	private String manufacturerCompany;
	
	@Column(name="Manufacturer_country")
	private String manufacturerCountry;
	
	@Column(name="Screen_size")
	private double screenSize;
	
	@Column(name="Internal_memory")
	private String internalMemorySize;
	
	@Column(name="External_memory")
	private String externalMemorySize;
	
	@Column(name="Mobile_width")
	private long width;
	//private List<Sensor> sensors;
	
	@Column(name="Android_version")
	private String androidVersion;
	
	@Column(name="Battery_capacity")
	private String batteryCapacity;
	
	public Mobile() {
	}
	public Mobile(String desc) {
		this.modelName=desc;
	}
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public long getModelId() {
		return modelId;
	}
	public void setModelId(long modelId) {
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
	public String getManufacturerCompany() {
		return manufacturerCompany;
	}
	public void setManufacturerCompany(String manufacturerCompany) {
		this.manufacturerCompany = manufacturerCompany;
	}
	public String getManufacturerCountry() {
		return manufacturerCountry;
	}
	public void setManufacturerCountry(String manufacturerCountry) {
		this.manufacturerCountry = manufacturerCountry;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public String getInternalMemorySize() {
		return internalMemorySize;
	}
	public void setInternalMemorySize(String internalMemorySize) {
		this.internalMemorySize = internalMemorySize;
	}
	public String getExternalMemorySize() {
		return externalMemorySize;
	}
	public void setExternalMemorySize(String externalMemorySize) {
		this.externalMemorySize = externalMemorySize;
	}
	public long getWidth() {
		return width;
	}
	public void setWidth(long width) {
		this.width = width;
	}
	public String getAndroidVersion() {
		return androidVersion;
	}
	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}
	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

}
