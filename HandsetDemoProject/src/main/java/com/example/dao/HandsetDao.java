package com.example.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.model.Sensor;

public interface HandsetDao {
	public List<Sensor> getAllHandset();
	
	//public Handset getHandsetByName(String name);

}
