package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);

		// call method on the bean
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyWorkout());

		// simply call the method
		System.out.println(baseballCoach.getDailyFortune());
		System.out.println(trackCoach.getDailyFortune());

		// below is from setter injection
		System.out.println(cricketCoach.getDailyFortune());

		// below is injecting literal values
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());

		// below is injecting values from Properties file
		System.out.println(cricketCoach.getHomeGround());
		System.out.println(cricketCoach.getTeamOwner());

		// close the context
		context.close();

	}

}
