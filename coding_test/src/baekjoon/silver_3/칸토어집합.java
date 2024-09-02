package kr.ac.kopo.baekjoon.silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 칸토어집합 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String x;
		while ((x = br.readLine()) != null) {
			int tmp = Integer.parseInt(x);
			bw.write(maker(tmp) + "\n");
			bw.flush();

		}

	}

	private static String maker(int n) {

		if (n == 0) {
			return "-";
		}

		String tmp = maker(n - 1);
		StringBuilder sb = new StringBuilder();

		sb.append(tmp);
		for (int i = 0; i < tmp.length(); i++) {
			sb.append(" ");
		}
		sb.append(tmp);

		return sb.toString();

	}

}
