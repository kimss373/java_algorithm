package kr.ac.kopo.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class 최소힙 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		for (int i = 0; i < n; i++) {
			
			int order = Integer.parseInt(br.readLine());
			
			if (order == 0) {
				if (minHeap.isEmpty()) {
//					System.out.println(0);
					bw.write(0 + "\n");
				} else {
					bw.write(minHeap.poll() + "\n");
//					System.out.println(minHeap.poll());
				}
				bw.flush();
			} else {
				minHeap.add(order);
			}
			
		}
		
	}

}
