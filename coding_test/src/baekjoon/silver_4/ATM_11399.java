package baekjoon.silver_4;

import java.util.Arrays;
import java.util.Scanner;

public class ATM_11399 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[scan.nextInt()];
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = 0;
		int tmp = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			tmp += arr[i];
			sum += tmp;
		}
		
		System.out.println(sum);
		
	}

}
