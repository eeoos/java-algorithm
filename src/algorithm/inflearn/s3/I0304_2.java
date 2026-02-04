package algorithm.inflearn.s3;

import java.util.*;
import java.io.*;
  
public class I0304_2 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    int[] arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    int lt =0, cnt=0, sum = 0;
    for(int rt = 0; rt<n; rt++){
      sum+=arr[rt];
      if(sum == m) cnt++;
      while(sum >= m){
        sum -= arr[lt++];
        if(sum == m) cnt++;
      }
    }
    System.out.println(cnt);
  }
}