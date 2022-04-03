package com.springjdbc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student;

/*
 * This class implement DAO interface 
 */
public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
		
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		// Insert the data into database
		String query = "Insert into student (id, name, city) values(?, ?, ?)";
		
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		
		return result;
	}

	public int change(Student student) {
		// update data
		String query = "update student set name=?, city=? where id = ?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	public int delete(Student student) {
		// delete
		String query = "delete from student where id = ?";
		int result = this.jdbcTemplate.update(query, student.getId());
		return result;
	}

	public Student getStudent(int studentId) {
		// return single row
		String query = "Select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		
		// for single row use queryForObject method this is used to return single row
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);

		// we can use anonymous class concept for rowMapper 
//		Student student = this.jdbcTemplate.queryForObject(query, new RowMapper() {
//			Student student = new Student();
//
//			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//				student.setId(rs.getInt(1)); // first column id in student table.
//				student.setName(rs.getString(2));
//				student.setCity(rs.getString(3));			
//				return student;
//			}
//			
//		}, studentId);
		
		return student;
	}

	public List<Student> getAllStudent() {
		// selecting multiple student
		String query = "Select * from student";
		
		// query method is used to return list of rows.
		List<Student> result = this.jdbcTemplate.query(query, new RowMapperImpl());
		return result;
	}
	
}
