package com.example.studentdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdemo.entity.Student;
import com.example.studentdemo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
@GetMapping("/get/{Id}")
public Student getStudentById(@PathVariable Integer Id)
{
	return service.getStudentById(Id);
	
}
@PostMapping("/save")
public Student saveStudent(@RequestBody Student student)
{
	return service.saveStudent(student);
	
}
}
