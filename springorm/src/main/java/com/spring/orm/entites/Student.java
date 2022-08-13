package com.spring.orm.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {

	@Id
	@Column(name = "student_id")
	private int studentid;
	@Column(name = "student_name")
	private String studentname;
	@Column(name = "student_post")
	private String studentPost;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentPost() {
		return studentPost;
	}

	public void setStudentPost(String studentPost) {
		this.studentPost = studentPost;
	}

	public Student(int studentid, String studentname, String studentPost) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentPost = studentPost;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
