package com.devmode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Animal animal = context.getBean("myHorse", Animal.class);
		
		// call methods on the bean
		System.out.println(animal.getSpeed());
		
		// close the context
		context.close();
	}

}







