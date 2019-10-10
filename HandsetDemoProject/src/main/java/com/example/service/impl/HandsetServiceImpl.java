package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.controller.HandsetController;
import com.example.dao.HandsetDao;
import com.example.dao.HandsetDetailsDao;
import com.example.model.Mobile;
import com.example.model.Sensor;
import com.example.service.HandsetService;

@Service
public class HandsetServiceImpl implements HandsetService{
	Logger logger = LogManager.getLogger(HandsetServiceImpl.class);
//	@Autowired
//	 HandsetDetailsDao handsetDetailsDao;
	
	@Autowired
	@Qualifier("dao")
	 HandsetDao handsetDao;
//	@Override
//	public List<Sensor> getAllHandset() {
//		logger.info("Inside HandsetServiceImpl");
//		return handsetDao.getAllHandset();
//		
//	}

	@Override
	public List<Mobile> getHandsetByModelName(Set<String> names) {
		// TODO Auto-generated method stub
		return handsetDao.getHandsetByModelName(names);
	}

}
