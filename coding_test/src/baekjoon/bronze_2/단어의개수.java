package kr.ac.kopo.baekjoon.bronze2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		ArrayList<String> list = new ArrayList<String>();
		while(st.hasMoreElements()) {
			list.add(st.nextToken());
		}
		System.out.println(list.size());
		
	}

}
