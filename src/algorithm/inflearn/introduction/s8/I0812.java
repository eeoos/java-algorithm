package algorithm.inflearn.introduction.s8;

import java.util.*;
import java.io.*;
  
public class I0812 {
  
  static class Point {
	int x, y;
    Point(int x, int y){this.x = x; this.y = y;}
  }
  static int[] dx = {-1, 0, 1, 0};
  static int[] dy = {0, -1, 0, 1};
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    Deque<Point> dq = new ArrayDeque<>();
    int[][] arr = new int[n][m];
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<m; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int zs = 0;
    for(int i =0; i<n; i++){
      for(int j = 0; j<m; j++){

        if(arr[i][j] ==0){
          zs++;
        }
        if(arr[i][j] ==1){
          dq.offer(new Point(i, j));
        }
      }
    }
    
    if(zs == 0){
      System.out.println(0);
      return;
    }

    DFS(arr, dq);
  }
  
  static void DFS(int[][] arr, Deque<Point> dq){

    
    while(!dq.isEmpty()){
      int len = dq.size();
      for(int i = 0; i<len; i++){
        Point cur = dq.poll();
        
        for(int j = 0; j<4; j++){
          int nx = cur.x + dx[j];
          int ny = cur.y + dy[j];
          
          if((0<= nx && nx<arr.length) && (0<=ny && ny < arr[0].length) && arr[nx][ny] == 0){
            arr[nx][ny] = arr[cur.x][cur.y] + 1;
            dq.offer(new Point(nx, ny));
          }
        }
      }

    }
    
    int max = 0;
    for(int i =0; i<arr.length; i++){
      for(int j = 0; j<arr[0].length; j++){
        if(arr[i][j] ==0){
          System.out.println(-1);
          return;
        }
        max = Math.max(max, arr[i][j]);
      }
    }
    

    
    System.out.println(max -1);
  }
}