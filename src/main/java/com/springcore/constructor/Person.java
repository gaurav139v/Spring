package com.springcore.constructor;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private List<String> list;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int personId, List<String> list) {
		super();
		this.name = name;
		this.personId = personId;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId +", list : "+this.list +  "]";
	}
	
}
