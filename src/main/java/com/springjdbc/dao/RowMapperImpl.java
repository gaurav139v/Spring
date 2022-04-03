package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student;

// it is a class which implement the RowMapper interface 
// this will map the Result set to Object
public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		student.setId(rs.getInt(1)); // first column id in student table.
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		
		return student;
	}

}
