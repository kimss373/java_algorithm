package kr.ac.kopo.baekjoon.bronze2;

import java.util.Scanner;

public class 단어순서뒤집기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String[] arr = sc.nextLine().split(" ");
			System.out.print("Case #" + (i+1) + ": ");
			for (int j = arr.length-1; j >= 0; j--) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		
	}

}
