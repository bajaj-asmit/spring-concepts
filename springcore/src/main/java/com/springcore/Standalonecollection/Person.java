package com.springcore.Standalonecollection;

import java.util.List;
import java.util.Map;

public class Person {
 private List<String> names;
 private  Map<String, Integer> feesStructures;

public Map<String, Integer> getFeesStructures() {
	return feesStructures;
}

public void setFeesStructures(Map<String, Integer> feesStructures) {
	this.feesStructures = feesStructures;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

public List<String> getNames() {
	return names;
}

public void setNames(List<String> names) {
	this.names = names;
}

@Override
public String toString() {
	return "Person [names=" + names + ", feesStructures=" + feesStructures + "]";
}



}
