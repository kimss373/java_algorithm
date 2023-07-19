package baekjoon.gold_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열2 {

	static int N, ans, arr[];
	static ArrayList<Integer> lis;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine()); //수열의 크기
		arr = new int[N]; //수열
		lis = new ArrayList<>();
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//LIS의 길이 구하기

		//각 원소가 LIS에 들어갈 위치를 찾는다.

		lis.add(0);
		
		for (int i : arr) {
			
			if (i > lis.get(lis.size()-1)) {
				lis.add(i);
			}
			else {
				
				int start = 0;
				int end = lis.size()-1;
				int mid = 0;
				
				while (start<end) {
					mid = (start+end)/2;
					if (lis.get(mid) < i) start = mid+1;
					else end = mid;
				}
				
				lis.set(end, i);
				
			}
			
		}

	}

}
