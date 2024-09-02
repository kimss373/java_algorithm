package kr.ac.kopo.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String tmp = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			for (int j = 0; j < tmp.length(); j++) {
				if (tmp.charAt(j) == '(') {
					stack.add('(');
				} else {
					if (!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					} else{
						stack.add(')');
					}
				}
			}
			if (stack.size() == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		
	}

}
