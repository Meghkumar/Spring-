package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    

	public static void main( String[] args )
    {
        System.out.println( "My jdbc programme started" );
        
       // ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        // insert querry
        //String query = "insert into student(id,name,city) values(?,?,?)";
        // now querry execute
       // int result = template.update(query,954,"Shivam Kumar","Udaipur");
       
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        
        //FOR INSERT
//        Student student = new Student();
//        student.setId(121);
//        student.setName("Rahul");
//        student.setCity("Kolhapur");
//        
//        int result = studentDao.insert(student);
//        System.out.println("Student added "+result);
        
        
        //FOR UPDATE
//        student.setId(456);
//        student.setName("Raj Kumar");
//        student.setCity("Delhi");
//        
//        int result = studentDao.change(student);
//        System.out.println("Data has been updated");
        
        //FOR Delete
//        int result = studentDao.delete(222);
//        System.out.println("Data Deleted");
        
            
//        Student student=studentDao.getStudent(456);
//        System.out.println(student);
        
        
        	List<Student> students = studentDao.getAllStudents();
        	for (Student s: students) {
				System.out.println(s);
			}
        
        
        
        
     
        
        
        
        
        
        
        
        
        
    }
}
