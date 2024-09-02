package kr.ac.kopo.baekjoon.bronze5;

import java.util.Scanner;

public class 팩토리얼2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long answer = 1;
		
		for (int i = 1; i <= n; i++) {
			answer *= i;
		}
		
		System.out.println(answer);
	}

}
