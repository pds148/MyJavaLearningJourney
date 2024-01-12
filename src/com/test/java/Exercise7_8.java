package com.test.java;

class Outer6 {
	int value = 10;
	
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer6.this.value);
		}
	}
}

public class Exercise7_8 {
	public static void main(String[] args) {
		Outer6 outer = new Outer6();
		Outer6.Inner inner = outer.new Inner();
		inner.method1();
	}
}