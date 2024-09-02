package kr.ac.kopo.baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 홀수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int answer = 0;
		int min = 100;
		
		
		for (int i = 1; i <= 7; i++) {
//			int tmp = Integer.parseInt(br.readLine());
			int tmp = Integer.parseInt(sc.nextLine());
			
			if (tmp % 2 == 1) {
				answer += tmp;
				if (min > tmp) {
					min = tmp;
				}
			}
		}
		
		if (answer == 0) {
			System.out.println(-1);
		} else {
			System.out.println(answer);
			System.out.println(min);
		}
		
	}

}
