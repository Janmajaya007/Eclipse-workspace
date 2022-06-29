package com.janmajaya.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from spring configuration
		Coach theCoach = context.getBean("myCoachS", Coach.class);
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		//Lets call our new method for fortune service
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();
	}

}
