package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0801_3 {
  static int n, total = 0;
  static boolean found = false;
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i =0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
      total += arr[i];
    }
	
    DFS(0, 0, arr);
    
    System.out.println(found ? "YES" : "NO");
  }
  static void DFS(int L, int sum, int[] arr){
    if(found || sum > total/2) return;
    
    if(L == n){
      if(total - sum == sum){
        found = true;
      }
      return;
    }
    
    DFS(L+1, sum+arr[L], arr);
    DFS(L+1, sum, arr);
    
  }
}