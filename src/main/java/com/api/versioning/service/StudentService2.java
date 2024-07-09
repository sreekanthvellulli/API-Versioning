package com.api.versioning.service;

import java.util.List;

import com.api.versioning.entity.Student2;

public interface StudentService2 {
	Student2 saveStudent(Student2 student);
	List<Student2> getAllStudents();

}
