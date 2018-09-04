package com.springdemo.jpapersistence.service;

import java.util.List;
import java.util.Optional;

import com.springdemo.jpapersistence.dao.Student;

public interface IStudentService {
	public List<Student> getStudents();
	public Optional<Student> getStudentbyId(long Id);
	public void deleteStudentbyId(long Id);

}
