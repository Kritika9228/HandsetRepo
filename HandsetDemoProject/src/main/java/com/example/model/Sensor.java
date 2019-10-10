package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
//	@Column(name="model_id")
//	private long modelId;
	
	@ManyToOne
	@JoinColumn(name="mobile_id")
	private Mobile mobile;
	
	
	
	public Mobile getMobile() {
		return mobile;
	}
	public Sensor setMobile(Mobile mobile) {
		this.mobile = mobile;
		return this;
	}
	public long getSensorId() {
		return sensorId;
	}
	public Sensor setSensorId(long sensorId) {
		this.sensorId = sensorId;
		return this;
	}
	public String getSensorName() {
		return sensorName;
	}
	public Sensor setSensorName(String sensorName) {
		this.sensorName = sensorName;
		return this;
	}
	public String getSensorDesc() {
		return sensorDesc;
	}
	public Sensor setSensorDesc(String sensorDesc) {
		this.sensorDesc = sensorDesc;
		return this;
	}
//	public long getModelId() {
//		return modelId;
//	}
//	public void setModelId(long modelId) {
//		this.modelId = modelId;
//	}
	
	
}
