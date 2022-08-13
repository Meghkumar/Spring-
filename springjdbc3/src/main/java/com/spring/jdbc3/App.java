package com.spring.jdbc3;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc3.dao.EmpDao;
import com.spring.jdbc3.entities.Emp;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc3/config.xml");
    	EmpDao empDao = context.getBean("empDao",EmpDao.class);
    	
    	Emp emp = new Emp();
//    	emp.setId(4);
//    	emp.setName("parth");
//    	emp.setPost("clerk");
//    	
//    	int result = empDao.insert(emp);
//    	System.out.println("Data has been inserted "+result);
   
    	
//    	int result = empDao.delete(101);
//    	System.out.println("Data Deleted "+result);
    	
//    	emp.setId(102);
//    	emp.setName("Nikhil");
//    	emp.setPost("Developer");
//    	
//    	int result = empDao.update(emp);
//    	System.out.println("Data updated");
    	
    	
//    	Emp result = empDao.getEmp(4);
//    	System.out.println("Data retrieved"+result);
    	
    	List<Emp> result = empDao.getAllEmp();
    	for (Emp emp2 : result) {
			System.out.println(emp2);
		}
    	
    	
    	
    	
    }
}
