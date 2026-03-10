package algorithm.inflearn.s10;

import java.util.*;
import java.io.*;
  
public class I1005 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
    int target = Integer.parseInt(br.readLine());
    
    int[] dp = new int[target+1];

    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    for(int i = 0; i<n; i++){
	  
      for(int j = arr[i]; j<=target; j++){
        if(dp[j] > dp[j - arr[i]] + 1) dp[j] = dp[j - arr[i]] + 1;
      }
    }
    
    System.out.println(dp[target]);
  }
}
