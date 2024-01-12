package com.test.java;

import java.util.*;

class Student5 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student5(String name, int ban, int no, int kor, int eng, int math) {
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
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}
	
	public String toString() {
		return name
				+ "," + ban
				+ "," + no
				+ "," + kor
				+ "," + eng
				+ "," + math
				+ "," + getTotal()
				+ "," + getAverage()
				;
	}
}


class BanNoAscending implements Comparator<Student5> {
	public int compare(Student5 o1, Student5 o2) {
		if (!(o1 instanceof Student5 && o2 instanceof Student5)) return -1;
		
		Student5 s1 = (Student5) o1;
		Student5 s2 = (Student5) o2;
		
		int result = s1.ban - s2.ban;
		
		if (result == 0) {
			result = s1.no - s2.no;
		}
		
		return result;
		
		
/*		if (o1 instanceof Student5 && o2 instanceof Student5) {
			Student5 s1 = (Student5) o1;
			Student5 s2 = (Student5) o2;
			if (s1.ban > s2.ban)
				return 1;
			else if (s1.ban == s2.ban) {
				if (s1.no > s2.no)
					return 1;
				else
					return -1;
			}
		}
		return -1;*/
	}

}


public class Exercise11_4 {
	public static void main(String[] args) {
		ArrayList<Student5> list = new ArrayList<Student5>();
		list.add(new Student5("이자바", 2, 1, 70, 90, 70));
		list.add(new Student5("안자바", 2, 2, 60, 100, 80));
		list.add(new Student5("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student5("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student5("김자바", 1, 2, 80, 80 ,90));
		
		Collections.sort(list, new BanNoAscending());
		Iterator<Student5> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}
