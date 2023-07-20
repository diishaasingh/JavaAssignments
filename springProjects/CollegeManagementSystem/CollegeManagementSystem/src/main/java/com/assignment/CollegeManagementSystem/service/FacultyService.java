package com.assignment.CollegeManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.CollegeManagementSystem.entity.Course;
import com.assignment.CollegeManagementSystem.entity.Enrollment;
import com.assignment.CollegeManagementSystem.entity.Faculty;
import com.assignment.CollegeManagementSystem.repository.EnrollmentRepository;
import com.assignment.CollegeManagementSystem.repository.FacultyRepository;

import java.util.List;

@Service
public class FacultyService {
	//private final EnrollmentRepository enrollmentRepository;
	private final FacultyRepository facultyRepository;

	@Autowired
	public FacultyService//(EnrollmentRepository enrollmentRepository, 
			(FacultyRepository facultyRepository) {
		//this.enrollmentRepository = enrollmentRepository;
		this.facultyRepository = facultyRepository;
	}

	public void saveFaculty(Faculty faculty) {
		facultyRepository.save(faculty);
	}

	public List<Faculty> getFacultys() {
		return facultyRepository.findAll();
	}

}
