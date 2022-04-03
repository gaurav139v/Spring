package com.springcore.spel;

import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		System.out.println(d1);
		
//		SpelExpressionParser temp = new SpelExpressionParser();
//		Expression expr = temp.parseExpression("22+44");
//		System.out.println(expr.getValue());
		
//		to call static method in expresion language
//		T(Class).method(param)
//		
//		variable
//		T(class).variable
		
//		objects
//		new class_name()
//		ex: new java.lang.String('Gaurav Verma')
		
	}

}
