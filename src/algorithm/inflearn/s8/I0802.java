package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0802 {
  static int c, n, max = 0, sum= 0;
  static int[] arr, ch;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    c = Integer.parseInt(st.nextToken());
    n = Integer.parseInt(st.nextToken());
    ch = new int[n+1];
    arr = new int[n+1];
    
    for(int i = 1; i<=n; i++) arr[i] = Integer.parseInt(br.readLine());
    
    DFS(1);

    System.out.println(max);
    
  }
  static void DFS(int v){
    if(v == arr.length){
      for(int i =1; i<=n; i++){
        if(ch[i] == 1) {
        	sum+=arr[i];
        	System.out.println(arr[i]);
        }
      }
      
      
      if(sum > max && sum <= c) max = sum;
      sum = 0;
      return;
    }
    
    ch[v] = 1;
    DFS(v+1);
    
    ch[v] = 0;
    DFS(v+1);
  }
}
