package com.janmajaya.springDemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a 5Km daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	//add init method
	public void doMyStartupStuff(){
		System.out.println("Here the init method start");
	}
	
	//add a destroy method
	public void doMyStartupStuffEnd(){
		System.out.println("Here the destroy method end");
	}

}
