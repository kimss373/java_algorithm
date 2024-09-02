package kr.ac.kopo.baekjoon.bronze1;

import java.util.Scanner;

public class 차량번호판1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String format = sc.nextLine();
		
		char before = '0';
		
		int answer = 1;
		
		for (int i = 0 ; i < format.length(); i++) {
			
			if (format.charAt(i) == 'c') {
				if (before == 'c') {
					answer *= 25;
				} else {
					answer *= 26;
				}
				before = 'c';
			} else {
				if (before == 'd') {
					answer *= 9;
				}else {
					answer *= 10;
				}
				before = 'd';
			}
			
		}
		
		System.out.println(answer);
		
	}

}
