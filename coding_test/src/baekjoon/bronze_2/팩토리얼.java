package kr.ac.kopo.baekjoon.bronze2;

import java.util.Scanner;

public class 팩토리얼 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0 ; i < t ; i++) {
			
			int n = sc.nextInt();
		
			long tmp = 1;
			
			for (int j = 1 ; j <= n ; j++) {
				tmp *= j;
				while (tmp % 10 == 0) {
					tmp /= 10;
				}
				tmp = tmp%100000000000000L;
			}
			System.out.println(tmp%10);
 		}
	}
	
	
}