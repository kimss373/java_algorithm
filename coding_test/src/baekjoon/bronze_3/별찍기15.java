package kr.ac.kopo.baekjoon.bronze3;

import java.util.Scanner;

public class 별찍기15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			
			for (int j = 0 ; j < n - i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for (int j = 0 ; j < 2 * i - 3; j++) {
				System.out.print(" ");
			}
			if (i > 1) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
