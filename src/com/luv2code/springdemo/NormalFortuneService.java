package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;

public class NormalFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		return "NormalFortuneService : Don't worry. It will be a just another day";
	}

}
