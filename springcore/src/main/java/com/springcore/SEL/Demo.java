package com.springcore.SEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("obj")
public class Demo {

	@Value("#{2>3?15:14}")
	private int x;
	@Value("#{89>0?4:10}")
	private int y;
	
	@Value("#{T(java.lang.Math).E}")
	private double z;
	
	@Value("#{ new java.lang.String('Asmit bajaj')}")
    private String names;
    
	@Value("#{99>11}")
	private boolean isActive;
	
	
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", names=" + names + ", isActive=" + isActive + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
