package com.tnsif.demo.Day9.Inheritance;

class A{
	void show() {
		System.out.println("This is single inheritance");
	}
}
class B extends A{
	void display() {
		System.out.println("Single inheritance completed successfully");
	}
}
public class SingleInherit {

	public static void main(String[] args) {
		
	B SI=new B();
	SI.show();
	SI.display();
	}

}