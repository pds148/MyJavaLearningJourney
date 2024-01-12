package com.test.java;

import java.util.*;

class Product5 {}
class Tv5 extends Product5 {}
class Audio extends Product5 {}


public class Ex12_1 {
	public static void main(String[] args) {
		ArrayList<Product5> productList = new ArrayList<Product5>();
		ArrayList<Tv5>      tvList = new ArrayList<Tv5>();
		
		productList.add(new Tv5());
		productList.add(new Audio());
		
		tvList.add(new Tv5());
		tvList.add(new Tv5());
		
		printAll(productList);
	}
	
	public static void printAll(ArrayList<Product5> list) {
		for (Product5 p : list)
			System.out.println(p);
	}
}
