package algorithm.inflearn.introduction.s2.repeat;

import java.util.*;
import java.io.*;
  
public class I0209 {
  public static void main(String[] args) throws IOException { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];
    StringTokenizer st;
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j<n; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    I0209 T = new I0209();
    System.out.println(T.solution(n, arr));
  }
  
  public int solution(int n, int[][] arr){
    int a = 0;
    int b= 0;
    int answer = 0;
    for(int i = 0; i<n; i++){
      int rs = 0;
      int cs = 0;
      for(int j = 0; j<n; j++){
        if(i == j) a+= arr[i][j];
       	if(i + j == n - 1) b+=arr[i][j];
        rs += arr[i][j];
        cs += arr[j][i];
      }
      answer = Math.max(answer, Math.max(rs, cs));
    }
    answer = Math.max(answer, Math.max(a, b));
    return answer;
  }
}