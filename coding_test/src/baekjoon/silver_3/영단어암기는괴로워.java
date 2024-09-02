package kr.ac.kopo.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 영단어암기는괴로워 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<String, Integer>();		

		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			if (tmp.length() >= m) {
				if (map.containsKey(tmp)) {
					map.put(tmp, map.get(tmp) + 1);
				} else {
					map.put(tmp, 1);
				}
			}
		}
		
		String[][] arr = new String[map.size()][2];
		
		int idx = 0;
		for (String key : map.keySet()) {
			arr[idx][0] = key;
			arr[idx][1] = map.get(key) + "";
			idx++;
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			
			if (o1[1].equals(o2[1])) {
				if (o1[0].length() == o2[0].length()) {
					return o1[0].compareTo(o2[0]);
				}
				return o2[0].length() - o1[0].length();
			}
			
			return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
		});
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i][0] + "\n");
		}
		bw.flush();
		bw.close();
		
	}

}
