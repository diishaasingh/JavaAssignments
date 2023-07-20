package com.assignment.CollegeManagementSystem.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//@Entity
public class Student {

	@Id
	@GeneratedValue
	private Long id;
	private String email;
	private String fname;
	private String lname;
	private LocalDate birthDate;

	@OneToMany(mappedBy = "student")
	private List<Enrollment> enrollments = new ArrayList<>();

	public Student() {
	}

	public Student(String email, String fname, String lname, LocalDate birthDate) {
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.birthDate = birthDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
 
}
