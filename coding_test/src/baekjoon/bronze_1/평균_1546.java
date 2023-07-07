package baekjoon.bronze_1;

import java.util.Arrays;
import java.util.Scanner;

public class 평균_1546 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] score = new double[scan.nextInt()];
		
		for (int i = 0 ; i < score.length ; i++) {
			score[i]= scan.nextDouble(); 
		}
		
		scan.close();
		
		Arrays.sort(score);
		
		double sum = 0;
		
		for (int i = 0 ; i < score.length ; i++) {
			sum += (score[i]/score[score.length-1])*100;
		}
		System.out.println(sum/score.length);
		
	}

}
