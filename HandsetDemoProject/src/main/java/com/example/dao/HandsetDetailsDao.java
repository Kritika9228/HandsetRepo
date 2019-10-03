package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.model.Sensor;
import com.example.model.Mobile;

public interface HandsetDetailsDao extends JpaRepository<Mobile, Long>{
	public Mobile findByModelName(String name);
}
