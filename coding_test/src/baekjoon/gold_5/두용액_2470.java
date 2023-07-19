package baekjoon.gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 두용액_2470 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int start = 0;
		int end = n-1;
		
		int min = Integer.MAX_VALUE;
		int ans1 = 0;
		int ans2 = 0;
		
		int temp;
		int sum;
		
		while (start<end) {
			sum = arr[start] + arr[end];
			temp = Math.abs(sum);
			
			if (temp < min) {
				min = temp;
				ans1 = arr[start];
				ans2 = arr[end];
			}
			
			if (sum < 0) {
				start++;
			}
			else {
				end--;
			}
			
		}
		System.out.println(ans1 + " " + ans2);
		
	}

}
