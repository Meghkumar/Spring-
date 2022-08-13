package com.springcore;

import java.util.Map;

public class Student {

	private Map<String, String> studentid;
	private String studentName;
	private String studentAddress;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Map<String, String> studentid, String studentName, String studentAddress) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Map<String, String> getStudentid() {
		return studentid;
	}

	public void setStudentid(Map<String, String> studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

}
