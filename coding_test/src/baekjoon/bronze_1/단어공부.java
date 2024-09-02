package kr.ac.kopo.baekjoon.bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class 단어공부 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int[] arr = new int[26];
		
		for (int i = 0; i < input.length(); i++) {
			char x = input.charAt(i);
			
			if (x >= 65 && x <= 90) {
				arr[x-65] += 1;
			}
			else {
				arr[x-97] += 1;
			}
			
		}
		
		int[] tmp = Arrays.copyOf(arr, 26);
		Arrays.sort(tmp);
		int max = tmp[25];
		
		String answer = "";
		int cnt = 0;
		for (int i = 0; i < 26; i++) {
			if (arr[i] == max) {
				cnt++;
				if (cnt == 2) {
					answer = "?";
					break;
				}
				answer += (char) (i + 65);
			}
		}
		
		System.out.println(answer);
	}

}
