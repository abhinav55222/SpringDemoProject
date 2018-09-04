package com.springdemo.jpapersistence.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.jpapersistence.dao.Student;
import com.springdemo.jpapersistence.service.IStudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private IStudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudentlist(){
		return studentService.getStudents();
	}
	
	@GetMapping("/students/{studentId}")
	public Optional<Student> getStudent(@PathVariable int studentId) {
		Optional<Student> theStudent= studentService.getStudentbyId(studentId);
		return theStudent;
	}
	
	@DeleteMapping("/students/{studentId}")
	public void deleteStudentbyId(@PathVariable int studentId) {
		
	}
	
	
	
}
