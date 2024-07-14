package com.example.studentdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentdemo.entity.Student;
import com.example.studentdemo.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	public Student getStudentById(Integer id) {
			return repository.getById(id);
	}

	public Student saveStudent(Student student) {
			return repository.save(student);
	}

}
