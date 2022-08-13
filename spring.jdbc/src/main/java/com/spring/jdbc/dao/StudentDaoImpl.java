package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	
	//Insert operation
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {

		String query = "insert into student(id,name,city) values(?,?,?)";

		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	
	//Update operation
	public int change(Student student) {

		String query = "update student set name=?,city=? where id=?";

		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());

		return result;
	}

	
	//Delete operation
	public int delete(int studentId) {
		String query = "delete from student where id=?";

		int result = this.jdbcTemplate.update(query,studentId);

		return result;

		
	}

	//Get Operation (For Single Data)
	public Student getStudent(int studentid) {
		
		String query = "select * from student where id=?";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studentid);
		
		return student;
	}


	
	//To Get Multiple data operation
	public List<Student> getAllStudents() {
		
		String query = "Select * from student";
		List<Student> students = this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
