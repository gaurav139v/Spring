package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

// @Component  // this annotation can be used if you don't want use @Bean annotation.
public class Student {
	
	private Samosa samosa;
	
		
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Student() {
		super();
	}

	public void study() {
		System.out.println("Student is reading book.");
		this.samosa.display();
	}
}
