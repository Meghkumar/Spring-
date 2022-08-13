package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entites.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// save Student
	@Transactional
	public int insert(Student student) {

		Integer result = (Integer) this.hibernateTemplate.save(student);
		return result;

	}

	// get single Student [**For get we do need any transaction**]
	public Student getStudent(int studentid) {

		Student student = this.hibernateTemplate.get(Student.class, studentid);
		return student;

	}

	// get multiple data

	public List<Student> getAllStudent() {

		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

	//delete data
	@Transactional
	public void deleteStudent(int studentid) {
		
		Student student = this.hibernateTemplate.get(Student.class, studentid);//-->this will first load the class
		this.hibernateTemplate.delete(student);//-->this step will perform delete operation
		
	}
	
	//updating data
	@Transactional
	public void updateStudent(Student student)
	{
		
		try {
			this.hibernateTemplate.update(student);
			
		} catch (Exception e) {
			System.out.println("Some error");
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
