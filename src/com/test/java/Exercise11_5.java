package com.test.java;

import java.util.*;

class SutdaCard4 {
	int num;
	boolean isKwang;
	
	SutdaCard4() {
		this(1, true);
	}
	
	SutdaCard4(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof SutdaCard4) {
			SutdaCard4 c = (SutdaCard4) obj;
			return num == c.num && isKwang == c.isKwang;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
	public int hashCode() {
		return toString().hashCode();
	}
}

public class Exercise11_5 {
	public static void main(String[] args) {
		SutdaCard4 c1 = new SutdaCard4(3, true);
		SutdaCard4 c2 = new SutdaCard4(3, true);
		SutdaCard4 c3 = new SutdaCard4(1, true);
		
		HashSet<SutdaCard4> set = new HashSet<SutdaCard4>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);
	}
}
