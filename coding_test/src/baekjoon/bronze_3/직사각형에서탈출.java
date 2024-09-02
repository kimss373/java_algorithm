package kr.ac.kopo.baekjoon.bronze3;

import java.util.Scanner;

public class 직사각형에서탈출 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int min = x;
		min = w-x < min ? w-x : min;
		min = y < min ? y : min;
		min = h-y < min ? h-y : min;
		
		System.out.println(min);
	}

}
