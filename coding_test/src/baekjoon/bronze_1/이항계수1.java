package kr.ac.kopo.baekjoon.bronze1;

import java.util.Scanner;


public class 이항계수1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(factorial(num1)/factorial(num2)/factorial(num1-num2));
		
		
	}
	
	static int factorial(int n) {
		
		int answer = 1;
		
		for (int i = 1 ; i <= n; i++) {
			answer *= i;
		}
		
		return answer;
	}
	

}
