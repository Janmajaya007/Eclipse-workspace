package com.janmajaya.springDemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice daily";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service to get your daily fortune
		return fortuneService.getFortune();
	}
}
