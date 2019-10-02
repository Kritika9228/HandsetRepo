package com.example.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.example.dao.HandsetDao;
import com.example.model.Handset;


@Repository
public class HandsetDaoImpl implements HandsetDao{
	Logger logger = LogManager.getLogger(HandsetDaoImpl.class);

	List<Handset> handsetList;
	List<String> sensorsList = getSensorsList();
	public HandsetDaoImpl() {
		handsetList = new ArrayList<>();
		Handset handset1= new Handset("Red Mi", "China", "Note7", 5.5, "4 GB", "32 GB", 3,sensorsList , "Mashmallow", "3200 mAh", true);
		Handset handset2= new Handset("Apple", "US", "iPhoneX", 4.5, "2 GB", "32 GB", 2,sensorsList , "safari", "7200 mAh", true);
		Handset handset3= new Handset("Blackberry", "Germany", "HotX", 2.5, "1 GB", "5 GB", 2,sensorsList , "blackberry", "4200 mAh", false);
		Handset handset4= new Handset("Real Me", "Japan", "RealX", 7.5, "3 GB", "16 GB", 3,sensorsList , "Oxygen", "3200 mAh", true);
		Handset handset5= new Handset("Oppo", "China", "Oppov7", 6.3, "4 GB", "64 GB", 3,sensorsList , "Nougat", "5200 mAh", false);
		handsetList.add(handset1);
		handsetList.add(handset2);
		handsetList.add(handset3);
		handsetList.add(handset4);
		handsetList.add(handset5);
	}

	@Override
	public List<Handset> getAllHandset() {
		logger.info("Inside HandsetDaoImpl");
		return handsetList;
	}

//	@Override
//	public Handset getHandsetByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	private List<String> getSensorsList(){
		List<String> l = new ArrayList<String>();
		l.add("ACCELEROMETER");
		l.add("AMBIENT_LIGHT_SENSOR");
		l.add("GPS_SENSOR");
		l.add("COMPASS");
		l.add("PROXIMITY");
		l.add("PRESSURE");
		l.add("GYROSCOPE");
		
		return l;
	}
}
