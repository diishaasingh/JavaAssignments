package com.assignment.CollegeManagementSystem.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int duration;
	private LocalDate startDate;
	private LocalDate endDate;
	private int credits;

//	@OneToMany(mappedBy = "course")
//	private List<Enrollment> enrollments = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "faculty_id")
	private Faculty faculty;

	public Course() {
	}

	public Course(String name, int duration, LocalDate localDate, LocalDate localDate2, int credits) {
		this.name = name;
		this.duration = duration;
		this.startDate = localDate;
		this.endDate = localDate2;
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", credits=" + credits + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

//	public List<Enrollment> getEnrollments() {
//		return enrollments;
//	}
//
//	public void setEnrollments(List<Enrollment> enrollments) {
//		this.enrollments = enrollments;
//	}
}
