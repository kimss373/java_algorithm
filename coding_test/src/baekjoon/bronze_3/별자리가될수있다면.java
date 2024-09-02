package kr.ac.kopo.baekjoon.bronze3;

import java.util.Scanner;

public class 별자리가될수있다면 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long answer = 1;
		for (int i = 0 ; i < 5 ; i++) {
			answer *= n-i;		}
		
		System.out.println(answer/120);
		
	}

}
