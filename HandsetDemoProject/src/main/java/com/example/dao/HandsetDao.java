package com.example.dao;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Primary;

import com.example.model.Mobile;

public interface HandsetDao {
	
	public List<Mobile> getHandsetByModelName(Set<String> names);

}
