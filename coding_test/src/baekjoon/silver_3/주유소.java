package kr.ac.kopo.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주유소 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] road = new long[n-1];
		long[] cost = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n-1; i++) {
			road[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			cost[i] = Long.parseLong(st.nextToken());
		}
		
		long minCost = cost[0];
		long sum = 0;
		
		for (int i = 0; i < n-1; i++) {
			
			if (cost[i] < minCost) {
				minCost = cost[i];
			}
		
			sum += minCost * road[i];
		}
		
		System.out.println(sum);
	}

}
