package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		System.out.println("------");
		FruitBasket basket = (FruitBasket) context.getBean("basket");
		
		System.out.println(basket);

		System.out.println("------");
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
