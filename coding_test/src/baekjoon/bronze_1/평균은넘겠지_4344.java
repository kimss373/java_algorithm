package baekjoon.bronze_1;

import java.util.Scanner;

public class 평균은넘겠지_4344 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		
		for (int i = 0 ; i < c ; i++) {
			
			double[] score = new double[scan.nextInt()];
			
			double sum = 0;
			
			for (int j = 0 ; j < score.length ; j++) {
				score[j] = scan.nextDouble();
				sum += score[j];
			}
			
			double ave = sum/score.length;
			double cnt = 0;
			
			for (int j = 0 ; j < score.length ; j++) {
				if (score[j] > ave) {
					cnt += 1;
				}
			}
			
			System.out.printf("%.3f%%\n", (cnt/score.length)*100);
			
			
		}
		
		scan.close();
		
	}

}
