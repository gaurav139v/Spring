package com.springcore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifeCycle/lifeConfig.xml");
		
		// using xml
		Samosa samosa = (Samosa) context.getBean("samosa1");
		System.out.println(samosa);
		
		// registerShutdown hook available in AbstractApplicationContext
		context.registerShutdownHook();	// this we have to use to call execute destroy
		
		System.out.println("--------------------------------------");
		
		// using interface
		Pepsi pepsi = (Pepsi) context.getBean("pepsi1");
		System.out.println(pepsi);
		
		System.out.println("--------------------------------------");
		
		// using annotations (@PostConstruct and @PreDestroy)
		// This two annotation removed from java 9 onward we have to add dependency to use them.
		Chaat chaat = (Chaat) context.getBean("chaat1");
		System.out.println(chaat);
	}

}
