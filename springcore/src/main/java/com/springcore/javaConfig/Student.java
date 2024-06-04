package com.springcore.javaConfig;

import org.springframework.stereotype.Component;



@Component
public class Student {

	Samosa samosa; 
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void getStudy()
	{
		samosa.display();
		System.out.println("student is reading book");
	}
	
}
