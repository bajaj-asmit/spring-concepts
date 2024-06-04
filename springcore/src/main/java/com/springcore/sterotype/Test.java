package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/sterotype/sterotypeconflig.xml");
      Student s1=context.getBean("obj",Student.class);
      
      System.out.println(s1);
      
      System.out.println(s1.hashCode());
      
      Student s2=context.getBean("obj",Student.class);
      
      System.out.println(s2.hashCode());
      
      Teacher t1=context.getBean("t1",Teacher.class);
      Teacher t2=context.getBean("t1",Teacher.class);
      System.out.println(t1.hashCode());
      System.out.println(t2.hashCode());
      
	}

}
