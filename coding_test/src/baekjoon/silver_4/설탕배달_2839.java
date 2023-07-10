package baekjoon.silver_4;

import java.util.Scanner;

public class 설탕배달_2839 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		scan.close();
		
		int cnt = 0;
		
		while (true) {
			if (n %5 == 0) {
				cnt += n/5;
				System.out.println(cnt);
				break;
			} else {
				n -= 3;
				cnt++;
			}
			if (n < 0) {
				System.out.println(-1);
				break;
			}
		}
		
	}

}
