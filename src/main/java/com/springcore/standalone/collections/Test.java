package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/saConfig.xml");
		
		Person person = context.getBean("person1", Person.class);
		
		// use stand alone collections (list)
		System.out.println(person.getFriends());
		System.out.println(person.getFriends().getClass().getName());
		
		// use stand alone collection (map)
//		System.out.println("--------------------------------------------");
//		System.out.println(person.getFeeStructure().getClass().getName());
//		System.out.println(person.getFeeStructure());
//		
//		// use stand alone collection (properties)
//		System.out.println("--------------------------------------------");
//		System.out.println(person.getProps());
//		System.out.println(person.getProps().getClass().getName());
		
		
	}

}
