package com.ganesh.collegeApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.collegeApp.entities.College;
import com.ganesh.collegeApp.repo.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService {
	
	
	@Autowired
	private CollegeRepository collegeRepository;

	@Override
public List<College> getAll(){
	return collegeRepository.findAll();
		
	}

	@Override
	public void save(College college) {
		// TODO Auto-generated method stub
		collegeRepository.save(college);
		
	}
	
	@Override
	public College getById(Long id) {
		return collegeRepository.findById(id).orElse(null);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		collegeRepository.deleteById(id);
		
	}
	
	
	

}
