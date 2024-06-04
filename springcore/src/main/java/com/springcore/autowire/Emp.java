package com.springcore.autowire;


public class Emp {
private Address address;

public Emp(Address address) {
	super();
	System.out.println("inside constructure");
	this.address = address;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

}
