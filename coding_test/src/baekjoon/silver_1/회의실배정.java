package kr.ac.kopo.baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 회의실배정 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
		}

		Arrays.sort(arr, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0]-o2[0];
			}
			return o1[1] - o2[1];
		});
		
		int cnt = 0;
		int last = 0;
		
		for (int i = 0; i < n; i++) {
			if (last <= arr[i][0]) {
				last = arr[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
