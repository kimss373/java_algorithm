package kr.ac.kopo.baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int idx = 1;
		int max = Integer.parseInt(br.readLine());
		
		for (int i = 2; i <= 9; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if (tmp > max) {
				max = tmp;
				idx = i;
			}
			
		}
		System.out.println(max);
		System.out.println(idx);
		
	}

}
