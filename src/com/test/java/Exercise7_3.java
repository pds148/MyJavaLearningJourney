package com.test.java;

class Product3
{
	int price;
	int bonusPoint;
	
	Product3(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
	
	
}

class Tv4 extends Product3 {
	Tv4() {
		super(500);
	}
	
	public String toString() {
		return "Tv4";
	}
}

public class Exercise7_3 {
	public static void main(String[] args) {
		Tv4 t = new Tv4();
	}
}
