package baekjoon.silver_5;

import java.util.ArrayList;
import java.util.Scanner;

public class 그룹단어체커_1316 {

	public static void main(String[] args) {
		
		int answer = 0;
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			
			boolean isGroup = true;
			ArrayList<Character> alpha = new ArrayList<Character>();
			String word = scan.next();
			Character now = word.charAt(0);
			alpha.add(now);
			
			for (int j = 1 ; j < word.length(); j++) {
				
				Character tmp = word.charAt(j);
				if (now.equals(tmp)) {
					continue;
				}
				
				if (alpha.contains(tmp)) {
					isGroup = false;
					break;
				}
				
				now = tmp;
				alpha.add(tmp);
				
			}
			
			if (isGroup) answer++;
			
		}
		
		System.out.println(answer);
		
		
		
	}

}
