package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get beans
		PracticeCoach practiceCoach = context.getBean("practiceCoach", PracticeCoach.class);
		
		//call methods
		System.out.println(practiceCoach.getDailyWorkout());
		System.out.println("Random Fortune : " + practiceCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
