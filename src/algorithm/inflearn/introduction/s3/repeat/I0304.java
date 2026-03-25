package algorithm.inflearn.introduction.s3.repeat;

import java.util.*;
import java.io.*;
  
public class I0304 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    I0304 T = new I0304();
    System.out.println(T.solution(n, m, arr));
  }
  
  public int solution(int n, int m, int[] arr){
    int cnt = 0, lt = 0, sum = 0;
    for(int rt = 0; rt<n; rt++){
      sum += arr[rt];
      if(sum == m) cnt++;
      while(sum >= m){
        sum -= arr[lt++];
        if(sum == m) cnt++;
      }
    }
    
    return cnt;
  }
}