package kr.ac.kopo.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수이어쓰기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int idx = 0;
		
		int answer = 0;
		
		loop1: while(true) {
			answer++;
			String tmp = String.valueOf(answer);
			
			for (int i = 0; i < tmp.length(); i++) {
				
				if (tmp.charAt(i) == num.charAt(idx)) {
					idx++;
				}
				if (idx == num.length()) {
					break loop1;
				}
				
			}
			
		}
		
		System.out.println(answer);
		
	}

}
