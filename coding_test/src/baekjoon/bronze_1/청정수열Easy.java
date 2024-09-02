package kr.ac.kopo.baekjoon.bronze1;

import java.util.Scanner;

public class 청정수열Easy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = 1;
		
		for (int i = 1; i <= n; i++) {
			answer *= i;
		}
		System.out.println(answer);
		
		
	}

}
