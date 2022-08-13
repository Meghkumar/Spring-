package com.springcore.auto.wire;

public class Address {

	private String street;
	private String city;
	private int roadno;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, int roadno) {
		super();
		this.street = street;
		this.city = city;
		this.roadno = roadno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRoadno() {
		return roadno;
	}

	public void setRoadno(int roadno) {
		this.roadno = roadno;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", roadno=" + roadno + "]";
	}

}
