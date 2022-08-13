package com.spring.jdbc3.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc3.entities.Emp;

public class EmpDaoImpl implements EmpDao{
	
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Emp emp) {
		
		String query = "insert into emp1(id,name,post) values(?,?,?)";
		int result = this.jdbcTemplate.update(query,emp.getId(),emp.getName(),emp.getPost());
		return result;
	}

	public int delete(int emp) {
		String query = "delete from emp1 where id = ?";
		int result = this.jdbcTemplate.update(query,emp);
		return result;
	}

	public int update(Emp emp) {
		String query = "update emp1 set name=?,post=? where id=?";
		int result = this.jdbcTemplate.update(query,emp.getName(),emp.getPost(),emp.getId());
		return result;
	}

	public Emp getEmp(int empId) {
		String query = "select * from emp1 where id=?";
		
		RowMapper<Emp> rowMapper = new RowMapperImpl();
		Emp result = this.jdbcTemplate.queryForObject(query,rowMapper,empId);
		return result;
	}

	public List<Emp> getAllEmp() {
		
		String query = "select * from emp1";
		List<Emp> result = this.jdbcTemplate.query(query,new RowMapperImpl());
		return result;
	}



	

	
	
	

}
