package baekjoon.bronze_1;

import java.util.Scanner;

public class 더하기사이클_1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int answer = n;
		int cnt = 0;
		
		while(true) {
			cnt++;
			int tmp = (n%10)*10 + (n/10 + n%10)%10;
			
			if (tmp == answer) {
				break;
			}
			n = tmp;
		}
		
		System.out.println(cnt);
		scan.close();
	}

}
