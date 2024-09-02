package kr.ac.kopo.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 크로스컨트리 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {

			ArrayList<Integer> arr = new ArrayList<Integer>();
			Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {

				int tmp = Integer.parseInt(st.nextToken());
				arr.add(tmp);

				if (countMap.containsKey(tmp)) {
					countMap.put(tmp, countMap.get(tmp) + 1);
				} else {
					countMap.put(tmp, 1);
				}
			}

			ArrayList<Integer> delArr = new ArrayList<Integer>();
			for (int x : countMap.keySet()) {
				if (countMap.get(x) < 6) {
					delArr.add(x);
				}
			}
			arr.removeAll(delArr);

			Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
			for (int j = 0; j < arr.size(); j++) {
				if (!map.containsKey(arr.get(j))) {
					map.put(arr.get(j), new ArrayList<Integer>());
				}
				map.get(arr.get(j)).add(j + 1);
			}
			
			int team = 0;
			int min = 10000;
			int fifth = 0;
			
			for (int x : map.keySet()) {
				int sum = 0;
				for (int j = 0; j < 4; j++) {
					sum += map.get(x).get(j);
				}
				if (sum < min) {
					team = x;
					min = sum;
					fifth = map.get(x).get(4);
				} else if (sum == min) {
					if (fifth > map.get(x).get(4)) {
						team = x;
						fifth = map.get(x).get(4);
					}
				}
			}

			System.out.println(team);

		}

	}

}
