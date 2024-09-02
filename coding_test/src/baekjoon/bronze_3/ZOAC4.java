package kr.ac.kopo.baekjoon.bronze3;

import java.util.Scanner;

public class ZOAC4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt()-1;
		int column = sc.nextInt()-1;
		int step1 = sc.nextInt()+1;
		int step2 = sc.nextInt()+1;
		
		System.out.println((row/step1+1) * (column/step2+1));
		
	}

}
