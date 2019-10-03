package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Handset;
import com.example.model.Mobile;

public interface HandsetDetailsDao extends JpaRepository<Mobile, Integer>{
	public Mobile findByModelName(String name);
}
