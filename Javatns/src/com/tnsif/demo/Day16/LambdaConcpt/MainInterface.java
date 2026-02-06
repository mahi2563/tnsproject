package com.tnsif.demo.Day16.LambdaConcpt;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainInterface {

	public static void main(String[] args) {
		myinterface myin=()->System.out.println("This is lambda expression example");	
	myin.print();	
	Predicate<Integer> p=(n)->n%2==0;
	System.out.println(p.test(5));
	
	Consumer<String> con=(name)->System.out.println(name.toUpperCase());
	con.accept("hello");
	
	Supplier<Double> sup=()->Math.random();
	System.out.println(sup.get());
	}

}