package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;

public interface FortuneService {
	
	public String getFortune();
	
	static String randomFortune() {
		List<String> fortuneServiceArray = new ArrayList<String>();
		fortuneServiceArray.add("Beware of the wolf in sheep's clothing");
		fortuneServiceArray.add("Diligence is the mother of good luck");
		fortuneServiceArray.add("The journey is the reward");
		return fortuneServiceArray.get((int) (Math.random()*3));
	}
	
	public static void main(String[] args) {
		System.out.println(randomFortune());
	}

}
