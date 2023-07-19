package baekjoon.gold_4;

import java.util.Scanner;

public class 부분합_1806 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int s = scan.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0 ; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		
		int total = 0;
		int start = 0;
		int end = 0;
		int min = Integer.MAX_VALUE;
		
		while (start<=n && end <= n) {
			
			
			if(total >= s && min > end - start) min = end - start;
            
            if(total < s) total += arr[end++];
            else total -= arr[start++];
			
			
			
		}
		
		if (min == Integer.MAX_VALUE) {
			System.out.println(0);
		} else {
			
			System.out.println(min);
		}
		
		
	}

}
