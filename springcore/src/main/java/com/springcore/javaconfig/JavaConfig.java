package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig") ---> used when we are using @Component 
public class JavaConfig {

	@Bean
	public Student getStudent() {
		Student student = new Student();
		return student;

	}
	
	@Bean
	public Samosa getSamosa() {
		Samosa samosa = new Samosa();
		return samosa;

	}

}



