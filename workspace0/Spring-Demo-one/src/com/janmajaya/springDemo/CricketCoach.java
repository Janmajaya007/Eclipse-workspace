package com.janmajaya.springDemo;

public class CricketCoach implements Coach {
	private String emailAddress;
	private String team;
	private FortuneService fortuneService;
	
	//Create a no argument constructor
	public CricketCoach(){
		System.out.println("CricketCoach: inside no aargument constructor");
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside the setEmailAddress method");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Inside the setTeam method");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter Injection: inside the setter method");
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Do batting practice 5 hours daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
