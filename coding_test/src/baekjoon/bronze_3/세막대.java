package kr.ac.kopo.baekjoon.bronze3;

import java.util.Scanner;

public class 세막대 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = Integer.max(a, b);
		int min1 = Integer.min(a, b);
		int min2 = Integer.min(max, c);
		max = Integer.max(max, c);
		
		while (true) {
			if (max < min1 + min2) break;
			
			max--;
			
		}
		
		System.out.println(max + min1 + min2);
		 
		
		
	}

}
