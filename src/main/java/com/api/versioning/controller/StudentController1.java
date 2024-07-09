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

import com.api.versioning.entity.Student1;
import com.api.versioning.service.StudentService1;


@RestController
@RequestMapping("/api/v1/students")
public class StudentController1 {

	@Autowired
	private StudentService1 studentService;

	// URI Versioning: Include the version number in the URI path.

	@PostMapping
	public ResponseEntity<Student1> saveStudent(@RequestBody Student1 student) {
		return ResponseEntity.status(HttpStatus.CREATED).body(studentService.saveStudent(student));
	}

	@GetMapping
	public ResponseEntity<List<Student1>> getAllStudentsv1() {
		return ResponseEntity.ok(studentService.getAllStudents());
	}
	/*
	// Query Parameter Versioning: Specify the version as a query parameter.

    @GetMapping(path = "/api/students", params = "version=1")
	public ResponseEntity<List<Student1>> getAllStudentsRPv1() {
		return ResponseEntity.ok(studentService.getAllStudents());
	}
    
    // Header Versioning: Send the version information in a custom header.
    
    @GetMapping(path = "/api/students", headers = "X-API-VERSION=1")
	public ResponseEntity<List<Student1>> requestHeaderV1() {
		return ResponseEntity.ok(studentService.getAllStudents());
	}
    
    // Media Type Versioning (Content Negotiation): Use different media types (e.g., JSON v1, JSON v2) to represent different versions.
    @GetMapping(path = "/api/students", produces = "application/vnd.company.app-v1+json")
    public ResponseEntity<List<Student1>> requestAcceptHeaderV1() {
		return ResponseEntity.ok(studentService.getAllStudents());
	}

    */
}
