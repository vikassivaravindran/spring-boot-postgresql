package com.student.operation.utility;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.operation.model.Student;
import com.student.operation.repository.StudentRepository;
import com.student.operation.service.StudentService;

@Service
public class StudentUtility implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllUsers() {
		return studentRepository.findAll();
	}

	@Override
	public Student getById(Long id) {
		return studentRepository.getCustomerById(id);
	}

	@Override
	public Student saveUser(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updatebyId(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteUser(Long id) {
		studentRepository.deleteById(id);
	}

}
