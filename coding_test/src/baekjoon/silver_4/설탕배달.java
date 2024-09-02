package kr.ac.kopo.baekjoon.silver4;

import java.util.Scanner;

public class 설탕배달 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		while (n > 0) {
			if (n % 5 == 0) {
				cnt += n / 5;
				break;
			}
			if (n < 3) {
				cnt = -1;
				break;
			}
			n -= 3;
			cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
