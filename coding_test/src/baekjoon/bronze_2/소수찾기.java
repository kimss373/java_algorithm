package kr.ac.kopo.baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if (tmp == 1) continue;
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(tmp); j++) {
				if (tmp % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}

}
