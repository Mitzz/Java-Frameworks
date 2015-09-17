package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		System.out.println("------");
		Person person = (Person) context.getBean("person");
		
		person.setTaxId(666);
		
		System.out.println(person);
		
		Address address2 = (Address) context.getBean("address2");
		System.out.println("Address 2: " + address2);

		System.out.println("------");
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
