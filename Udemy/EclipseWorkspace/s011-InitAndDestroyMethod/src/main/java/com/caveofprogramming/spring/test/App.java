package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/beans/beans.xml");
		
		Person person1 = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person");
		
		person1.setTaxId(666);
		
		System.out.println(person2);

		((ClassPathXmlApplicationContext)context).close();
		
	}

}
