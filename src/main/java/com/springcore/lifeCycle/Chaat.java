package com.springcore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chaat {
	private double price;

	public Chaat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Chaat [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method (init Chaat)");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method (destror chaat)");
	}
}
