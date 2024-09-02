package kr.ac.kopo.baekjoon.bronze2;

import java.util.Scanner;

public class 나머지 {

	public static void main(String[] args) {
		
		int[] check = new int[42];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			int tmp = sc.nextInt();
			check[tmp%42] = 1;
		}
		
		int cnt = 0;
		
		for (int i = 0; i < 42; i++) {
			if (check[i] == 1) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
