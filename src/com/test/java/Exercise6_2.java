package com.test.java;

public class Exercise6_2 {
	public static void main(String[] args) {
		Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	}
}

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int total() {
		return kor + eng + math;
	}
	
	float average() {
		return Math.round(total() / 3f * 10) / 10f;
		//return (int)(total() / 3f * 10 + 0.5f) / 10.0f;
	}
	
	String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + total() + ", " +average();
	}
}