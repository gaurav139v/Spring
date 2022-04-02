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
		
//		singleton scope same object will be sent by IOC (default)
//		prototype scope new object create every time
		
//		Prototype
//		Two way to do this
//		1. xml
//		2. annotation @Scope("prototype") just above the class name
		
//		 using annotation		
		Student student2  = context.getBean("obj", Student.class);
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());		
		
//		 using xml
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		Teacher teacher2 = context.getBean("teacher", Teacher.class);
		
		System.out.println(teacher1.hashCode());
		System.out.println(teacher2.hashCode());
		
	}

}
