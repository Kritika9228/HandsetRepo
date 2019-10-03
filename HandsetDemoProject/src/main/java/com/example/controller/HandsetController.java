package com.example.controller;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.HandsetDetailsDao;
import com.example.model.Handset;
import com.example.model.Mobile;
import com.example.service.HandsetService;

@RestController
public class HandsetController {
	Logger logger = LogManager.getLogger(HandsetController.class);
	
	@Autowired
	HandsetService handsetService;
	@Autowired
	HandsetDetailsDao handDetailsDao;
	
	@RequestMapping("/handsetList")
	public void getMobileList(){
		logger.info("Inside HandsetController");
		List<Handset> list = handsetService.getAllHandset();
		for(Handset l : list) {
			logger.info(l.getModelNumber());
		}	
	}
	@RequestMapping("/allMobile")
	public void getAllMobile(){
		logger.info("Inside getAllMobile");
		List<Mobile> list = handDetailsDao.findAll();
		for(Mobile l : list) {
			logger.info(l.getModelId());
		}	
	}
	
	@RequestMapping("/handset/{modelname}")
	public Mobile getMobileByName(@PathVariable("modelName") final String modelName){
		logger.info("Inside getMobileByName");
		Mobile oneSet= handDetailsDao.findByModelName(modelName);
			logger.info(oneSet);
			return oneSet;
	}
}
