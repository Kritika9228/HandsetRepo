package com.example.controller;


import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.HandsetDetailsDao;
import com.example.model.Mobile;
import com.example.service.HandsetService;

@RestController
public class HandsetController {
	Logger logger = LogManager.getLogger(HandsetController.class);
	
//	@Autowired
//	HandsetService handsetService;
	@Autowired
	HandsetDetailsDao handDetailsDao;
	
	@RequestMapping("/allMobile")
	public void getAllMobile(){
		logger.info("Inside getAllMobile");
		List<Mobile> list = handDetailsDao.findAll();
		for(Mobile l : list) {
			logger.info(l.getModelId());
		}	
	}
	
	@RequestMapping("/handset/{modelId}")
	public Mobile getMobileByName(@PathVariable("modelId") final long modelId){
		logger.info("Inside getMobileByName");
		Mobile mob = new Mobile();
		//Mobile oneSet= handDetailsDao.findByModelName(modelName);
		//Mobile mob= handDetailsDao.findOne(modelId);
		Optional<Mobile> oneSet= handDetailsDao.findById(modelId);
		if(oneSet.isPresent()) {
			 mob = oneSet.get();
			logger.info(mob.getModelName());
		}
			
			return mob;
	}
	
}
