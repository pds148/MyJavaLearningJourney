package com.test.java;

public class Exercise9_3 {
	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		
		while ((pos =src.indexOf(target, pos)) != -1) {
			count++;
			pos += target.length();
		}
		
/*		while(true) {
			pos = src.indexOf(target, pos);
			if(pos == -1) break;
			if(src.substring(pos, pos+target.length()).equals(target)) {
				pos += target.length();
				count++;
			}
		}*/
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
	}
}
