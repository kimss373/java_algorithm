package kr.ac.kopo.baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 좌표압축 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr =  new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		int[] tmp = Arrays.copyOf(arr, n);
		Arrays.sort(tmp);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(tmp[i])) {
				map.put(tmp[i], cnt);
				cnt++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(map.get(arr[i]) + " ");
		}
		System.out.println(sb.toString());
	}

}
