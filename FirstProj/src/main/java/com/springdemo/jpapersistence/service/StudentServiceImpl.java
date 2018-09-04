package com.springdemo.jpapersistence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.jpapersistence.dao.Student;
import com.springdemo.jpapersistence.dao.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Optional<Student> getStudentbyId(long Id) {
		Optional<Student> studentbyId = studentRepository.findById(Id);
		return studentbyId;
	}

	@Override
	public void deleteStudentbyId(long Id) {
		studentRepository.deleteById(Id);
		
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
		//dummy implementation of add user
		
		// more funcionalty
		
	}

}
