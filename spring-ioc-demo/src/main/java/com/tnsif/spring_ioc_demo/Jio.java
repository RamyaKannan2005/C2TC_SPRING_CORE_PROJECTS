
package com.tnsif.springdemo;

public class Jio implements Mobile{

	@Override
	public void call() {
		System.out.println("Call using Jio");
		
	}

	@Override
	public void data() {
		System.out.println("Sharing using Jio");
		
	}
	
	public void print() {
		System.out.println("Jio");
	}

}
