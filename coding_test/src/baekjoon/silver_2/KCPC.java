package kr.ac.kopo.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KCPC {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int id = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[n][k+2];
			
			int cnt = 0;
			for (int j = 0; j < m; j++) {
				cnt++;
				st = new StringTokenizer(br.readLine(), " ");
				int team = Integer.parseInt(st.nextToken());
				int quest = Integer.parseInt(st.nextToken());
				int score = Integer.parseInt(st.nextToken());
				arr[team-1][quest-1] = Math.max(score, arr[team-1][quest-1]);
				arr[team-1][k]++;
				arr[team-1][k+1] = cnt;
			}
			
			int sum1 = 0;
			for (int j = 0; j < k; j++) {
				sum1 += arr[id-1][j];
			}
			
			int rnk = 1;
			for (int j = 0; j < n; j++) {
				if (j == id-1) continue;
				int sum2 = 0;
				for (int l = 0; l < k; l++) {
					sum2 += arr[j][l];
				}
				if (sum1 < sum2) {
					rnk++;
				}else if (sum1 == sum2) {
					if(arr[id-1][k] > arr[j][k]) {
						rnk++;
					} else if (arr[id-1][k] == arr[j][k]) {
						if (arr[id-1][k+1] > arr[j][k+1]) {
							rnk++;
						}
					}
				}
			}
			System.out.println(rnk);
		}
		
	}

}
