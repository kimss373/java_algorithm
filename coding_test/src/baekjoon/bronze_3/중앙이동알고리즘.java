package kr.ac.kopo.baekjoon.bronze3;

import java.util.Scanner;

public class 중앙이동알고리즘 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int start = 1;
		
		for (int i = 1; i <= n; i++) {
			start *= 2;
		}
		System.out.println((start + 1) * (start + 1));
		
	}

}
