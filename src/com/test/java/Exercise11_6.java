package com.test.java;

import java.util.*;

public class Exercise11_6 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		int[][] board = new int[5][5];
		
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
		ArrayList<String> list = new ArrayList<String>(set);
		Collections.shuffle(list);
		
		Iterator<String> it = list.iterator();
		
		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}
}
