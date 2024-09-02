package kr.ac.kopo.baekjoon.silver5;

import java.util.Scanner;

public class 소수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		int x = a%b;
		
		for (int i = 1; i < n; i++) {
			x *= 10;
			x %= b;
		}
		
		x *= 10;
		x /= b;
		
		System.out.println(x);
		
	}

}
