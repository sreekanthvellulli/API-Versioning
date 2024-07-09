package com.api.versioning.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.versioning.entity.Student1;
import com.api.versioning.repository.StudentRepository1;
import com.api.versioning.service.StudentService1;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl1 implements StudentService1 {

	private final StudentRepository1 studentRepository;

	@Override
	public Student1 saveStudent(Student1 student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student1> getAllStudents() {
		return studentRepository.findAll();
	}
}
 