package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // we are using java config file instead of xml config.
// @ComponetScan should be used when we are using @Componet annotation instead of @Bean annotation.
//@ComponentScan(basePackages ="com.springcore.javaconfig")   // path for beans packages can defined multiple packages.
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	// We can mention name attribute in @Bean annotation all these name can be used as bean name.
	// if we do no mention name attribute then method name will be the bean name example: getStudent
	@Bean(name = {"student", "temp"})
	public Student getStudent() {
		
		// creating a new student object.
		Student student = new Student(getSamosa());		
		return student;
	}
}
