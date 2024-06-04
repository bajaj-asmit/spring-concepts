package com.springcore.ci;

import java.util.List;

public class person {
 private String name;
 private int age;
 private Certi certi;
 private List<String> list;
public person(String name, int age, Certi certi,List<String> list) {
	super();
	this.name = name;
	this.age = age;
	this.certi=certi;
	this.list=list;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name+" | "+this.age +" { "+this.certi.name+" }"+this.list;
};
 
}
