package com.assignment.CollegeManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//@Entity //mapping table(Student Course Mapping)
public class Enrollment {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;

	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;

	private int creditsEarned;
	private int facultyRating;

	public Enrollment() {
	}

	public Enrollment(Student student, Course course, int creditsEarned) {
		this.student = student;
		this.course = course;
		this.creditsEarned = creditsEarned;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getCreditsEarned() {
		return creditsEarned;
	}

	public void setCreditsEarned(int creditsEarned) {
		this.creditsEarned = creditsEarned;
	}

	public void setFacultyRating(int facultyRating) {
		this.facultyRating = facultyRating;
	}

	@Override
	public String toString() {
		return "Enrollment [id=" + id + ", student=" + student + ", course=" + course + ", creditsEarned="
				+ creditsEarned + "]";
	}
}
