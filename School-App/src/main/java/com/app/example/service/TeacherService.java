package com.app.example.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.app.example.entities.Teacher;

public interface TeacherService {

	Teacher save(Teacher teacher);

	Teacher getTeacherById(Long id);

	List<Teacher> findAll();

	void deleteById(Long id);

	Teacher updateById(Long id, Teacher teacher);

	Teacher patchById(Long id, Teacher teacher);

	List<String> getTeacherNamesByAgeGreaterThan(int age);

	List<Teacher> getTeachersByQualificationNative(String qualification);

	Page<Teacher> findTeacherPage(Pageable pageable);

	

}
