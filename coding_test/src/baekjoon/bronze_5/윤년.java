package kr.ac.kopo.baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		
		int answer = 0;  
		
		if (year % 4 == 0) {
			
			answer = 1;
			
			if (year % 100 == 0 && year % 400 != 0) {
				answer = 0;
			}
		}
		
		System.out.println(answer);
	}
	
}
