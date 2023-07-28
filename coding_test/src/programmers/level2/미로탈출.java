package programmers.level2;
import java.util.*;
public class 미로탈출 {
	int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    int answer = 0;
    
    public int solution(String[] maps) {
        
        boolean[][] visit = new boolean[maps.length][maps[0].length()];
        boolean[][] visit2 = new boolean[maps.length][maps[0].length()];
        
        for (int i = 0 ; i < maps.length ; i++) {
            for (int j = 0 ; j < maps[i].length() ; j++) {
                
                if (maps[i].charAt(j) == 'S') {
                    
                    Integer[] tmpChar = bfs(maps, i, j, 'L', visit);
                    
                    if (tmpChar[0] == null) {
                        return -1;
                    } else {
                        Integer[] endChar = bfs(maps, tmpChar[0], tmpChar[1], 'E', visit2);
                        
                        if (endChar[0] == null) {
                            return -1;
                        } 
                    }
                    
                    
                }
                
            }
        }
        
        
        return answer;
    }
    
    private Integer[] bfs(String[] maps, int x, int y, char object, boolean[][] visit){
        
        Queue<int[]> q = new LinkedList<>();
        Integer[] result = new Integer[2];
        
        int[] tmp = {x, y, 0};
        
        q.add(tmp);
        visit[x][y] = true;
        
        while (!q.isEmpty()) {
            
            int[] tmpArr = q.poll();
            int a = tmpArr[0];
            int b = tmpArr[1];
            int depth = tmpArr[2];
            if (maps[a].charAt(b) == object) {
                answer += depth;
                result[0] = a;
                result[1] = b;
                return result;
            }
            
            for (int i = 0 ; i < 4 ; i++) {
                
                int nx = a + dx[i];
                int ny = b + dy[i];
                
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length() && maps[nx].charAt(ny) != 'X' && visit[nx][ny] == false) {
                    
                    int[] tmpArr1 = {nx, ny, depth+1};
                    q.add(tmpArr1);
                    visit[nx][ny] = true;
                    
                }
                
            }
            
        }
        
        return result;
        
    }
}
