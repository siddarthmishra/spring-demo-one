package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public BaseballCoach() {
		System.out.println("No Arg-BaseballCoach CricketCoach");
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting parctice";
	}

	@Override
	public String getDailyFortune() {
		
		//use fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
