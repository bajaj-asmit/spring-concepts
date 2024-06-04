package com.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// it is not important to pass obj in component we can do empty  
@Component("obj")
@Scope("prototype")
public class Student {
    
	@Value("Ashmit bajaj")
	private String studentName;
	
	@Value("panipat")
	private String cityName;
	
	@Value("#{phones}")
	private List<String> phoneNumber;
	
	
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", cityName=" + cityName + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
