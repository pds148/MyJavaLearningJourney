package com.test.java;

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard2[] cards2 = new SutdaCard2[CARD_NUM];
	
	SutdaDeck2() {
		for ( int i = 0; i < cards2.length; i++ ) {
			int num = i%10+1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards2[i] = new SutdaCard2(num,isKwang);
		}
	}
	
	void shuffle() {
		for (int i = 0; i < cards2.length; i++) {
			int index = (int)((Math.random())*cards2.length);
			SutdaCard2 shuffleCard = cards2[i];
			cards2[i] = cards2[index];
			cards2[index] = shuffleCard;
		}
	}
	
	SutdaCard2 pick(int index) {
		if(index < 0 || index > CARD_NUM)
			return null;
		return cards2[index];
		
	}
	
	SutdaCard2 pick() {
		int index = (int)(Math.random()*cards2.length);
		return pick(index);
	}
}


class SutdaCard2 {
	int num;
	boolean isKwang;
	
	SutdaCard2() {
		this(1, true);
	}
	
	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Exercise7_2 {
	public static void main(String args[]) {
		SutdaDeck2 deck = new SutdaDeck2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards2.length; i++)
			System.out.print(deck.cards2[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
