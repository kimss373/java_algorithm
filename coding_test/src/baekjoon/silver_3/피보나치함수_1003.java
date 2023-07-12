package baekjoon.silver_3;

import java.util.Scanner;

public class 피보나치함수_1003 {
	
	static int[][] dp = new int[41][2];
	

	public static void main(String[] args) {
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		for (int i = 0 ; i < x ; i++) {
			int n = scan.nextInt();
			fibonacci(n);
			System.out.println(dp[n][0] + " " + dp[n][1]);
		}
		scan.close();
	}
	
	private static int[] fibonacci(int n) {
		if (n >= 2 && (dp[n][0] == 0 || dp[n][1] == 0)) {
			dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
			dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
		}
		return dp[n];
	}
	
}
