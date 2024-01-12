package com.test.java;

public class Exercise9_1 {
	public static void main(String[] args) {
		SutdaCard3 c1 = new SutdaCard3(3, true);
		SutdaCard3 c2 = new SutdaCard3(3, true);
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2):" + c1.equals(c2));
	}
}

class SutdaCard3 {
	int num;
	boolean isKwang;
	
	SutdaCard3() {
		this(1, true);
	}
	
	SutdaCard3(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof SutdaCard3) {
			SutdaCard3 c = (SutdaCard3) obj;
			return num == c.num && isKwang == c.isKwang;
		}
		
		return false;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}