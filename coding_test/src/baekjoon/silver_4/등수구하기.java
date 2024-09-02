package kr.ac.kopo.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 등수구하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int ts = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());

		Integer[] arr = new Integer[n];
		if (n > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());

		if (n == p && ts <= arr[arr.length - 1])
			System.out.print(-1);
		else {
			int rank = 1;
			for (int i = 0; i < arr.length; i++) {
				if (ts < arr[i])
					rank++;
				else
					break;
			}
			System.out.print(rank);
		}

	}

}
