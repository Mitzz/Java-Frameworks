package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/caveofprogramming/spring/test/beans/beans.xml");
		
		Person person = (Person) context.getBean("person");
		person.speak();

		((FileSystemXmlApplicationContext)context).close();
		
	}

}
