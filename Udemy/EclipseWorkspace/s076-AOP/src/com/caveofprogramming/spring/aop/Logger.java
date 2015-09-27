package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Logger {

	public void aboutToTakePhoto(){
		System.out.println("About to take photo...");
	}
}
