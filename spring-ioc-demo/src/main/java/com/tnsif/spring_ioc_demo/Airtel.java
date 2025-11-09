package com.tnsif.spring_ioc_demo;



public class Airtel implements Mobile{
	String name;
	String state;
	Integer number;
	public Airtel() {}
	public Airtel(String name, String state, Integer number){
		this.name = name;
		this.state = state;
		this.number = number;
	}
	
	@Override
	public void call() {
		System.out.println("Call using Airtel");
		
	}

	@Override
	public void data() {
		System.out.println("Sharing using Airtel");
		
	}
	
	public void print() {
		System.out.println("Airtel [name=" + name + ", state=" + state + ", number=" + number + "]");
	}

	@Override
	public String toString() {
		return "Airtel [name=" + name + ", state=" + state + ", number=" + number + "]";
	}

}
