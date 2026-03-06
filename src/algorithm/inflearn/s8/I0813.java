package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0813 {
  
  static class Point {
    int x, y;
    Point(int x, int y){this.x=x; this.y=y;}
  }
  static int[][] arr;
  static int result= 0;
  static int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
  static int[] dy = {0, -1, 0, 1, -1, 1, 1, -1};
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    arr = new int[n][n];
    
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<n; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
		if(arr[i][j] == 1){
          BFS(i, j);
        }
      }
    }
    System.out.println(result);
  }
  static void BFS(int x, int y){
    Deque<Point> dq = new ArrayDeque<>();
    arr[x][y] = 0;
    dq.offer(new Point(x, y));
    
    while(!dq.isEmpty()){
      Point cur = dq.poll();
      
      for(int i = 0; i<8; i++){
        int nx = cur.x + dx[i];
        int ny = cur.y + dy[i];
        
        if((0<= nx && nx< arr.length) && (0<=ny && ny < arr.length) && (arr[nx][ny] == 1)){
          arr[nx][ny] = 0;
          dq.offer(new Point(nx, ny));
        }
      }
    }
    result++;
  }
}
