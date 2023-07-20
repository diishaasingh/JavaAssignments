package com.assignment.CollegeManagementSystem.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.assignment.CollegeManagementSystem.entity.Course;
import com.assignment.CollegeManagementSystem.entity.Faculty;
import com.assignment.CollegeManagementSystem.entity.Student;
import com.assignment.CollegeManagementSystem.service.CourseService;
import com.assignment.CollegeManagementSystem.service.FacultyService;
import com.assignment.CollegeManagementSystem.service.StudentService;

@Component
public class CollegeManagementSystemRunner implements CommandLineRunner {
	private final CourseService courseService;
	private final StudentService studentService;
	private final FacultyService facultyService;

	@Autowired
	public CollegeManagementSystemRunner(CourseService courseService, StudentService studentService,
			FacultyService facultyService) {
		this.courseService = courseService;
		this.studentService = studentService;
		this.facultyService = facultyService;
	}

	@Override
	public void run(String... args) throws Exception {
		// Creating sample data for the entities
		Course mathCourse = new Course("Mathematics", 3, LocalDate.now(), LocalDate.now().plusMonths(3), 12);
		Course physicsCourse = new Course("Physics", 4, LocalDate.now(), LocalDate.now().plusMonths(4), 15);
		Course chemistryCourse = new Course("Chemistry", 3, LocalDate.now(), LocalDate.now().plusMonths(3), 10);

		Faculty faculty1 = new Faculty("faculty1@example.com", "John", "Doe");
		Faculty faculty2 = new Faculty("faculty2@example.com", "Jane", "Smith");

		Student student1 = new Student("student1@example.com", "Alice", "Johnson", LocalDate.of(2000, 5, 15));
		Student student2 = new Student("student2@example.com", "Bob", "Williams", LocalDate.of(2001, 7, 20));
		Student student3 = new Student("student3@example.com", "Eve", "Brown", LocalDate.of(2002, 9, 10));

		// Saving the entities to the database
		courseService.saveCourse(mathCourse);
		courseService.saveCourse(physicsCourse);
		courseService.saveCourse(chemistryCourse);

		facultyService.saveFaculty(faculty1);
		facultyService.saveFaculty(faculty2);

		System.out.println(courseService.getCourses());
		System.out.println(facultyService.getFacultys());
//		studentService.saveStudent(student1);
//		studentService.saveStudent(student2);
//		studentService.saveStudent(student3);

		// Enrolling students to courses
//		courseService.enrollStudent(mathCourse, student1);
//		courseService.enrollStudent(mathCourse, student2);
//		courseService.enrollStudent(mathCourse, student3);
//
//		courseService.enrollStudent(physicsCourse, student1);
//		courseService.enrollStudent(physicsCourse, student2);

		// courseService.getEnrolledCoursesByStudent(chemistryCourse, student2);
		courseService.enrollStudent(chemistryCourse, student3);

		// Get courses of a student
//		List<Course> enrolledCoursesOfStudent1 = courseService.getEnrolledCoursesByStudent(student1);
//		System.out.println("Enrolled courses of Student 1: " + enrolledCoursesOfStudent1);
//
//		// Get students enrolled in a certain course
//		List<Student> studentsEnrolledInMathCourse = courseService.getStudentsByCourse(mathCourse);
//		System.out.println("Students enrolled in Math Course: " + studentsEnrolledInMathCourse);

		// credits earned by students for respective courses
//		courseService.trackCreditsEarned(student1, mathCourse, 9);
//		courseService.trackCreditsEarned(student1, physicsCourse, 12);
//		courseService.trackCreditsEarned(student2, mathCourse, 10);
//		courseService.trackCreditsEarned(student2, physicsCourse, 14);
//		courseService.trackCreditsEarned(student3, mathCourse, 8);

		// Get the most popular courses
//		Course mostPopularCourse = courseService.getMostPopularCourse();
//		System.out.println("Most Popular Course: " + mostPopularCourse);

		// Add ratings for faculty given by students
//		facultyService.addRatingForFaculty(faculty1, mathCourse, 4);
//		facultyService.addRatingForFaculty(faculty1, physicsCourse, 5);
//		facultyService.addRatingForFaculty(faculty2, mathCourse, 3);
//		facultyService.addRatingForFaculty(faculty2, physicsCourse, 4);
	}
}
