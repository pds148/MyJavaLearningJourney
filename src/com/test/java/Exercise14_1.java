package com.test.java;

public class Exercise14_1 {
	public int max(int a, int b) {
		return a > b ? a : b;
	}
	
	//(a, b) -> a > b ? a : b;
	
	public int printVar(String name, int i) {
		System.out.println(name + "=" + i);
		return i;
	}
	
	//(name, i) -> System.out.println(name + "=" + i);
	
	
	public int square(int x) {
		return x * x;
	}
	
	// x -> x * x; 
	
	public int roll() {
		return (int)(Math.random() * 6);
	}
	
	// ( ) -> (int)(Math.random() * 6);
	
	public int sumArr(int [] arr) {
		int sum = 0;
		for(int i : arr)
			sum += i;
		return sum;
	}
	
	// (int[] arr) -> { 
	//         int sum = 0; 
	//         for(int i : arr) 
	//            sum += i;
	//         return sum;
	
	public int[] emptyArr() {
		return new int[]{};
	}
	
	// () -> new int[]{};
}
