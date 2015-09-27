package com.caveofprogramming.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/aop/beans.xml");
		System.out.println("-----");
		Camera camera = (Camera) context.getBean("camera");
		Lens lens = (Lens) context.getBean("lens");
		
		camera.snap();
		camera.snap(1000);
		camera.snap("Prague castle");
		camera.snapNighttime();
		
		lens.zoom(5);
		
		System.out.println("-----");
		context.close();
	}
}
