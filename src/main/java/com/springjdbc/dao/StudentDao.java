package com.springjdbc.dao;
import java.util.List;

import com.springjdbc.entities.Student;

// This class cantain sql functionality like insert , update , delete .. etc.
public interface StudentDao {
	
	public int insert(Student student);
	public int change(Student student);
	public int delete(Student student);
	public Student getStudent(int studentId); // return single row
	public List<Student> getAllStudent();
}
