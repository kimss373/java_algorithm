package kr.ac.kopo.baekjoon.bronze3;

import java.util.Scanner;

public class 곱셈 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int answer = 0;
		
		for (int i = 0 ; i < 3 ; i++) {
			int tmp = (b%10)*a;
			System.out.println(tmp);
			answer += tmp*Math.pow(10, i);
			b /= 10;
		}
		
		System.out.println(answer);
		
	}
	
}
