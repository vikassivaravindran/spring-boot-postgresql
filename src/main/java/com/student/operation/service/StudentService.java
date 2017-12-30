package com.student.operation.service;

import java.util.List;


import com.student.operation.model.Student;

public interface StudentService {
	
	public List<Student> getAllUsers();
	
	public Student getById(Long id);
	
	public Student saveUser(Student student);
	
	public Student updatebyId(Student student);
	
	public void deleteUser(Long id);

	

}
