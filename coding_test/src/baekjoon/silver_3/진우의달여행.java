package kr.ac.kopo.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 진우의달여행 {

	static int[][] arr;
	static int n;
	static int m;
	static int min;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		min = 99999;
		
		for (int i = 0; i < m; i++) {
			toMoon(0, i, 1, arr[0][i]);
			toMoon(0, i, 2, arr[0][i]);
			toMoon(0, i, 3, arr[0][i]);
		}
		System.out.println(min);
	}

	private static void toMoon(int y, int x, int dir, int sum) {
		
		if (dir == 1) {
			if (y < n - 1) {
				toMoon(y + 1, x, 2, sum + arr[y+1][x]);
				if (x < m - 1) {
					toMoon(y + 1, x + 1, 3,sum+ arr[y+1][x+1]);
				}
			} else {
				min = Math.min(sum, min);
			}
		} else if (dir == 2) {
			if (y < n - 1) {
				if (x > 0) {
					toMoon(y + 1, x - 1, 1, sum + arr[y+1][x-1]);
				}
				if (x < m - 1) {
					toMoon(y + 1, x + 1, 3, sum + arr[y+1][x+1]);
				}
			} else {
				min = Math.min(sum, min);
			}
		} else if (dir == 3) {
			if (y < n - 1) {
				toMoon(y + 1, x, 2, sum + arr[y+1][x]);
				if (x > 0) {
					toMoon(y + 1, x - 1, 1, sum + arr[y+1][x-1]);
				}
			} else {
				min = Math.min(sum, min);
			}
		}

	}

}
