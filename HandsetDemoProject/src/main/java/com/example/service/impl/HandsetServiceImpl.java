package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.controller.HandsetController;
import com.example.dao.HandsetDao;
import com.example.model.Handset;
import com.example.service.HandsetService;

@Service
public class HandsetServiceImpl implements HandsetService{
	Logger logger = LogManager.getLogger(HandsetServiceImpl.class);
	@Autowired
	 HandsetDao handsetDao;
	@Override
	public List<Handset> getAllHandset() {
		logger.info("Inside HandsetServiceImpl");
		return handsetDao.getAllHandset();
		
	}

	@Override
	public Handset getHandsetByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
