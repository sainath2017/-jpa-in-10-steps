package com.in28minutes.learning.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;
	
	public User(String name, String role) {
		this.name = name;
		this.role = role;
	}

}
