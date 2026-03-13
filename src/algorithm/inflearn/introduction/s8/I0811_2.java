package algorithm.inflearn.introduction.s8;

import java.util.*;
import java.io.*;
  
public class I0811_2 {
  static class Point {
    int x, y;
    Point(int x, int y){this.x = x; this.y=y;}
  }
  static int[] dx = {-1, 0, 1, 0};
  static int[] dy = {0, -1, 0, 1};
  private static final int N = 7;
  public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int[][] arr = new int[N][N];
    
    for(int i = 0; i<N; i++){
      st= new StringTokenizer(br.readLine());
      for(int j = 0; j<N; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    BFS(0, 0, arr);
  }
  
  static void BFS(int x, int y, int[][] arr){
    Deque<Point> dq = new ArrayDeque<>();
    dq.offer(new Point(x, y));
    arr[x][y] = 1;
    
    while(!dq.isEmpty()){
      Point cur = dq.poll();
      for(int i = 0; i<4; i++){
        int nx = cur.x + dx[i];
 	    int ny = cur.y + dy[i];
        if(nx == N-1 && ny == N-1){
          System.out.println(arr[cur.x][cur.y]);
          return;
        }
        if((0<=nx && nx < N) && (0<=ny && ny < N) && (arr[nx][ny] == 0)){
          arr[nx][ny] = arr[cur.x][cur.y] + 1;
          dq.offer(new Point(nx, ny));
        }
      }
    }
    
    System.out.println(-1);
  }
}