package kr.ac.kopo.baekjoon.silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class 비밀번호발음하기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Character> arr = new ArrayList<Character>();
		arr.add('a');
		arr.add('e');
		arr.add('i');
		arr.add('o');
		arr.add('u');
		
		while (true) {
			String pw = br.readLine();
			if (pw.equals("end")) {
				break;
			}
			
			boolean hasMoum = false;
			int count = 0;
			char now = '0';
			boolean result = true;
			
			for (int i = 0; i < pw.length(); i++) {
				
				if (arr.contains(pw.charAt(i))) {
					hasMoum = true;
				}
				
				if (now == pw.charAt(i)) {
					if (now != 'e' && now != 'o') {
						result = false;
						break;
					}
				}
				
				if (arr.contains(pw.charAt(i)) && arr.contains(now)) {
					count++;
				} else if (!arr.contains(pw.charAt(i)) && !arr.contains(now)) {
					count++;
				} else {
					count = 1;
				}
				
				if (count == 3) {
					result = false;
					break;
				}
				now = pw.charAt(i);
				
			}
			
			if (result && hasMoum) {
				System.out.println("<" + pw + "> is acceptable.");
			} else {
				System.out.println("<" + pw + "> is not acceptable.");
				
			}
			
			
		}
		
		bw.flush();
		bw.close();
		
	}

}
