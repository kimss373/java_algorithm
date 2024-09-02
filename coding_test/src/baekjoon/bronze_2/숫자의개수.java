package kr.ac.kopo.baekjoon.bronze2;

import java.util.Scanner;

public class 숫자의개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String result = (a * b * c) + "";
		
		for (int i = 0; i < 10; i++) {
			int cnt = 0;
			for (int j = 0; j < result.length(); j++) {
				if (result.charAt(j) == (char)(i+48)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}

}
