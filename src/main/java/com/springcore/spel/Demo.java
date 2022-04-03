package com.springcore.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{ 11+22 }") // simple expression
	private int x;
	
	@Value("#{ 8>4?8:4 }") // normal expression (ternary operation)
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}") // call static method
	private double z;
	
	@Value(" #{T(java.lang.Math).E} ")  // call static method
	private double e;
	
	@Value("#{new java.lang.String('Gaurav Verma')}") // any object ex: Integer, Student etc.
	private String name; 
	
	@Value(" #{ 8>2 } ")
	private boolean isActive; // expression return boolean true or false
	
	@Value("#{ names }")
	private List<String> names;  // Standalone collection (names collection defined in config xml)
	
		
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public int getX() {
		return x;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
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
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ ", names=" + names + "]";
	}
	
	
	
}
