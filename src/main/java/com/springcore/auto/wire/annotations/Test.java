package com.springcore.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotations/autowireConfig.xml");
		
//		Three ways to auto wire
//		1. use @Autowire above the property
//		2. use @Autowire above the setter method
//		3. use @Autowire above the constructor.
		Employee emp = context.getBean("emp1", Employee.class);
		System.out.println(emp);
		
		
	}

}
