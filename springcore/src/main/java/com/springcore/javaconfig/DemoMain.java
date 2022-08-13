package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = con.getBean("getStudent",Student.class);
 		System.out.println(student);
		student.study();
		
//		Samosa samosa= con.getBean("getSamosa",Samosa.class);
//		System.out.println(samosa);
//		samosa.display();
		

	}
	
}
