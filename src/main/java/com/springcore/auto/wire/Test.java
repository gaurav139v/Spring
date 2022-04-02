package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowireConfig.xml");
		// byName
		Employee emp = context.getBean("emp1", Employee.class);
		System.out.println(emp);
		
		// byType
		Employee emp2 = context.getBean("emp2", Employee.class);
		System.out.println(emp2);
		
		// constructor
		Employee emp3 = context.getBean("emp3", Employee.class);
		System.out.println(emp3);
	}

}
