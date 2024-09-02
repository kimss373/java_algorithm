package kr.ac.kopo.baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			StringBuilder sb = new StringBuilder();
			
			int re = Integer.parseInt(st.nextToken());
			String tmp = st.nextToken();
			for (int k = 0; k < tmp.length(); k++) {
				for (int j = 0; j < re; j++) {
					sb.append(tmp.charAt(k));
				}
				
			}
			System.out.println(sb.toString());
		}
		
		
		
	}

}
