package com.assignment.CollegeManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.CollegeManagementSystem.entity.Student;
import com.assignment.CollegeManagementSystem.repository.StudentRepository;

@Service
public class StudentService {
	//private final StudentRepository studentRepository;

	@Autowired
	public StudentService(){//(StudentRepository studentRepository) {
		//this.studentRepository = studentRepository;
	}

	public void saveStudent(Student student) {
		//studentRepository.save(student);
	}
}
