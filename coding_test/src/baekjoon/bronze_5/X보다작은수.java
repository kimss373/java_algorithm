package kr.ac.kopo.baekjoon.bronze5;

import java.util.Scanner;

public class X보다작은수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp < x) {
				System.out.print(tmp + " ");
			}
		}
		
	}

}
