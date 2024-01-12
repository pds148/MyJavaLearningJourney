package com.test.java;

import java.util.*;

class Student4 implements Comparable<Student4> {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student4(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	
	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," +getAverage();
	}

	@Override
	public int compareTo(Student4 o) {
		if(!(o instanceof Student4)) return -1;
		
		Student4 tmp = (Student4)o;
		return name.compareTo(tmp.name);
		
		/*if(o instanceof Student4) {
			Student4 tmp = (Student4) o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}*/
	}
}

public class Exercise11_3 {
	public static void main(String[] args) {
		ArrayList<Student4> list = new ArrayList<Student4>();
		list.add(new Student4("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student4("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student4("김자바", 1, 3, 80, 80, 90));
		list.add(new Student4("이자바", 1, 4, 70, 90, 70));
		list.add(new Student4("안자바", 1, 5, 60, 100, 80));
		
		Collections.sort(list);
		Iterator<Student4> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}
