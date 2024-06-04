package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconflig.xml");
       person p1=(person) context.getBean("p1");
       
       System.out.println(p1);
       Addition add=(Addition) context.getBean("add");
       System.out.println(add.DoSum());
	}

}
