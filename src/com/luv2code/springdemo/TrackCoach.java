package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		System.out.println("No Arg-TrackCoach CricketCoach");
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuffYoYo() {
		System.out.println("TrackCoach : inside method doMyStartupStuffYoYo");
	}

	// add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach : inside method doMyCleanupStuffYoYo");
	}

}
