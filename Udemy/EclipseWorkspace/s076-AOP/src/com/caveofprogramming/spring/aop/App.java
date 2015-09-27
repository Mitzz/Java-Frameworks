package com.caveofprogramming.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/aop/beans.xml");
		System.out.println("-----");
		Camera camera = (Camera) context.getBean("camera");
		
		try {
			camera.snap();
		} catch (Exception e) {
			System.out.println("Caught exception " + e.getMessage());
		}
		
		System.out.println("-----");
		context.close();
	}
}
