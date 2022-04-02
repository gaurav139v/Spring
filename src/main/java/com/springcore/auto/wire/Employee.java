package com.springcore.auto.wire;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("It used setter injection");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside employee constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}


	
}
