package com.tnsif.demo.Day9.Task;

public class ThrowDemo {

	public static void main(String[] args) {
		int pass=15;
		if(pass>35) {
			System.out.println("you are passed");
		}
		else{
			throw new ArithmeticException("The pass Marks <35 so You are Failed");
			
		}

	}

}