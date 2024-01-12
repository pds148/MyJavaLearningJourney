package com.test.java;

public class Exercise9_2 {
	public static void main(String[] args) {
		Point3D2 p1 = new Point3D2(1, 2, 3);
		Point3D2 p2 = new Point3D2(1, 2, 3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?" + (p1 == p2));
		System.out.println("p.equals(p2)?"+ (p1.equals(p2)));
	}
}

class Point3D2 {
	int x, y, z;
	
	Point3D2(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Point3D2() {
		this(0, 0, 0);
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Point3D2) {
			Point3D2 p = (Point3D2)obj;
			return x==p.x && y==p.y && z==p.z;
		}
		return false;
	}
	
	public String toString() {
		return "["+x+"," +y+","+z+"]";
	}
}
