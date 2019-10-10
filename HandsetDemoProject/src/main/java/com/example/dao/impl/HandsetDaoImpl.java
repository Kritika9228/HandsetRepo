package com.example.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.example.dao.HandsetDao;
import com.example.model.Mobile;
import com.example.model.Sensor;

@Repository("dao")
public class HandsetDaoImpl implements HandsetDao{
	Logger logger = LogManager.getLogger(HandsetDaoImpl.class);
	//This is to create dynamic query
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public List<Mobile> getHandsetByModelName(Set<String> names) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Mobile> query = cb.createQuery(Mobile.class);
		Root<Mobile> mobile = query.from(Mobile.class);
		Path<String> modelPath= mobile.get("modelName");
		List<Predicate> predicates = new ArrayList<>();
		for(String name : names) {
			predicates.add(cb.like(modelPath, name));
		}
		query.select(mobile).where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
		return entityManager.createQuery(query).getResultList();
	}

//	List<Sensor> handsetList;
//	List<String> sensorsList = getSensorsList();
//	public HandsetDaoImpl() {
//		handsetList = new ArrayList<>();
////		Sensor handset1= new Sensor("Red Mi", "China", "Note7", 5.5, "4 GB", "32 GB", 3,sensorsList , "Mashmallow", "3200 mAh", true);
////		Sensor handset2= new Sensor("Apple", "US", "iPhoneX", 4.5, "2 GB", "32 GB", 2,sensorsList , "safari", "7200 mAh", true);
////		Sensor handset3= new Sensor("Blackberry", "Germany", "HotX", 2.5, "1 GB", "5 GB", 2,sensorsList , "blackberry", "4200 mAh", false);
////		Sensor handset4= new Sensor("Real Me", "Japan", "RealX", 7.5, "3 GB", "16 GB", 3,sensorsList , "Oxygen", "3200 mAh", true);
////		Sensor handset5= new Sensor("Oppo", "China", "Oppov7", 6.3, "4 GB", "64 GB", 3,sensorsList , "Nougat", "5200 mAh", false);
////		handsetList.add(handset1);
////		handsetList.add(handset2);
////		handsetList.add(handset3);
////		handsetList.add(handset4);
////		handsetList.add(handset5);
//	}

//	@Override
//	public List<Sensor> getAllHandset() {
//		logger.info("Inside HandsetDaoImpl");
//		return handsetList;
//	}

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
