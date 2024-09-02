package kr.ac.kopo.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		StringTokenizer t = new StringTokenizer("\n");
//		String test = t.nextToken(br.readLine());
//		System.out.println(test);
		sb.append(false).append(false).append(false).append(false).append(false).append(false)
		while(true) {
			String tmp = br.readLine();
			if (tmp.equals(".")) {
				break;
			}
			Stack<Integer> stack = new Stack<>();
						
			if (stack.empty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
		}
		
	}

}
