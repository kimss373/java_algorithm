package kr.ac.kopo.baekjoon.bronze1;

import java.util.ArrayList;
import java.util.Scanner;

public class 더하기사이클 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int tmp = (n%10)*10 + (n/10 + n%10)%10;
		int cnt = 1;
		while (true) {
			if (tmp == n) break;
			tmp = (tmp%10)*10 + (tmp/10 + tmp%10)%10;
			cnt++;
		}
		System.out.println(cnt);
	}

}
