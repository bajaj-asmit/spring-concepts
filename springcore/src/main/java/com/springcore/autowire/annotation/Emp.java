package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
     
	@Autowired
	@Qualifier("address1")
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
	System.out.println("setter call");
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
