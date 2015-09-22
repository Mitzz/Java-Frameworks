package com.caveofprogramming.spring.test;

import java.util.ArrayList;
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
			List<Offer> offers = new ArrayList<Offer>();
			
			offers.add(new Offer(3, "Steve", "steve@caveofprogramming.com", "Cash for software"));
			offers.add(new Offer(2, "Joe", "joe@caveofprogramming.com", "Elegant Web Design"));
			
			int[] rvals = offersDao.create(offers);
			
			for (int value : rvals) {
				System.out.println("Updated " + value + " rows.");
			}
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
