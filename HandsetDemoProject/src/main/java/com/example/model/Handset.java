package com.example.model;

import java.util.List;

public class Handset {
	private String manufacturerCompany;
	private String manufacturerCountry;
	private String modelNumber;
	private double screenSize;
	private String internalMemorySize;
	private String externalMemorySize;
	private long width;
	private List<String> sensors;
	private String osVersion;
	private String batteryCapacity;
	private boolean isWarranty;

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
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
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
	public void setHeight(long width) {
		this.width = width;
	}
	public List<String> getSensors() {
		return sensors;
	}
	public void setSensors(List<String> sensors) {
		this.sensors = sensors;
	}
	public String getOSversion() {
		return osVersion;
	}
	public void setOSversion(String oSversion) {
		osVersion = oSversion;
	}
	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public boolean isWarranty() {
		return isWarranty;
	}
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public Handset(String manufacturerCompany, String manufacturerCountry, String modelNumber, double screenSize,
			String internalMemorySize, String externalMemorySize, long width, List<String> sensors, String osVersion,
			String batteryCapacity, boolean isWarranty) {
		super();
		this.manufacturerCompany = manufacturerCompany;
		this.manufacturerCountry = manufacturerCountry;
		this.modelNumber = modelNumber;
		this.screenSize = screenSize;
		this.internalMemorySize = internalMemorySize;
		this.externalMemorySize = externalMemorySize;
		this.width = width;
		this.sensors = sensors;
		this.osVersion = osVersion;
		this.batteryCapacity = batteryCapacity;
		this.isWarranty = isWarranty;
	}
	
	
	
	
	
	
	

}
