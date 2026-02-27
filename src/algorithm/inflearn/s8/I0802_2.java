package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0802_2 {
  static int cap, result= 0;
  static int[] arr;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    cap = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    arr = new int[m];
    for(int i = 0; i<m; i++){
      arr[i]= Integer.parseInt(br.readLine());
    }
    
    DFS(0, 0);
    
    System.out.println(result);
  }
  
  static void DFS(int L, int sum){
    if(sum > cap) return;
    if(sum == cap) {
      result = sum;
      return;
    }
    
    if(L == arr.length){
      if(cap >= sum && sum > result){
        result = sum;
      }
      return;
    }
    
    DFS(L+1, sum + arr[L]);
    DFS(L+1, sum);
  }
}