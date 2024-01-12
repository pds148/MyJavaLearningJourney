package com.test.java;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Exercise14_3 {
	public static void main(String[] args) {
		BinaryOperator<Integer> f = (a, b) -> a > b ? a : b;
	}
	
	
}
