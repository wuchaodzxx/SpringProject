package com.springmvc.config.springconfig;

public class Dog {
	public String name;
	public int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void bark() {
		System.out.println("Dog is barking!");
	}
	
}
