package core.springcore.springlifecycleusingXML;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
private String name;

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Example [name=" + name + "]";
}

@PostConstruct
public void start()
{
	System.out.println("init method start of example");
}

@PreDestroy
public void stop()
{
	System.out.println("destroy method call of example");
}

}
