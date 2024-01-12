package com.test.java;

public class Exercise6_21 {
	
	public static int abs(int value) {
		return value < 0 ? -value : value > 0 ? value : 0;
	}
	
	public static void main(String[] args)
	{
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}
}
