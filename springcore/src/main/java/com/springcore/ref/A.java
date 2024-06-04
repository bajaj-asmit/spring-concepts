package com.springcore.ref;

public class A {
 private int x;
 B obj;
@Override
public String toString() {
	return "A [x=" + x + ", obj=" + obj + ", getX()=" + getX() + ", getObj()=" + getObj() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public B getObj() {
	return obj;
}
public void setObj(B obj) {
	this.obj = obj;
}
}
