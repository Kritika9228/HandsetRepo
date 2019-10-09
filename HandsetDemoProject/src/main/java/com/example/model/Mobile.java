package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "mobile")
	//@JoinColumn(name="sensor" , referencedColumnName = "model_id")
	private List<Sensor> sensors;
	
	@Column(name="Android_version")
	private String androidVersion;
	
	@Column(name="Battery_capacity")
	private String batteryCapacity;
	
//	public void addSensor(Sensor sensor) {
//		this.sensors.add(sensor);
//		sensor.setMobile(this);
//	}
	
	public Mobile() {
	}
	public Mobile(String desc) {
		this.modelName=desc;
	}
	
	public List<Sensor> getSensors() {
		return sensors;
	}
	public void setSensors(List<Sensor> sensors) {
		this.sensors = sensors;
	}
	public String getModelName() {
		return modelName;
	}
	
	public Mobile setModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}
	public long getModelId() {
		return modelId;
	}
	public Mobile setModelId(long modelId) {
		this.modelId = modelId;
		return this;
	}
	public String getOsName() {
		return osName;
	}
	public Mobile setOsName(String osName) {
		this.osName = osName;
		return this;
	}
	public double getPrice() {
		return price;
	}
	public Mobile setPrice(double price) {
		this.price = price;
		return this;
	}
	public String getManufacturerCompany() {
		return manufacturerCompany;
	}
	public Mobile setManufacturerCompany(String manufacturerCompany) {
		this.manufacturerCompany = manufacturerCompany;
		return this;
	}
	public String getManufacturerCountry() {
		return manufacturerCountry;
	}
	public Mobile setManufacturerCountry(String manufacturerCountry) {
		this.manufacturerCountry = manufacturerCountry;
		return this;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public Mobile setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public String getInternalMemorySize() {
		return internalMemorySize;
	}
	public Mobile setInternalMemorySize(String internalMemorySize) {
		this.internalMemorySize = internalMemorySize;
		return this;
	}
	public String getExternalMemorySize() {
		return externalMemorySize;
	}
	public Mobile setExternalMemorySize(String externalMemorySize) {
		this.externalMemorySize = externalMemorySize;
		return this;
	}
	public long getWidth() {
		return width;
	}
	public Mobile setWidth(long width) {
		this.width = width;
		return this;
	}
	public String getAndroidVersion() {
		return androidVersion;
	}
	public Mobile setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
		return this;
	}
	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	public Mobile setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
		return this;
	}

}
