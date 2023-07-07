package baekjoon.bronze_1;

import java.util.Scanner;

public class 달팽이는올라가고싶다_2869 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int up = scan.nextInt();
		int down = scan.nextInt();
		int object = scan.nextInt();
		
		scan.close();
		
		int now = 0;
		
		int day = 0;
		
		object -= up;
		
		if (object % (up-down)==0) {
			day = object/(up-down)+1;
		} else {
			
			day = object/(up-down)+2;
		}
		System.out.println(day);
		
		
	}

}
