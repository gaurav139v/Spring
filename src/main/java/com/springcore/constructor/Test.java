package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/conConfig.xml");
		Person p = (Person) context.getBean("person1");
		System.out.println(p);	
		
		
		// by default first preference is string
		// consider from top to bottom
		// we can use type in xml to specify constructor.
		// we can use index attribute in xml to variable order.
		Addition add = (Addition) context.getBean("add");
		add.doSum();

	}

}
