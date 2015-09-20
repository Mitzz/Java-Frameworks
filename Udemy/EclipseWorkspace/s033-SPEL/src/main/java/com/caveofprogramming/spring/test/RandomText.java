package com.caveofprogramming.spring.test;

import java.util.Random;

public class RandomText {
	
	private static String[] texts = {
		
		"I'll be back",
		"Get out!",
		"I want your clothes, boots and motorcycle."
	};
	
	public String getText(){
		return texts[new Random().nextInt(texts.length)];
	}

}
