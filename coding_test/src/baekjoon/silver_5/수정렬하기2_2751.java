package baekjoon.silver_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 수정렬하기2_2751 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = scan.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			list.add(scan.nextInt()); 
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
		scan.close();
		
	}

}
