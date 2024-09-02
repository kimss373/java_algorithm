package kr.ac.kopo.baekjoon.bronze1;

import java.util.Scanner;

public class 세로읽기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[][] arr = new char[5][15];
		
		for (int i = 0; i < 5; i++) {
			String tmp = sc.nextLine();
			for (int j = 0; j < tmp.length(); j++) {
				arr[i][j] = tmp.charAt(j);
			}
			for (int j = tmp.length(); j < 15; j++) {
				arr[i][j] = '-';
			}
		}
		String answer = "";
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] != '-') {
					answer += arr[j][i];
				}
			}
		}
		System.out.println(answer);
	}

}
