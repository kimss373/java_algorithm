package kr.ac.kopo.baekjoon.bronze2;

import java.util.Scanner;

public class 삼의배수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int answer = 0;
		
		if (n % 3 == 0) {
			for (int i = 1 ; i <= (n-6)/3; i++) {
				answer += i;
			}
		}
		System.out.println(answer);
	}

}
