package algorithm.inflearn.introduction.s2.repeat;

import java.util.*;
import java.io.*;
  
public class I0211 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][5];
    StringTokenizer st;
    for(int i =0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<5; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());  
      }
    }
    
    I0211 T = new I0211();
    System.out.println(T.solution(n, arr));
  }
  
  public int solution(int n, int[][] arr){
    int answer = 0, max = 0;
    for(int i = 0; i<n; i++){
      int cnt = 0;
      for(int j = 0; j<n; j++){
        for(int k = 0; k<5; k++){
          if(arr[i][k] == arr[j][k]){
            cnt++;
            break;
          }
        }
      }
      if(cnt > max){
        max = cnt;
        answer = i;
      }
    }
    return answer+1;
  }
}