package com.caveofprogramming.spring.test;


public class Robot {

	private String id = "Default Robot";
	private String speech = "hello";
	
	public void speak(){
		System.out.println(id + ":" + speech);
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}
	
}
