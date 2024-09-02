package kr.ac.kopo.baekjoon.bronze2;

import java.util.Scanner;

/*
 * 		   1 
		6  7
		12 19
		18 37
		24 61
 * */
public class 벌집 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int now = 1;
		int idx = 1;
		
		while (true) {
			if (n <= now) break;
			
			now += idx*6;
			idx++;
		}
		System.out.println(idx);
		
	}

}
