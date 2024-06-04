package com.springcore.ci;


public class Addition {
	
	private int a;
	private int b;
	
	public Addition(int a, int b) {

		System.out.println("integer work");
		System.out.println("a="+a);
		System.out.println("b="+b);
		this.a = a;
		this.b = b;
	}
public Addition(double a, double b) {
	
	System.out.println("double work");
	System.out.println("a="+a);
	System.out.println("b="+b);
		this.a = (int)a;
		this.b = (int)b;
	}
	

	public Addition(String a, String b) {
		System.out.println("string work");
		System.out.println("a="+a);
		System.out.println("b="+b);
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

    public int DoSum()
    {
    	return this.a+this.b;
    }

}
