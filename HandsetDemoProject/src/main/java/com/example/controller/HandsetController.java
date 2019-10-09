package com.example.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.dao.HandsetDetailsDao;
import com.example.model.Mobile;
import com.example.model.Sensor;

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
			List<Sensor> listsen = l.getSensors();
			logger.info("Sensors for "+l.getModelId()+ "are: ");
			for(Sensor s:listsen) {
				logger.info(s.getSensorName());
			}
		}	
	}
	
	@RequestMapping("/handset/{modelId}")
	public Mobile getMobileByName(@PathVariable("modelId") final long modelId){
		logger.info("Inside getMobileByName");
		Mobile mob = new Mobile();
		//Mobile oneSet= handDetailsDao.findByModelName(modelName);
		//Mobile mob= handDetailsDao.findOne(modelId);
		Optional<Mobile> oneSet= handDetailsDao.findById(modelId);
		//1st method  of Optional
/*	if(oneSet.isPresent()) {
			 mob = oneSet.get();
			logger.info(mob.getModelName());
		}else {
			logger.info("Mobile not listed");
		}*/
		//2nd method of  Optional
		/*mob=oneSet.orElse(new Mobile("Mobile not listed"));*/
		//3rd method of using Optional(It is same as 2nd but allow one SUpplier Function)
		mob = oneSet.orElseGet(()->{
			return new Mobile("Mobile not listed");
		});
			return mob;
	}
//	@GetMapping("/handset/{modelId}/{country}")
//	public List<Mobile> checkMobileForCountry(@PathVariable("modelId") final long modelId,@PathVariable("country") final String country) {
	@GetMapping("/handset/{country}")
	public List<Mobile> checkMobileForCountry(@PathVariable("country") final String country) {	
		logger.info("Inside checkMobileForCountry");
		List<Mobile> list = handDetailsDao.findAll();
		List<Mobile> resultList= new ArrayList<>();
		for(Mobile l : list) {
			logger.info(l.getModelId());
			Optional<Mobile> singleMob = Optional.ofNullable(l);
			singleMob.filter(m1->
			m1.getManufacturerCountry().equalsIgnoreCase(country))
			.ifPresent(m2->{
				resultList.add(m2);
			});
		}
//		Mobile mob = new Mobile();
//		Optional<Mobile> singleMob= handDetailsDao.findById(modelId);
//		mob=singleMob.filter(m1-> 
//			m1.getManufacturerCountry().equalsIgnoreCase(country))
//				.orElse(new Mobile("Handset from different country"));
		return resultList;
	}
	 @GetMapping("/handset/{modelId}")
	    public Mobile getId(@PathVariable("modelId") final long modelId) {
		 return	handDetailsDao.findById(modelId).get();
	    }
	 //localhost:8080/handset/increasePriceBy?modelId=111&inc=2000
	@GetMapping("handset/increasePriceBy")
	public Mobile increasePrice(@RequestParam("modelId") final Integer modelId,@RequestParam("inc") final Integer inc) {
		logger.info("Inside increasePrice");
		Mobile requstedMobile = getId(modelId);
		requstedMobile.setPrice(requstedMobile.getPrice()+inc);
		return handDetailsDao.save(requstedMobile);
		
		
	}
	
}
