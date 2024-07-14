package com.example.studentdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentdemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
