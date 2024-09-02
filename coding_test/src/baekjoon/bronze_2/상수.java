package kr.ac.kopo.baekjoon.bronze2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 상수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		String tmp1 = st.nextToken();
		String tmp2 = st.nextToken();
		
		String num1 = "";
		String num2 = "";
		
		for (int i = 2; i > -1; i--) {
			num1 += tmp1.charAt(i);
			num2 += tmp2.charAt(i);
		}
		
		if (Integer.parseInt(num1) > Integer.parseInt(num2)) {
			System.out.println(Integer.parseInt(num1));
		} else {
			System.out.println(Integer.parseInt(num2));
		}
		 
	}

}
