package com.spring.jdbc3.entities;

public class Emp {

	private int id;
	private String name;
	private String post;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPost() {
		return post;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", post=" + post + "]";
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Emp(String post) {
		super();
		this.post = post;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

}
