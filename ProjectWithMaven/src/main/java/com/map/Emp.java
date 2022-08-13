package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	
	@Id
	private int emp_id;
	private String emp_name;
	
	private List<Project> project;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int emp_id, String emp_name, List<Project> project) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.project = project;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	

}
