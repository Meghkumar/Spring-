package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
//		Samosa s1 = (Samosa) context.getBean("s1");
//		System.out.println(s1);
//		Pepsi p3 = (Pepsi)context.getBean("p3");
//		System.out.println(p3);
		
		Example e = (Example)context.getBean("e1");
		System.out.println(e);
		
		
		
	}
	
}
