package com.ganesh.hibernateProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="school")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String firstName;
	private String lastName;
	private String email;
	 @Enumerated(EnumType.STRING)  // Stores "MALE", "FEMALE", etc.
	    private Gender gender;
	 
	 public String getFirstName() {
		 return firstName;
	 }
	 public void setFirstName(String firstName) {
		 this.firstName = firstName;
	 }
	 public String getLastName() {
		 return lastName;
	 }
	 public void setLastName(String lastName) {
		 this.lastName = lastName;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 public Gender getGender() {
		 return gender;
	 }
	 public void setGender(Gender gender) {
		 this.gender = gender;
	 }
	 public School() {
		super();
	 }
	 public School(String firstName, String lastName, String email, Gender gender) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
	 }
	 @Override
	 public String toString() {
		return "School [ firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", gender=" + gender + "]";
	 }
	 
	
	
	

}
