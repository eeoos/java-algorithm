package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0813_2 {
  static int n, result = 0;
  static int[][] arr;
  static int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
  static int[] dy = {0, -1, 0, 1, -1, 1, 1, -1};
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    arr = new int[n][n];
    StringTokenizer st;
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<n; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        if(arr[i][j] == 1){
          DFS(i, j);
          result ++;
        }
      }
    }
    
   	System.out.println(result);
  }
  
  static void DFS(int x, int y){
    arr[x][y] = 0;
    for(int i= 0; i<8; i++){
      int nx = x + dx[i];
      int ny = y + dy[i];
      
      if((0<= nx && nx< n) && (0<=ny && ny < n) && (arr[nx][ny] == 1)){
        arr[nx][ny] = 0;
        DFS(nx, ny);
      }
      
    }
    
  }
}
