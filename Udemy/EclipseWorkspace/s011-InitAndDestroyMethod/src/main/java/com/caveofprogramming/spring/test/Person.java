package com.caveofprogramming.spring.test;

public class Person {

	private int id;
	private String name;
	private int taxId;
	private Address address;

	public Person() {
		super();
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void onCreate(){
		System.out.println("Person created: " + this);
	}
	
	public void onDestroy(){
		System.out.println("Person destroyed.");
	}

	public void speak() {
		System.out.println("Hello I'm a person");
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}

}
