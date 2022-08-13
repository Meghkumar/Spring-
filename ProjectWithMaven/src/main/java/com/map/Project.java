package com.map;


public class Project {

	private int project_id;
	private String project_name;
	
	private Emp emp;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int project_id, String project_name, Emp emp) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.emp = emp;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
	
	
}
