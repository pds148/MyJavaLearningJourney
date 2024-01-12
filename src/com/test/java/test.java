package com.test.java;

public class test {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int k=2; k<=9; k++) {
				System.out.print(k+"*"+i+"="+i*k+"\t");
			}
			System.out.println();
		}
	}
}