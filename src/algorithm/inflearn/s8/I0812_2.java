package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0812_2 {
  static class Point {
    int x, y;
    Point(int x, int y){this.x = x; this.y =y;} 
  }
  static int[] dx = {-1, 0, 1, 0};
  static int[] dy = {0, -1, 0, 1};
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int[][] arr = new int[n][m];
    Deque<Point> dq = new ArrayDeque<>();
    int zs = 0;
    
    for(int i = 0; i<n; i++){
      st= new StringTokenizer(br.readLine());
      for(int j = 0; j<m; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
        if(arr[i][j] == 0) zs++;
        else if(arr[i][j] == 1){
          dq.offer(new Point(i, j));
        }
      }
    }
    
    if(zs == 0) {
      System.out.println(0);
      return;
    }
    
	BFS(arr, dq);
  }
  static void BFS(int[][] arr, Deque<Point> dq){
    while(!dq.isEmpty()){
      Point cur = dq.poll();
      
      for(int i = 0; i<4; i++){
        int nx = cur.x + dx[i];
        int ny = cur.y + dy[i];
        
        if((0<=nx && nx < arr.length) && (0<= ny && ny< arr[0].length) && (arr[nx][ny] == 0)){
          arr[nx][ny] = arr[cur.x][cur.y] + 1;
          dq.offer(new Point(nx, ny));
        }
      }
    }
    
    int max = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        if(arr[i][j] == 0){
          System.out.println(-1);
          return;
        }
        max = Math.max(max, arr[i][j]);
      }
    }
    
    System.out.println(max -1);
  
  }
}