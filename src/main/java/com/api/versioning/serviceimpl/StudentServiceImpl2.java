package com.api.versioning.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.versioning.entity.Student2;
import com.api.versioning.repository.StudentRepository2;
import com.api.versioning.service.StudentService2;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl2 implements StudentService2 {

	private final StudentRepository2 studentRepository;
	@Override
	public Student2 saveStudent(Student2 student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student2> getAllStudents() {
		return studentRepository.findAll();
	}

}
