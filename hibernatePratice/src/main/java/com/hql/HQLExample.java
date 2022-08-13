package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Emp;

public class HQLExample {
	
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		String querry = "from Emp where Project=':z'";
		
		
		Query q = session.createQuery(querry);
		q.setParameter("z","Mumbai");
		
		
		List<Emp> list = q.list();
		for (Emp emp : list) {
			System.out.println(emp.getEmp_id()+" : "+emp.getEmp_name());
		}
		
		
		
		
		Transaction tx  = session.beginTransaction();
	}

}
