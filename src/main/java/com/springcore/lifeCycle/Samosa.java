package com.springcore.lifeCycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price (Samosa)");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	// method name can be anything
	public void init() {
		System.out.println("Inside init method (Samosa)");
	}
	
	// method name can be anything bug same name should be same in config xml
	public void destory() {
		System.out.println("Insdie destory method (Samosa)");
	}
}
