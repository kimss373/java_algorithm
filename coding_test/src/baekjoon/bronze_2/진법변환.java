package kr.ac.kopo.baekjoon.bronze2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 진법변환 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		int answer = 0;
		
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		int now = 1;
		for (int i = n.length()-1; i > -1; i--) {
			
			char tmp = n.charAt(i);
			if (tmp >= '0' && tmp <= '9') {
				answer += (tmp-48)*now;
			} else {
				answer += (tmp-55)*now;
			}
			
			now *= b;
		}
		System.out.println(answer);
	}
}
