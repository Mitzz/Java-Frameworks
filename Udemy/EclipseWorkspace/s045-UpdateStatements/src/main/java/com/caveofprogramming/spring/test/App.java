package com.caveofprogramming.spring.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		System.out.println("------");
		OffersDAO offersDao = (OffersDAO) context.getBean("offersDAO");
		
		try{
			offersDao.deleteOffer(3);
			
			List<Offer> offers = offersDao.getOffers();
		
			for (Offer offer : offers) {
				System.out.println(offer);
			}
			
			Offer offer = offersDao.getOffer(2);
			System.out.println("Should be Mike: " + offer);
			
		}
		catch(CannotGetJdbcConnectionException e){
			System.out.println("Cannot get database connection");
		}
		catch(DataAccessException e){
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		System.out.println("------");
		((ClassPathXmlApplicationContext)context).close();
	}

}
