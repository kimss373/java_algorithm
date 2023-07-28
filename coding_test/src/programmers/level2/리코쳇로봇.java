package programmers.level2;

import java.util.*;

public class 리코쳇로봇 {

	public int solution(String[] board) {
        int answer = 0;
        
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        int goalX = 0;
        int goalY = 0;
        
        int[][] visit = new int[board.length][board[0].length()];
        
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0 ; i < board.length ; i++) {
            for (int j = 0 ; j < board[i].length() ; j++) {
                
                if (board[i].charAt(j) == 'R') {
                    int[] tmpArr = new int[3];
                    tmpArr[0] = i;
                    tmpArr[1] = j;
                    tmpArr[2] = 1;
                    q.add(tmpArr);
                    visit[i][j] = 1;
                } else if (board[i].charAt(j) == 'G') {
                    goalX = i;
                    goalY = j;
                }
                
            }
        }
        
        while (!q.isEmpty()) {
            
            int[] tmp = q.poll();
           
            
            for (int i = 0 ; i < 4 ; i++) {
                 int x = tmp[0];
                int y = tmp[1];
                int depth = tmp[2];
            
                while (true) {
                    
                    x = x + dx[i];
                    y = y + dy[i];
                    
                    if (0 > x || x >= board.length || 0 > y || y >= board[0].length() || board[x].charAt(y) == 'D'){
                        if (visit[x-dx[i]][y-dy[i]] == 0) {
                            int[] tmpArr = new int[3];
                            tmpArr[0] = x-dx[i];
                            tmpArr[1] = y-dy[i];
                            tmpArr[2] = depth+1;
                            q.add(tmpArr);
                            visit[x-dx[i]][y-dy[i]] = depth+1;
                            
                        }
                        break;
                        
                    }
                }
                
            }
            
        }
        
        
        return visit[goalX][goalY]-1;
    }
	
}
