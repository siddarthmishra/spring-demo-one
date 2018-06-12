package com.luv2code.springdemo;

public class ToughFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "ToughFortuneService : Today you will have tough day. Don't worry good days are ahead";
	}

}
