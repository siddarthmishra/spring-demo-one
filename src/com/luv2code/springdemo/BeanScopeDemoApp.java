package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve beans from spring container
		Coach theCoachSingleton = context.getBean("trackCoachSingleton", Coach.class);
		Coach alphaCoachSingleton = context.getBean("trackCoachSingleton", Coach.class);

		Coach theCoachPrototype = context.getBean("trackCoachPrototype", Coach.class);
		Coach alphaCoachPrototype = context.getBean("trackCoachPrototype", Coach.class);

		// check if the beans are same
		boolean isSingleton = (theCoachSingleton == alphaCoachSingleton);
		boolean isSingleton1 = (theCoachPrototype == alphaCoachPrototype);

		// print out the result
		System.out.println("\nPointing to the same object : " + isSingleton);
		System.out.println("\nMemory Location for theCoachSingleton : " + theCoachSingleton);
		System.out.println("\nMemory Location for alphaCoachSingleton : " + alphaCoachSingleton);

		System.out.println("\nPointing to the same object : " + isSingleton1);
		System.out.println("\nMemory Location for theCoachPrototype : " + theCoachPrototype);
		System.out.println("\nMemory Location for alphaCoachPrototype : " + alphaCoachPrototype + "\n");

		// close the context
		context.close();
	}
}
