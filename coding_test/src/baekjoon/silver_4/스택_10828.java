package baekjoon.silver_4;

import java.util.Scanner;
import java.util.Stack;

public class 스택_10828 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		scan.nextLine();
		
		Stack<String> stack = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0 ; i < n ; i++) {
			String tmp = scan.nextLine();
			
			String[] order = tmp.split(" ");
			
			if (order[0].equals("push")) {
				stack.push(order[1]);
			} else if (order[0].equals("pop")) {
				if (stack.empty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.pop()).append("\n");
				}
			} else if (order[0].equals("size")) {
				sb.append(stack.size() ).append("\n");
			} else if (order[0].equals("empty")) {
				if (stack.empty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else {
				if (stack.empty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.peek()).append("\n");
				}
			}
			
		}
		scan.close();
		System.out.println(sb);
	}

}
