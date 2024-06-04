package com.springcore.Standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Standalonecollection/standAloneconflig.xml");
        
		Person p1=context.getBean("p1",Person.class);
		
		System.out.println(p1);
		
		
		
		System.out.println(p1.getNames().getClass());
		System.out.println("--------------------------------");
		System.out.println(p1.getFeesStructures());
	}

}
