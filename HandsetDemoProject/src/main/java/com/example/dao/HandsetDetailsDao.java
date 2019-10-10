package com.example.dao;


import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.model.Mobile;

public interface HandsetDetailsDao extends JpaRepository<Mobile, Long>,HandsetDao{
	@Query("SELECT m FROM Mobile m WHERE m.modelName= :modelName")
	public Mobile findByModelName(@Param("modelName") String modelName);
	
	@Query("SELECT m FROM Mobile m WHERE m.externalMemorySize=?1")
	public List<Mobile> findByExternalMemorySize(String exMemo);
	
	@Query("SELECT m FROM Mobile m WHERE m.batteryCapacity=?1")
	public List<Mobile> findByBatteryCapacity(String battery);
}
