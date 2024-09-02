package kr.ac.kopo.baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 오븐시계 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String tmp = br.readLine();
		
		StringTokenizer st = new StringTokenizer(tmp);
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int cook = Integer.parseInt(br.readLine());
		
		hour += cook/60;
		minute += cook%60;
		
		if (minute >= 60) {
			hour += 1;
			minute -= 60;
		}
		while (hour >= 24) {
			hour -= 24;
		}
		System.out.println(hour + " " + minute);
		
	}

}
