package algorithm.inflearn.s10;

import java.util.*;
import java.io.*;
  
public class I1006_2 {
  
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    int[] dp = new int[m+1];
    Arrays.fill(dp, 0);
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int t = Integer.parseInt(st.nextToken());
      for(int j = m; j>=t; j--){
          dp[j] = Math.max(dp[j], s + dp[j-t]);
        }
    }
    
    
    System.out.println(dp[m]);
  }
}