package baekjoon.silver_5;

public class 셀프넘버_4673 {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for (int i = 1 ; i < 10001 ; i++) {
			int x = p(i);
			
			if (x < 10001) {
				check[x] = true; 
			}
			
		}
		
		for (int i = 1 ; i < 10001 ; i++) {
			if (!check[i]) {
				System.out.println(i);
			}
		}
		
		
	}
	
	private static int p(int number) {
	
		int answer = number;
		
		while (number != 0) {
			answer = answer + (number%10);
			number /= 10;
		}
		
		return answer;
	}

}
