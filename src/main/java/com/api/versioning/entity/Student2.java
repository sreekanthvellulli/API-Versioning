package com.api.versioning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students2")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Name name;
	private String email;
	private long age;

}
