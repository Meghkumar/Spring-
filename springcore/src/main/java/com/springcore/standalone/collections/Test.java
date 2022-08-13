package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person person1 = (Person)context.getBean("person1");
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass());
		System.out.println("----------------------------------------------------");
		
		System.out.println(person1.getFeesStructure());
		System.out.println(person1.getFeesStructure().getClass());
		
		System.out.println("----------------------------------------------------");
		System.out.println(person1.getProp());
		System.out.println(person1.getProp().getClass());
		
		
	}

}
