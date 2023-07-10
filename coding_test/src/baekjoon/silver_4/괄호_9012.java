package baekjoon.silver_4;

import java.util.Scanner;
import java.util.Stack;

public class 괄호_9012 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		scan.nextLine();
		
		for (int i = 0 ; i < n ; i++) {
			
			String tmp = scan.nextLine();
			Stack<Character> stack = new Stack<>();
			
			for (int j = 0 ; j < tmp.length() ; j++) {
				if (tmp.charAt(j)==')' && !stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else {
					stack.push(tmp.charAt(j));
				}
			}
			
			if (stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		scan.close();
		
	}

}
