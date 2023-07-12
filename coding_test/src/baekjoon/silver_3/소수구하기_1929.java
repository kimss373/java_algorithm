package baekjoon.silver_3;

import java.util.Scanner;

public class 소수구하기_1929 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		scan.close();
		
		StringBuilder sb = new StringBuilder();
		
		if (m <= 2) {
			sb.append(2).append("\n");
		}
		
		for (int i = m ; i < n + 1 ; i++) {
			if (i == 1) continue;
			boolean check = true;
			
			for (int j = 2 ; j < Math.sqrt(i)+1 ; j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				
				sb.append(i).append("\n");
			}
			
		}
		
		System.out.println(sb);
		
	}

}
