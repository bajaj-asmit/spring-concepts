package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/AnnotationautoWireconflig.xml");
	Emp e1=context.getBean("emp1",Emp.class); //Emp.class direct typecaste into emp class type
	
	System.out.println(e1);
	}

}
