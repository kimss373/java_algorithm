package kr.ac.kopo.baekjoon.bronze2;

import java.util.Scanner;

public class 알파벳찾기 {

	public static void main(String[] args) {
		
		int[] arr = new int[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			if (arr[input.charAt(i)-97] == -1) {
				arr[input.charAt(i)-97] = i;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
