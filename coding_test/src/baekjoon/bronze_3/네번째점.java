package kr.ac.kopo.baekjoon.bronze3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 네번째점 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int i = 0; i < 3; i++) {
			int tmp1 = sc.nextInt();
			int tmp2 = sc.nextInt();
			if (list1.contains(tmp1)) {
				list1.remove(new Integer(tmp1));
			} else {
				list1.add(tmp1);
			}
			if (list2.contains(tmp2)) {
				list2.remove(new Integer(tmp2));
			}else {
				list2.add(tmp2);
			}
			
		}
		System.out.println(list1.get(0) + " " + list2.get(0));
		
		
	}
	
}
