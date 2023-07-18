package baekjoon.gold_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 줄세우기_2252 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		
		int[] edgeCount = new int[n+1];
		
		for (int i = 0 ; i < n+1 ; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for (int i = 0 ; i < m ; i++) {
			int tmp1 = scan.nextInt();
			int tmp2 = scan.nextInt();
			
			graph.get(tmp1).add(tmp2);
			edgeCount[tmp2]++;
			
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1 ; i < n+1 ; i++) {
			if (edgeCount[i] == 0) {
				q.offer(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		while (!q.isEmpty()) {
			int tmp = q.poll();
			
			sb.append(tmp).append(" ");
			
			for (int i = 0 ; i < graph.get(tmp).size() ; i++) {
				int x = graph.get(tmp).get(i);
				edgeCount[x]--;
				if (edgeCount[x] == 0) {
					q.offer(x);
				}
			}
			
			
		}
		
		System.out.println(sb);
		
	}
	
}
