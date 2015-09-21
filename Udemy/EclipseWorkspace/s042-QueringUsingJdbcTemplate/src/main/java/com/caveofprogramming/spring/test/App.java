package com.caveofprogramming.spring.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		System.out.println("------");
		OffersDAO offersDao = (OffersDAO) context.getBean("offersDAO");
		List<Offer> offers = offersDao.getOffers();
		
		for (Offer offer : offers) {
			System.out.println(offer);
		}
		
		System.out.println("------");
		((ClassPathXmlApplicationContext)context).close();
	}

}
