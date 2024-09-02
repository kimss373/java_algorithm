package kr.ac.kopo.baekjoon.bronze2;

import java.util.Scanner;

public class 다이얼 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String inputStr = sc.nextLine();

		int answer = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			switch (inputStr.charAt(i)) {
			case 'A': case 'B': case 'C':
				answer += 3;
				break;
			case 'D': case 'E': case 'F':
				answer += 4;
				break;
			case 'G': case 'H': case 'I':
				answer += 5;
				break;
			case 'J': case 'K': case 'L':
				answer += 6;
				break;
			case 'M': case 'N': case 'O':
				answer += 7;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				answer += 8;
				break;
			case 'T': case 'U': case 'V':
				answer += 9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				answer += 10;
				break;

			}
		}
		System.out.println(answer);

	}

}
