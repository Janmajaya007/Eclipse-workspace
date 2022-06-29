package com.janmajaya.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansSLifecycleDemoApp {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle.xml");

		//Retrieve the bean from the container
		Coach theCoach = context.getBean("myCoach", TrackCoach.class);
	    //Coach alphaCoach = context.getBean("myCoach", BaseballCoach.class);

		// call methods on the bean
		System.out.println(theCoach.hashCode());
		//System.out.println(alphaCoach.hashCode());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
	
		// close the bean
		context.close();
	}

}
