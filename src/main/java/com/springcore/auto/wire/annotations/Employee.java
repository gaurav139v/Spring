package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("addr2") // name of the bean should be passed.
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
