package com.spring.jdbc3.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc3.entities.Emp;

public class RowMapperImpl implements RowMapper<Emp> {

	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Emp emp = new Emp();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setPost(rs.getString(3));
		return emp;
	}

	
	
}
