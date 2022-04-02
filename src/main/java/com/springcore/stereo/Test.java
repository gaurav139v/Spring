package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereo/stereoConfig.xml");
		Student student = context.getBean("obj", Student.class);
		System.out.println(student);
		
		// inject the collection using stereotype @Value annotation
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
	}

}
