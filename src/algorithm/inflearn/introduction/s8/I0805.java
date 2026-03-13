package algorithm.inflearn.introduction.s8;

import java.util.*;
import java.io.*;
  
public class I0805 {
  static int n,m, result=Integer.MAX_VALUE;
  static int[] arr;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(br.readLine());
    
    DFS(0, 0);
    System.out.println(result);
  }
  static void DFS(int L, int sum){
	if(sum > m || result <= L) return;    
    if(sum == m){
      result = Math.min(result, L);
      return;
    }
    
    for(int i = n-1; i>=0; i--){
      DFS(L+1, sum + arr[i]);
    }

  }
}