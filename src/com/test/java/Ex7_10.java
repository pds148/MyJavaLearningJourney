package com.test.java;

public class Ex7_10 {
	public static void main(String[] args) {
		Unit[] group = { new Marine2(), new Tank(), new Dropship() };
		
		for (int i = 0; i < group.length; i++ )
			group[i].move(100, 200);
		
		unitMove(new Tank());
		unitMove(new Marine2());
	}
	
	static void unitMove(Unit unit) {
		unit.move(50, 30);
	}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {         }
}


class Marine2 extends Unit {
	void move(int x, int y) {
		System.out.println("Marine2[x=" + x + ",  y=" + y + "]");
	}
	void stimPack() {            }
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",  y=" + y + "]");
	}
	void changeMode() {            }
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ", y=" + y + "]");
	}
	void load() {         }
	void unload()  {          }
}