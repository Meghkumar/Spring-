package com.springcore.auto.wire;

public class Emp {
	
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting value");
		
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	

	
	

}
