package com.ganesh.example.service;

import java.util.List;

import com.ganesh.example.entities.Student;

public interface StudentService {

	
	public List<Student> getAll();
	
	public void save(Student student);
	public Student getById(Long rollno);
	public void delete(Long rollno);
	
}
