package com.janmajaya.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansScopeDemo {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// Retrieve the bean from the container
		Coach theCoach = context.getBean("myCoachC", BaseballCoach.class);
		Coach alphaCoach = context.getBean("myCoachC", BaseballCoach.class);

		// call methods on the bean
		System.out.println(theCoach.hashCode());
		System.out.println(alphaCoach.hashCode());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	
		// close the bean
		context.close();
	}

}
