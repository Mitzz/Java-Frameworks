package com.caveofprogramming.spring.test;

public class Address {

	private String street;
	private String postcode;
	
	public Address(){}

	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}
	
	public void init(){
		System.out.println("Bean created: " + this);
	}
	
	public void destroy(){
		System.out.println("Bean destroyed: " + this);
	}
	
	

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}

}
