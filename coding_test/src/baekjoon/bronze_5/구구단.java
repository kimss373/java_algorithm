package kr.ac.kopo.baekjoon.bronze5;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		
	}

}
