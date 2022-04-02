package com.springcore.stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Have to use @Component annotation "obj" is the object name that it will create
 *  if that field blank then object name will be according to standard variable naming convention example (student) first letter samll.
*/
@Component("obj") 
@Scope("prototype") // Bean scope : IOC will create new object every time when someone request object.
public class Student {
	@Value("Gaurav") // to store value in reference variable otherwise it will have null
	private String name;
	
	@Value("Jabalpur")
	private String city;
	
	@Value("#{address}")  // spring expression language
	private List<String> address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	
}
