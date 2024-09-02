package kr.ac.kopo.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 그룹단어체커 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = n;
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			Set<Character> set = new HashSet<Character>();
			char now = '0';
			for (int j = 0; j < tmp.length(); j++) {
				if (set.contains(tmp.charAt(j))) {
					if (now != tmp.charAt(j)) {
						cnt--;
						break;
					}
				} else {
					set.add(tmp.charAt(j));
					now = tmp.charAt(j);
				}
			}
			
		}
		
		System.out.println(cnt);
		
		
	}

}
