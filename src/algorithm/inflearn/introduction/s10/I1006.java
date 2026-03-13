package algorithm.inflearn.introduction.s10;

import java.util.*;
import java.io.*;
  
public class I1006 {
  static class Test{
    int s, t;
    Test(int s, int t){
      this.s = s;
      this.t = t;
    }
  }
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    Test[] arr = new Test[n];
    int[] dp = new int[m+1];
    Arrays.fill(dp, 0);
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int t = Integer.parseInt(st.nextToken());
      arr[i] = new Test(s, t);
    }
    
    for(int i = 0; i<n; i++){
      for(int j = m; j>=arr[i].t; j--){
        dp[j] = Math.max(dp[j], arr[i].s + dp[j-arr[i].t]);
      }
    }
    
    System.out.println(dp[m]);
  }
}