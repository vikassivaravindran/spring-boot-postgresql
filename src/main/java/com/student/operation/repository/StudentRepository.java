package com.student.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.operation.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	public Student getCustomerById(long id);
	
	
}