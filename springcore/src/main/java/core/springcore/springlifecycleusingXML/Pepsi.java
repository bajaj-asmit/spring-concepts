package core.springcore.springlifecycleusingXML;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
private int price;


public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	//init
	System.out.println("taking pepsi");
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("going to put after drinking");
}


}
