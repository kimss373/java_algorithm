package kr.ac.kopo.baekjoon.silver3;

import java.util.Scanner;

public class 소수구하기 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = m ; i <= n ; i++) {
			if (i == 1) {
				continue;
			}
			boolean bool = true;
			for(int j = 2 ; j <= Math.sqrt(i) ; j++) {
				if(i%j==0) {
					bool = false;
					break;
				}
			}
			if(bool) {
				System.out.println(i);
			}
		}
	}
}