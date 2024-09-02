package kr.ac.kopo.baekjoon.bronze1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 진법변환2 {

	public static void main(String[] args) {
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		
		for (int i = 0; i < 26; i++) {
			map.put(10+i, (char)(65+i));
		}
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		ArrayList<Character> answerList = new ArrayList<Character>();
		while (n >= b) {
			if (n % b >= 10) {
				answerList.add(map.get(n % b));
			} else {
				answerList.add((char)((n % b) + 48));
			}
			n /= b;
		}
		if (n >= 10) {
			answerList.add(map.get(n));
		} else {
			answerList.add((char)(n + 48));
		}
		String answer = "";
		for (int i = answerList.size()-1; i > -1; i--) {
			answer += answerList.get(i);
		}
		System.out.println(answer);
	}

}
