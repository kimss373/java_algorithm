package kr.ac.kopo.baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 투표2033년밈투표 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Never gonna give you up");
		arr.add("Never gonna let you down");
		arr.add("Never gonna run around and desert you");
		arr.add("Never gonna make you cry");
		arr.add("Never gonna say goodbye");
		arr.add("Never gonna tell a lie and hurt you");
		arr.add("Never gonna stop");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String answer = "No";
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			if (!arr.contains(tmp)) {
				answer = "Yes";
				break;
			}
		}
		System.out.println(answer);
		
	}

}
