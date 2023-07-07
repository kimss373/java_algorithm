package baekjoon.bronze_1;

import java.util.Arrays;
import java.util.Scanner;

public class 단어공부_1157 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		scan.close();
		
		word = word.toLowerCase();
		
		int[] cnt = new int[26];
		
		for (int i = 0 ; i < word.length(); i++) {
			cnt[word.charAt(i)-'a']++;
		}
		
		int max = -1;
		char c = '?';
		
		for (int i = 0 ; i < cnt.length ; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				c = (char) (i+65);
			}
		}
		
		Arrays.sort(cnt);
		
		if (cnt[cnt.length-1] == cnt[cnt.length-2]) {
			System.out.println("?");
		} else {
			System.out.println(c);
		}
		
		
		
		
	}

}
