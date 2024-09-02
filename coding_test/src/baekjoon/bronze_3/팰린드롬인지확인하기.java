package kr.ac.kopo.baekjoon.bronze3;

import java.util.Scanner;

public class 팰린드롬인지확인하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		int isPal = 1;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != word.charAt(word.length()-i-1)) {
				isPal = 0;
				break;
			}
		}
		System.out.println(isPal);
	}

}
