package com.tnsif.demo.Day16.LambdaConcpt;


import java.util.Arrays;
import java.util.List;

public class Task {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,26,5,3,4);
		li.stream().
		sorted().
		forEach(System.out::println);
		//sorted()
		
		li.stream().
		map(n->n *2).
		forEach(System.out::println);
		//map()
		
	}

}