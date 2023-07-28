package programmers.level2;

import java.util.*;

public class 귤고르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int k, int[] tangerine) {
        int answer =     0;    
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
    
        for (int i = 0 ; i < tangerine.length ; i++) {
            if (!map.containsKey(tangerine[i])) {
                map.put(tangerine[i], 1);
            } else {
                map.put(tangerine[i], map.get(tangerine[i])+1);
            }
        }
        
        for(Integer i :map.keySet()){
            list.add(map.get(i));
            }
        
        Collections.sort(list);
        
        for (int i = list.size()-1 ; i >=0 ; i--) {
            if (k <= 0) break;
            answer++;
            k -= list.get(i);
            
            
            
        }
        
        
        return answer;
    }

}
