package com.api.versioning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.versioning.entity.Student2;
import com.api.versioning.service.StudentService2;


@RestController
@RequestMapping("/api/v2/students")
public class StudentController2 {
	@Autowired
	private StudentService2 studentService;

	@PostMapping()
	public ResponseEntity<Student2> saveEmployeev2(@RequestBody Student2 student) {
		return new ResponseEntity<Student2>(studentService.saveStudent(student), HttpStatus.CREATED);
	}

	@GetMapping
	public List<Student2> getAllEmployeesv2() {
		return studentService.getAllStudents();
	}

	/*
	// Query Parameter Versioning: Specify the version as a query parameter.

	@GetMapping(path = "/api/students", params = "version=2")
	public ResponseEntity<List<Student2>> getAllStudentsRPv2() {
		return ResponseEntity.ok(studentService.getAllStudents());
	}

	// Header Versioning: Send the version information in a custom header.

	@GetMapping(path = "/api/students", headers = "X-API-VERSION=2")
	public ResponseEntity<List<Student2>> requestHeaderV2() {
		return ResponseEntity.ok(studentService.getAllStudents());
	}

	// Media Type Versioning (Content Negotiation): Use different media types (e.g.,
	// JSON v1, JSON v2) to represent different versions.
	@GetMapping(path = "/api/students", produces = "application/vnd.company.app-v2+json")
	public ResponseEntity<List<Student2>> requestAcceptHeaderV2() {
		return ResponseEntity.ok(studentService.getAllStudents());
	}
	*/
}
