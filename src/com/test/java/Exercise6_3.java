package com.test.java;

public class Exercise6_3 {
	public static void main(String[] args) {
		Student3 s = new Student3();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}
}

class Student3 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student3() {}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10.0f;
	}
}
