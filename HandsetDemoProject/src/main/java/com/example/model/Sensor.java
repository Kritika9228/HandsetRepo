package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sensor")
public class Sensor {
	@Id
	@Column(name="sensor_id")
	private long sensorId;
	
	@Column(name="sensor_name")
	private String sensorName;
	
	@Column(name="sensor_desc")
	private String sensorDesc;
	
	public long getSensorId() {
		return sensorId;
	}
	public void setSensorId(long sensorId) {
		this.sensorId = sensorId;
	}
	public String getSensorName() {
		return sensorName;
	}
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	public String getSensorDesc() {
		return sensorDesc;
	}
	public void setSensorDesc(String sensorDesc) {
		this.sensorDesc = sensorDesc;
	}
	
	
}
