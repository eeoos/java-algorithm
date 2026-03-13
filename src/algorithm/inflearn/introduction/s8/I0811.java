package algorithm.inflearn.introduction.s8;
import java.util.*;
import java.io.*;
  
public class I0811 {
  
  static class Point {
    int x, y;
    Point(int x, int y){this.x = x; this.y = y;}
  }
  
  static int[][] arr = new int[7][7];
//  static int[][] ch = new int[7][7];
  static int[] dx = {-1, 0, 1, 0};
  static int[] dy = {0, 1, 0, -1};
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    for(int i = 0; i<7; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<7; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    bfs(0,0);
  }
  static void bfs(int x, int y){
    Deque<Point> dq = new ArrayDeque<>();
    dq.offer(new Point(x, y));
    arr[x][y] = 1;
    int L = 0;
    while(!dq.isEmpty()){
      int len = dq.size();
      for(int i = 0; i<len; i++){
        Point cur = dq.poll();
        
        for(int j = 0; j<4; j++){
          int nx = cur.x + dx[j];
          int ny = cur.y + dy[j];
          
          if(nx == 6 && ny == 6) {
            System.out.println(L+1);
            return;
          }
          if((0 <= nx && nx < 7) && (0 <= ny && ny < 7) && arr[nx][ny] == 0){
            arr[nx][ny] = 1;
            dq.offer(new Point(nx, ny));
          }
        }
      }
      
      L++;
    }
    System.out.println(-1);
  }
}