package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entities.Student;
import com.springjdbc.dao.StudentDao;

public class App {

	public static void main(String[] args) {
		
		// Simple way of doing but not recommended.
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
		
		// use java configuration file
		ApplicationContext context =
				new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//		
//		// insert query
//		String query = "Insert into student (id, name, city) values(?, ?, ?)";
//		
//		// fire query
//		int result = template.update(query, 3, "Ankit", "Jabalpur");
//		System.out.println("No of record inserted : "+ result);

		// fetch studentDao bean (Standard way of using Spring JDBC)
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class); // create a DAO object
		
//		Student student = new Student(4, "Richa", "Delhi");
//		
//		int result = studentDao.insert(student);
//		System.out.println("No of rows inserted : "+ result);
			
//		// update 
//		Student s2 = new Student(4, "Richa", "Mumbai");
//		int result = studentDao.change(s2);		
//		System.out.println("Data update : "+ result);
//		
//		// delete
//		Student s3 = new Student(1, "Richa", "Mumbai");
//		result = studentDao.delete(s2);
//		System.out.println("Data deleted : "+result);
		

		Student s4 = studentDao.getStudent(1); // for single row fetch
		System.out.println(s4);
		
		List<Student> students = studentDao.getAllStudent(); // fetch multiple rows
		for(Student s: students) {
			System.out.println(s);
		}
		
	}

}
