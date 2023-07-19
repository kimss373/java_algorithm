package baekjoon.silver_4;

import java.util.Scanner;

public class 수들의합2_2003 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0 ; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		
		int start = 0;
		int end = 1;
		int answer = 0;
		
		while (end<=n) {
			
			
			int sum = 0;
			
			for (int i = start ; i < end ; i++ ) {
				sum += arr[i];
			}
			
			if (sum > m) {
				start++;
			}
			else if (sum < m) {
				end++;
			}
			else {
				answer++;
				start++;
			}
			
		}
	
		System.out.println(answer);
		
	}
	
}
