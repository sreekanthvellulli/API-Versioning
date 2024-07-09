package com.api.versioning.service;

import java.util.List;

import com.api.versioning.entity.Student1;

public interface StudentService1 {
	Student1 saveStudent(Student1 student);
	List<Student1> getAllStudents();

}
