package kr.ac.kopo.baekjoon.bronze3;

import java.util.Scanner;

public class 별찍기17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		for (int i = 1 ; i <= n-1 ; i++) {
			
			for (int j = 0 ; j < n - i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for (int j = 0 ; j < 2*i-3; j++) {
				System.out.print(" ");
			}
			if (i != 1) System.out.println("*");
			else System.out.println();
			
		}
		for (int i = 1 ; i <= 2*n-1; i++) {
			System.out.print("*");
		}
	} 
}
