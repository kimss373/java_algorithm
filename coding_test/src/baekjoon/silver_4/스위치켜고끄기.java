package kr.ac.kopo.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스위치켜고끄기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int gender = Integer.parseInt(st.nextToken());
			if (gender == 1) {
				int num = Integer.parseInt(st.nextToken());
				int total = num-1;
				while (total < n) {
					if (arr[total] == 0) arr[total] = 1;
					else arr[total] = 0;
					total += num; 
				}
			} else {
				int start = Integer.parseInt(st.nextToken());
				int idx1 = start-1;
				int idx2 = start-1;
				while (true) {
					if (idx1 < 0 || idx2 >= n) {
						idx1++;
						idx2--;
						break;
					}
					if (arr[idx1] != arr[idx2]) {
						idx1++;
						idx2--;
						break;
					}
					idx1--;
					idx2++;
				}
				for (int j = idx1; j <= idx2; j++) {
					if (arr[j] == 0) arr[j] = 1;
					else arr[j] = 0;
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print(arr[i-1] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}
		
	}

}
