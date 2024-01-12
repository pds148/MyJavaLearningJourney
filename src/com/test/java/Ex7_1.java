package com.test.java;

class Tv2 {
	boolean power;
	int channel;
	
	void power()       {  power = !power;  }
	void channelUp()   {  ++channel;  }
	void channelDown() {  --channel;  }
}

class SmartTv extends Tv2 {
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class Ex7_1 {
	public static void main(String args[]) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;
		stv.displayCaption("Hello, World");
	}
}
