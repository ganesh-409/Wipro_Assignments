package com.ganesh.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.example.entities.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
