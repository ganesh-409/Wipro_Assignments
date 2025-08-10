package com.app.example.entities;

import java.time.LocalDate;

import com.app.example.enums.Qualification;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="teacher")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String teacherName;
	private String teacherAddress;
	@Enumerated(EnumType.STRING)
	private Qualification qualification;
	private int age;
	@JsonFormat(pattern = "yyyy-MM-dd")
	 private LocalDate dob;
	private int experience;

}
