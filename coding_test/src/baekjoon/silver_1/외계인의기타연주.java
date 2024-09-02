package kr.ac.kopo.baekjoon.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class 외계인의기타연주 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		List<Stack<Integer>> list = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			list.add(new Stack<Integer>());
		}
		
		int line = 0;
		int pret = 0;
		int cnt = 0;
		for (int i = 0; i < n ; i++) {
			st = new StringTokenizer(br.readLine());
			line = Integer.parseInt(st.nextToken());
			pret = Integer.parseInt(st.nextToken());
			
			while (true) {
				if (list.get(line-1).size() == 0) {
					list.get(line-1).add(pret);
					cnt++;
					break;
				}
				
				if (list.get(line-1).peek() > pret) {
					list.get(line-1).pop();
					cnt++;
				} else if (list.get(line-1).peek() < pret) {
					list.get(line-1).add(pret);
					cnt++;
					break;
				} else {
					break;
				}
				
			}
		}
		System.out.println(cnt);
		
	}

}
