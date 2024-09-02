package kr.ac.kopo.baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 대지 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int tmp1 = Integer.parseInt(st.nextToken());
		int tmp2 = Integer.parseInt(st.nextToken());
		int minX = tmp1;
		int minY = tmp2;
		int maxX = tmp1;
		int maxY = tmp2;
		
		for (int i = 0; i < n-1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if (x < minX) {
				minX = x;
			}
			if (y < minY) {
				minY = y;
			}
			if (x > maxX) {
				maxX = x;
			}
			if (y > maxY) {
				maxY = y;
			}
			
		}
		System.out.println((maxX - minX) * (maxY - minY));
		
		
	}

}
