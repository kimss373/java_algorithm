package baekjoon.silver_5;

import java.util.Arrays;
import java.util.Scanner;

public class 크로아티아알파벳_2941 {

	public static void main(String[] args) {
		
		String[] croatiaStrings = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		
		int idx = 0;
		int cnt = 0;
		
		while (true) {
			
			if (idx == word.length()) break;
			
			if (idx + 2 <= word.length()-1 && "dz=".equals(word.substring(idx, idx+3))) {
				idx+=3;
				cnt+=1;
			} else if (idx + 1 <= word.length()-1 && Arrays.asList(croatiaStrings).contains(word.substring(idx, idx+2))) {
				idx+=2;
				cnt+=1;
			} else {
				idx++;
				cnt++;}
			
			
		}
		System.out.println(cnt);
		
	}

}
