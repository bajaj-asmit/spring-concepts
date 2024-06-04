package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconflig.xml");
		Emp e1=(Emp) context.getBean("emp1");
		System.out.println(e1.getName());
		System.out.println(e1.getAddress());
		System.out.println(e1.getPhones());
		System.out.println(e1.getCourses());
		System.out.println(e1.getProperties());
		//System.out.println(e1);
        Emp e2=context.getBean("emp2",Emp.class);
        System.out.println(e1.hashCode());
        System.out.println(e1.hashCode());
	}

}
