package com.caveofprogramming.spring.test;

public class PersonFactory {
	
	public Person createPerson(int id, String name){
		System.out.println("Creating Person using Factory class");
		return new Person(id, name);
	}

}
