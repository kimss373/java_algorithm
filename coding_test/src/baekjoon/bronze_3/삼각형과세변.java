package kr.ac.kopo.baekjoon.bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class 삼각형과세변 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		while (true) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if (a == 0 && b == 0 && c == 0) break;
			
			int[] tmpArr = {a, b, c};
			Arrays.sort(tmpArr);
			
			if (tmpArr[2] >= tmpArr[1] + tmpArr[0]) {
				System.out.println("Invalid");
			}
			else if (tmpArr[2] == tmpArr[1] || tmpArr[1] == tmpArr[0]) {
				if (tmpArr[1] == tmpArr[0] && tmpArr[2] == tmpArr[1]) {
					System.out.println("Equilateral");
				} else {
					System.out.println("Isosceles");
				}
			} else {
				System.out.println("Scalene");
			}
			
		}
		
	}

}
