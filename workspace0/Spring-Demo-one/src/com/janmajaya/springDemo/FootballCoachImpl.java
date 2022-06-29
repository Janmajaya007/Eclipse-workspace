package com.janmajaya.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootballCoachImpl {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean from the container
		FootballCoach theCoach = context.getBean("myFootballCoach", FootballCoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getCountry());
	
		System.out.println(theCoach.getTeam());
		// close the bean
		context.close();
	}

}
