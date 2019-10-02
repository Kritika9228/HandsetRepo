package com.example.controller;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Handset;
import com.example.service.HandsetService;

@RestController
public class HandsetController {
	Logger logger = LogManager.getLogger(HandsetController.class);
	
	@Autowired
	HandsetService handsetService;
	
	@RequestMapping("/handsetList")
	public void getMobileList(){
		logger.info("Inside HandsetController");
		List<Handset> list = handsetService.getAllHandset();
		for(Handset l : list) {
			logger.info(l.getModelNumber());
		}	
	}
}
