package com.test.java;

import java.util.*;
import java.util.stream.*;

public class Ex14_5 {
	public static void main(String[] args) {
		Stream<Student7> studentStream = Stream.of(
				    new Student7("이자바", 3, 300),
				    new Student7("김자바", 1, 200),
				    new Student7("안자바", 2, 100),
				    new Student7("박자바", 2, 150),
				    new Student7("소자바", 1, 200),
				    new Student7("나자바", 3, 290),
				    new Student7("감자바", 3, 180)
				);
		
		studentStream.sorted(Comparator.comparing(Student7::getBan)
				.thenComparing(Comparator.naturalOrder()))
		        .forEach(System.out::println);
	}
}

class Student7 implements Comparable<Student7> {
	String name;
	int ban;
	int totalScore;
	Student7(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
	
	String getName()    { return name; }
	int getBan()        { return ban;  }
	int getTotalScore() { return totalScore; }
	
	public int compareTo1(Student7 s) {
		return s.totalScore - this.totalScore;
	}

	@Override
	public int compareTo(Student7 o) {
		// TODO Auto-generated method stub
		return 0;
	}
}