package com.example.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.model.Handset;

public interface HandsetService {
	public List<Handset> getAllHandset();
	
	public Handset getHandsetByName(String name);

}
