package baekjoon.gold_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 게임개발_1516 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] result = new int[n+1];
		int[] cost = new int[n+1];
		int[] edgeCount = new int[n+1];
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0 ; i < n+1 ; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for (int i = 1 ; i < n+1 ; i++) {
			int costTmp = scan.nextInt();
			cost[i] = costTmp;
			result[i] = costTmp;
			
			while (true) {
				int command = scan.nextInt();
				
				if (command == -1) break;
				
				graph.get(command).add(i);
				edgeCount[i]++;
				
			}
			
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1 ; i < n+1 ; i++) {
			if (edgeCount[i] == 0) {
				q.offer(i);
			}
		}
		
		while (!q.isEmpty()) {
			
			int tmp = q.poll();
			
			ArrayList<Integer> tmpList = graph.get(tmp);
			
			for (int i = 0 ; i < tmpList.size() ; i++) {
				result[tmpList.get(i)] = Math.max(result[tmpList.get(i)], result[tmp] + cost[tmpList.get(i)]);
				edgeCount[tmpList.get(i)]--;
				
				if (edgeCount[tmpList.get(i)] == 0) {
					q.offer(tmpList.get(i));
				}
			}
			
		}
		
		for (int i = 1 ; i < n+1; i++) {
			
			System.out.println(result[i]);
		}
		
		
	}

}
