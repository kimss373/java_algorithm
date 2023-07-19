package baekjoon.silver_3;

import java.util.Scanner;

public class 게임_1072 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = getPercent(x, y);
		
		int ans = -1;
		int left = 0;
		int right = (int) 1e9;
		
		while (left <= right) {
			int mid = (left + right) /2 ;
			
			if (getPercent(x + mid, y + mid) != z) {
				ans = mid;
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		
		System.out.println(ans);
		
	}
	
	static int getPercent(int x, int y) {
		return (int) ((long) y * 100 / x);
	}

}
