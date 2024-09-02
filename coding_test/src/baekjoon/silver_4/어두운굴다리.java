package kr.ac.kopo.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 어두운굴다리 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = Integer.parseInt(st.nextToken());
		int now = max;
		for (int i = 0; i < m-1; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if ((tmp - now) % 2 == 0) {
				if (max < (tmp-now)/2) {
					max = (tmp-now)/2;
				}
			} else {
				if (max < (tmp-now)/2 + 1) {
					max = (tmp-now)/2 + 1;
				}
			}
			now = tmp;
		}
		
		if (n-now > max) {
			max = n - now;
		}
		
		System.out.println(max);
	}

}
