package com.springcore.SEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/SEL/SELconflig.xml");
	
     Demo d1=context.getBean("obj",Demo.class);
     
     System.out.println(d1);
     
     SpelExpressionParser temp=new SpelExpressionParser();
     
     Expression expression=temp.parseExpression("5*5+2/8");
	  System.out.println(expression.getValue());
	}

}
