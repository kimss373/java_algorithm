package baekjoon.gold_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ACMCraft_1005 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for (int i = 0 ; i < t ; i++) {

			ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
			
			int n = scan.nextInt();
			int k = scan.nextInt();
			
			int[] cost = new int[n+1];
			int[] edgeCount = new int[n+1];
			
			for (int j = 0 ; j < n+1 ; j++) {
				graph.add(new ArrayList<Integer>());
			}
			
			for (int j = 1 ; j < n+1 ; j++) {
				cost[j] = scan.nextInt();
			}
			
			for (int j = 0 ; j < k ; j++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				graph.get(x).add(y);
				edgeCount[y]++;
			}
			
			int[] result = new int[n+1];
			
			Queue<Integer> q = new LinkedList<Integer>();
			
			for (int j = 1 ; j < n+1 ; j++) {
				result[j] = cost[j];
				if (edgeCount[j] == 0) {
					q.offer(j);
				}
			}
			
			while (!q.isEmpty()) {
				
				int tmp = q.poll();
				
				ArrayList<Integer> tmpList = graph.get(tmp);
				
				for (int l = 0 ; l < tmpList.size() ; l++) {
					result[tmpList.get(l)] = Math.max(result[tmpList.get(l)], result[tmp] + cost[tmpList.get(l)]);
					edgeCount[tmpList.get(l)]--;
					
					if (edgeCount[tmpList.get(l)] == 0) {
						q.offer(tmpList.get(l));
					}
					
				}
				
			}
			System.out.println(result[scan.nextInt()]);
			
		}
		
		
	}

}
