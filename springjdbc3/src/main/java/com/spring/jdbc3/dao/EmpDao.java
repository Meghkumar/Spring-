package com.spring.jdbc3.dao;

import java.util.List;

import com.spring.jdbc3.entities.Emp;

public interface EmpDao {
	
	public int insert(Emp emp);
	public int delete(int emp);
	public int update(Emp emp);
	public Emp getEmp(int empId);
	public List<Emp> getAllEmp();
	
	

}
