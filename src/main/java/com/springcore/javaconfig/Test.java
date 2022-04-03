package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	/*
	 * 	@Configuration - used if you don't want to use xml configuration file.
	 
	 * 	@ComponentScan - used to scan the package where beans available (when we use xml we used to mention this path using 
		<componet: context-scan> tag
		
	 *	@Bean - we define a method in java config file which return bean object and use this annotations
 
	*/

	public static void main(String[] args) {
		
		// AnnotationConfigApplicationContext has to be use whenever we using java config file.
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = context.getBean("temp", Student.class);
		student.study();
				
	}

}
