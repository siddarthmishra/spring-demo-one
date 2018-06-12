package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		// retrieve beans from the spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);

		// call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();

	}

}
