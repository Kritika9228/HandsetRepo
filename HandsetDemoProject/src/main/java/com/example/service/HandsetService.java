package com.example.service;

import java.util.List;
import java.util.Set;
import com.example.model.Mobile;

public interface HandsetService {
	//public List<Sensor> getAllHandset();
	
	public List<Mobile> getHandsetByModelName(Set<String> names);

}
