package kr.ac.kopo.baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 행렬덧셈 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int idx = 0;
			while (st.hasMoreTokens()) {
				arr1[i][idx] = Integer.parseInt(st.nextToken());
				idx++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int idx = 0;
			while (st.hasMoreTokens()) {
				arr2[i][idx] = Integer.parseInt(st.nextToken());
				idx++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print((arr1[i][j]+arr2[i][j])+ " ");
			}
			System.out.println();
		}
		
	}

}
