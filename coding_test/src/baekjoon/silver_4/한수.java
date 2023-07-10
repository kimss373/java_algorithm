package baekjoon.silver_4;

import java.util.Scanner;

public class 한수 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		scan.close();
		
		int cnt = 0;
		
		if (n < 100) {
			System.out.println(n);
		} else {
			for (int i = 100 ; i < n + 1 ; i++) {
				if (i/100 - (i/10)%10 == (i/10)%10 - i%10) {
					cnt++;
				}
			}
			System.out.println(99+cnt);
		}
		
	}

}
