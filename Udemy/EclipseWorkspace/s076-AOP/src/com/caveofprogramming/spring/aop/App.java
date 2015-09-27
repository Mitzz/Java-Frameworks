package com.caveofprogramming.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/aop/beans.xml");
		System.out.println("-----");
		
		Object obj = context.getBean("camera");
		System.out.println("Class of 'camera' bean: " + obj.getClass());
		
		System.out.println(obj instanceof Camera);
		System.out.println(obj instanceof PhotoSnapper);
		System.out.println(obj instanceof Machine);
		
		ICamera camera = (ICamera) context.getBean("camera");
		
		try {
			camera.snap();
		} catch (Exception e) {
			System.out.println("Caught exception " + e.getMessage());
		}
		
		System.out.println("-----");
		context.close();
	}
}
