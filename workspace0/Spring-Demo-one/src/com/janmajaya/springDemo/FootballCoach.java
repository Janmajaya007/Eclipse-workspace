package com.janmajaya.springDemo;

import java.util.Random;

public class FootballCoach implements Coach {
	private String country;
	private String team;
	
	private FortuneService fortuneService;

	
	public FootballCoach(){
		
	}
	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice 5 hours daily in the field";
	}

	@Override
	public String getDailyFortune() {
		String str[] = { "7 is your lucky number", "today is your Lucky day", "You will win  today" };
		int rnd = new Random().nextInt(str.length);
		return str[rnd];
	}

}
