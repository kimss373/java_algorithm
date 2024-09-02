package kr.ac.kopo.baekjoon.bronze5;

import java.util.Scanner;

public class 문자열 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < t; i++) {
			String s = sc.nextLine();
			System.out.println(s.charAt(0) + "" + s.charAt(s.length()-1));
		
		}
		
	}

}
