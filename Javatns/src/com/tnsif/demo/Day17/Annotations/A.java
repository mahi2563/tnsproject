package com.tnsif.demo.Day17.Annotations;

public class A {	
	public void show() {
		System.out.println("Parent");		
		}
}
class B extends A{
@Override
public void show() {
	System.out.println("child");
}
}