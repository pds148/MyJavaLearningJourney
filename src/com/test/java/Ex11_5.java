package com.test.java;

import java.util.*;

public class Ex11_5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext() ) {
			String obj = it.next();
			System.out.println(obj.charAt(0));
		}
	}
}
