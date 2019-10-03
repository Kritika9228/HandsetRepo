package com.example.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.model.Sensor;

public interface HandsetService {
	public List<Sensor> getAllHandset();
	
	public Sensor getHandsetByName(String name);

}
