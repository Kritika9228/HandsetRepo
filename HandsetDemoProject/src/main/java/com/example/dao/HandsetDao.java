package com.example.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.model.Handset;

public interface HandsetDao {
	public List<Handset> getAllHandset();
	
	//public Handset getHandsetByName(String name);

}
