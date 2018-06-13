package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get beans
        PracticeCoach practiceCoachSingleton = context.getBean("practiceCoach", PracticeCoach.class);
        PracticeCoach alphaPracticeCoachSingleton = context.getBean("practiceCoach", PracticeCoach.class);

        PracticeCoach practiceCoachPrototype = context.getBean("practiceCoachPrototype", PracticeCoach.class);
        PracticeCoach alphaPracticeCoachPrototype = context.getBean("practiceCoachPrototype", PracticeCoach.class);
		
		//call methods
        System.out.println(practiceCoachSingleton.getDailyWorkout());
        System.out.println("Random Fortune : " + practiceCoachSingleton.getDailyFortune());

        // check if beans are same
        boolean isSingleton = practiceCoachSingleton == alphaPracticeCoachSingleton;
        boolean isSingleton1 = practiceCoachPrototype == alphaPracticeCoachPrototype;

        // print out the results
        System.out.println("\nPointing to same objects : " + isSingleton);
        System.out.println("\nMemory Location for practiceCoachSingleton : " + practiceCoachSingleton);
        System.out.println("\nMemory Location for alphaPracticeCoachSingleton : " + alphaPracticeCoachSingleton);
        System.out.println("\nPointing to same objects : " + isSingleton1);
        System.out.println("\nMemory Location for practiceCoachPrototype : " + practiceCoachPrototype);
        System.out.println("\nMemory Location for alphaPracticeCoachPrototype : " + alphaPracticeCoachPrototype);
		
        System.out.println();
		//close context
		context.close();
	}

}
