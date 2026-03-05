package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0810 {
  
  private static final int N = 7;
  static int[][] arr = new int[N][N];
  static int result = 0;
  static int[] dx = {-1, 0, 1, 0};
  static int[] dy = {0, -1, 0, 1};
  public static void main(String[] args) throws IOException {
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
    for(int i = 0; i<N; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<N; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    arr[0][0] = 1;
    DFS(0, 0);
    System.out.println(result);
  }
  
  static void DFS(int x, int y){
    if(x == N-1 && y == N-1) {
      result++;
      return;
    }
    
    for(int i = 0; i<4; i++){
      int nx = x + dx[i];
      int ny = y + dy[i];
      
      if((0<= nx && nx < N) && (0<= ny && ny <N) && arr[nx][ny] == 0){
        arr[nx][ny] = 1;
        DFS(nx, ny);
        arr[nx][ny]=0;
      }
    }
    
  }
}