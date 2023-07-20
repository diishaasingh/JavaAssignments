package com.assignment.CollegeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.CollegeManagementSystem.entity.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, String> {
	// Add custom query methods if needed
}
