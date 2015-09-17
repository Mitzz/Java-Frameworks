package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		
		Person person = (Person) context.getBean("person");
		
		person.setTaxId(666);
		
		System.out.println(person);

		((ClassPathXmlApplicationContext)context).close();
		
	}

}
