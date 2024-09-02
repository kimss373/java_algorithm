package kr.ac.kopo.baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쿠키의신체측정 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char[][] arr = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		
		int heartX = 0;
		int heartY = 0;
		
		loop1 : for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == '*') {
					heartX = i+1;
					heartY = j;
					break loop1;
				}
			}
		}
		
		System.out.println((heartX+1) + " " + (heartY+1));
		
		int idx1 = heartX;
		int idx2 = heartY;
		int cnt = 0;
		while (true) {
			if (idx2-1 > -1 && arr[idx1][idx2-1] == '*') {
				idx2--;
				cnt++;
			}
			else {
				break;
			}
		}
		System.out.print(cnt + " ");
		
		idx1 = heartX;
		idx2 = heartY;
		cnt = 0;
		while (true) {
			if (idx2+1 < n && arr[idx1][idx2+1] == '*') {
				idx2++;
				cnt++;
			}
			else {
				break;
			}
		}
		System.out.print(cnt + " ");
		
		idx1 = heartX;
		idx2 = heartY;
		cnt = 0;
		while (true) {
			if (idx1+1 < n && arr[idx1+1][idx2] == '*') {
				idx1++;
				cnt++;
			}
			else {
				break;
			}
		}
		System.out.print(cnt + " ");

		int end1 = idx1;
		int end2 = idx2;
		idx1++;
		idx2--;
		cnt = 1;
		while (true) {
			if (idx1+1 < n && arr[idx1+1][idx2] == '*') {
				idx1++;
				cnt++;
			}
			else {
				break;
			}
		}
		System.out.print(cnt + " ");
		
		
		idx1 = end1;
		idx2 = end2;
		idx1++;
		idx2++;
		cnt = 1;
		while (true) {
			if (idx1+1 < n && arr[idx1+1][idx2] == '*') {
				idx1++;
				cnt++;
			}
			else {
				break;
			}
		}
		System.out.print(cnt + " ");
		
	}

}
