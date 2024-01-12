package com.test.java;

public class PlayingCard {
	//인스턴트 변수
	int kind ;
	int num;
	
	//클래스 변수(static) 
	static int width;
	static int height;
	
	//지역변수
	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	} 
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	}
}
