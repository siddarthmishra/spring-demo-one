package com.luv2code.springdemo;

public class PracticeCoach implements Coach {

	private PracticeFortuneService practiceFortuneService;
	
	public void setPracticeFortuneService(PracticeFortuneService practiceFortuneService) {
		this.practiceFortuneService = practiceFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return practiceFortuneService.getFortune();
	}

}
