package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Emp emp1 = new Emp();
		emp1.setEmp_id(101);
		emp1.setEmp_name("rahul");
		
		Emp emp2 = new Emp();
		emp2.setEmp_id(102);
		emp2.setEmp_name("sham");
		
		Project p1 = new Project();
		p1.setProject_id(111);
		p1.setProject_name("Library Management system");
		p1.setEmp(emp1);
		
		
		Project p2 = new Project();
		p2.setProject_id(112);
		p2.setProject_name("Chat Bot");
		p2.setEmp(emp1);
		
		Project p3 = new Project();
		p3.setProject_id(113);
		p3.setProject_name("Banking finance");
		p3.setEmp(emp2);
		
		List<Project> list = new ArrayList<Project>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		emp1.setProject(list);
		emp2.setProject(list);
		
		
		
		Session session = factory.openSession();
		Transaction tx  = session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tx.commit();
		session.close();
		factory.close();
		
		
		
	}

}
