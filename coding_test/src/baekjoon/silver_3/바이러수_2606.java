package baekjoon.silver_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 바이러수_2606 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int com = scan.nextInt();
		int n = scan.nextInt();
		
		int[] check = new int[com+1];
		
		ArrayList<Integer>[] arr = new ArrayList[com+1];
		for (int i = 0 ; i < com+1 ; i++) {
			arr[i] = new ArrayList<Integer>();
		}

		for (int i = 0 ; i < n ; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			arr[x].add(y);
			arr[y].add(x);
			
		}
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		check[1] = 1;
		
		int cnt = 0;
		
		while (!q.isEmpty()) {
			
			int a = q.poll();
			
			for (int i = 0 ; i < arr[a].size() ; i++) {
				if (check[arr[a].get(i)] == 0) {
					q.offer(arr[a].get(i));
					check[arr[a].get(i)] = 1;
					cnt++;
				}
			}
			
		}
		
		
		
		System.out.println(cnt);
		
		
	}

}
