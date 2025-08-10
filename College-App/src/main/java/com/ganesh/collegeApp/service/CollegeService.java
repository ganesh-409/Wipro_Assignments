package com.ganesh.collegeApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ganesh.collegeApp.entities.College;


public interface CollegeService {
	
	
	public List<College> getAll();
	public void save(College college);
	public College getById(Long id);
	public void delete(Long id);
	

}
