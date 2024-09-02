package kr.ac.kopo.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 올림픽 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][4];
		
		int gold = 0;
		int silver = 0;
		int bronze = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
			arr[i][3] = Integer.parseInt(st.nextToken());
			if (arr[i][0] == k) {
				gold = arr[i][1];
				silver = arr[i][2];
				bronze = arr[i][3];
			}
		}
		
		int rnk = 1;
		
		for (int i = 0; i < n; i++) {
			if (arr[i][1] > gold) {
				rnk++;
			} else if (arr[i][1] == gold) {
				if (arr[i][2] > silver) {
					rnk++;
				} else if (arr[i][2] == silver) {
					if (arr[i][3] > bronze) {
						rnk++;
					}
				}
			}
		}
		
		System.out.println(rnk);
		
	}

}
