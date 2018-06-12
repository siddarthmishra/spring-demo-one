package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	private String homeGround;
	private String teamOwner;

	// create no arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach : No Arg-Constructor");
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setFortuneService method");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setEmailAddress method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setTeam method");
		this.team = team;
	}

	public String getHomeGround() {
		return homeGround;
	}

	public void setHomeGround(String homeGround) {
		System.out.println("CricketCoach : inside setHomeGround method");
		this.homeGround = homeGround;
	}

	public String getTeamOwner() {
		return teamOwner;
	}

	public void setTeamOwner(String teamOwner) {
		System.out.println("CricketCoach : inside setTeamOwner method");
		this.teamOwner = teamOwner;
	}

	@Override
	public String getDailyWorkout() {
		return "Bowl 10 overs and field at mid wicket";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}