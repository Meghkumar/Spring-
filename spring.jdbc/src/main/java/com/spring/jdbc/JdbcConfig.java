package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
public class JdbcConfig {

	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("megh");
		ds.setPassword("root");
		
		return ds;
	}
	
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbctemplate = new JdbcTemplate();
		jdbctemplate.setDataSource(getDataSource());
		return jdbctemplate;
		
	}
	
	
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTemplate(getTemplate());
		
		return studentDao;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
		
	
}
