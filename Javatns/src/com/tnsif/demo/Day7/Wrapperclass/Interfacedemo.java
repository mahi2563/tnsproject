package com.tnsif.demo.Day7.Wrapperclass;

public interface Interfacedemo {
	void show();
	
}
class dog implements Interfacedemo{

	@Override
	public void show() {
		System.out.println("Dog barks");
		
	}
	
}