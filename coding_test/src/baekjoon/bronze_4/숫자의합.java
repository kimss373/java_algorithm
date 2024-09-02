package kr.ac.kopo.baekjoon.bronze4;

import java.util.Scanner;

public class 숫자의합 {

	public static void main(String[] args) {
		
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String number = sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			answer += (int)number.charAt(i) - '0';
		}
		
		System.out.println(answer);
		
	}

}
