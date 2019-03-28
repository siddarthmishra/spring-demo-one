package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface FortuneService {
	
	public String getFortune();
	
	static String randomFortune() {
		List<String> fortuneServiceArray = new ArrayList<String>();
		fortuneServiceArray.add("Beware of the wolf in sheep's clothing");
		fortuneServiceArray.add("Diligence is the mother of good luck");
		fortuneServiceArray.add("The journey is the reward");
        Random r = new Random();
        return fortuneServiceArray.get(r.nextInt(fortuneServiceArray.size()));
	}
	
	public static void main(String[] args) {
		System.out.println(randomFortune());
	}

}
