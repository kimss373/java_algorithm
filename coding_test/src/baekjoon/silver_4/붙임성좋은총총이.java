package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class ∫Ÿ¿”º∫¡¡¿∫√—√—¿Ã {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<String>();
		set.add("ChongChong");
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String tmp1 = st.nextToken();
			String tmp2 = st.nextToken();
			
			if (set.contains(tmp1)) {
				
				if (set.add(tmp2)) {
					cnt += 1;
				}
			} else if (set.contains(tmp2)) {
				if (set.add(tmp1)) {
					cnt += 1;
				}
			}
			
		}
		System.out.println(cnt);

	}

}
