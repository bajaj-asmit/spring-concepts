package core.springcore.springlifecycleusingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AbstractApplicationContext context=new ClassPathXmlApplicationContext("core/springcore/springlifecycleusingXML/lifecycleconflig.xml");
      Samosa s1= (Samosa) context.getBean("s1");
      
      System.out.println(s1);
      context.registerShutdownHook();
//      
      System.out.println("+++++++++++++++++++++++++++++++++++");
      
      Pepsi p1=(Pepsi) context.getBean("p1");
      System.out.println(p1);
      
      Example e1=(Example) context.getBean("e1");
      System.out.println(e1);
	}

}