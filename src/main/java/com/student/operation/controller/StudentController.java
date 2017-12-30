package com.student.operation.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.operation.model.Student;
import com.student.operation.service.StudentService;

@RestController
@RequestMapping(value="/api/student")
public class StudentController {
	

	@Autowired
	private StudentService studentService;
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@GetMapping(value="/getAll")
	public List<Student> getAllUsers(){
		logger.info("Getting List of Users");
		return studentService.getAllUsers();
	}
	
	@PostMapping(value="/insert")
	public Student insertStudent(@RequestBody Student student){
		logger.info("Inserting student details:{}", student);
		return studentService.saveUser(student);
	}
	
	@GetMapping(value="/{id}")
	public Student getStudentById(@PathVariable Long id){
		logger.info("Getting student by the id :{}",id);
		return studentService.getById(id);
	}
	
	@PutMapping(value="/update")
	public Student updateStudentDetails(@RequestBody Student student) throws Exception{
		Student getById = studentService.getById(student.getId());
		if(getById != null){
			return studentService.saveUser(student);
		}
		throw new Exception("Student not found");
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteStudent(@PathVariable Long id){
		logger.info("Deleting user details with id : {}",id);
		studentService.deleteUser(id);
	}
	
}
