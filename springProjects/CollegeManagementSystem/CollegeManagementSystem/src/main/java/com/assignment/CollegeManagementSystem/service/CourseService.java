package com.assignment.CollegeManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.CollegeManagementSystem.entity.Course;
import com.assignment.CollegeManagementSystem.entity.Enrollment;
import com.assignment.CollegeManagementSystem.entity.Student;
import com.assignment.CollegeManagementSystem.repository.CourseRepository;

@Service
public class CourseService {
	private final CourseRepository courseRepository;
	//private final EnrollmentRepository enrollmentRepository;

	@Autowired
	public CourseService(CourseRepository courseRepository){//, EnrollmentRepository enrollmentRepository) {
		this.courseRepository = courseRepository;
		//this.enrollmentRepository = enrollmentRepository;
	}

//	public List<Course> getEnrolledCoursesByStudent(Student student) {
//		List<Enrollment> enrollments = enrollmentRepository.findByStudent(student);
//		return enrollments.stream().map(Enrollment::getCourse).collect(Collectors.toList());
//	}

//	public List<Student> getStudentsByCourse(Course course) {
//		List<Enrollment> enrollments = enrollmentRepository.findByCourse(course);
//		return enrollments.stream().map(Enrollment::getStudent).collect(Collectors.toList());
//	}

//	public void trackCreditsEarned(Student student, Course course, int credits) {
//		Enrollment enrollment = enrollmentRepository.findByStudentAndCourse(student, course);
//		if (enrollment != null) {
//			enrollment.setCreditsEarned(credits);
//			enrollmentRepository.save(enrollment);
//		}
//	}

//	public Course getMostPopularCourse() {
//		List<Course> courses = courseRepository.findAll();
//		Course mostPopularCourse = null;
//		int maxEnrollments = 0;
//		for (Course course : courses) {
//			List<Enrollment> enrollments = enrollmentRepository.findByCourse(course);
//			int numEnrollments = enrollments.size();
//			if (numEnrollments > maxEnrollments) {
//				maxEnrollments = numEnrollments;
//				mostPopularCourse = course;
//			}
//		}
//		return mostPopularCourse;
//	}

	public void enrollStudent(Course course, Student student) {
		// Check if the student is already enrolled in the course
		if (isStudentEnrolled(course, student)) {
			throw new IllegalArgumentException("Student is already enrolled in the course.");
		}

		// Create a new enrollment and associate it with the course and student
		Enrollment enrollment = new Enrollment();
		enrollment.setCourse(course);
		enrollment.setStudent(student);

		// Save the enrollment to the database
		//enrollmentRepository.save(enrollment);
	}

	private boolean isStudentEnrolled(Course course, Student student) {
		// return enrollmentRepository.existsByCourseAndStudent(course, student);
		return false;
	}

	public void saveCourse(Course course) {
		courseRepository.save(course);
	}

	public List<Course> getCourses() {
		return courseRepository.findAll();
	}
}
