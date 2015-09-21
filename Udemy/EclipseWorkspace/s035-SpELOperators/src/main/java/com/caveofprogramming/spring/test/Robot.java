package com.caveofprogramming.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private String id = "Default Robot";
	private String speech = "hello";
	
	public void speak(){
		System.out.println(id + ":" + speech);
	}

	@Autowired
	public void setId(@Value("#{randomText.text?.length()}") String id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("#{T(Math).sin(T(Math).PI/4) ^ 2 lt 0.8}") String speech) {
		this.speech = speech;
	}
	
}
