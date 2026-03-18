package algorithm.inflearn.introduction.s2.repeat;

import java.util.*;
import java.io.*;
  
public class I0210 {
  
  static int[] dx = {-1, 0, 1, 0};
  static int[] dy = {0, 1, 0, -1};
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;
    int[][] arr = new int[n+2][n+2];
    for(int i = 1; i<=n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 1; j<=n; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    } 
    
    I0210 T = new I0210();
    System.out.println(T.solution(n, arr));
  }
  
  public int solution(int n, int[][] arr){
    
    int answer = 0;
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=n; j++){
        int cur = arr[i][j];
        boolean flag = true;
        for(int k = 0; k<4; k++){
          int nxt = arr[i+dx[k]][j+dy[k]];
          if(cur <= nxt)	{
            flag = false;
            break;
          }
        }
        if(flag) answer++;
      }
    }
    
    return answer;
  }
}
