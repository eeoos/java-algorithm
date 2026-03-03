package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0805_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(br.readLine());
    
    BFS(n, arr, m);
  }
  
  static void BFS(int n, int[] arr, int m){
    Deque<Integer> dq = new ArrayDeque<>();
   	dq.offer(0);
    
    int L = 0;
    boolean[] visited = new boolean[m+1];
    visited[0] = true;
    
    while(!dq.isEmpty()){
      int len = dq.size();
      for(int i = 0; i<len; i++){
        int cur = dq.poll();
        
        for(int j = n-1; j>=0; j--){
          int next = cur + arr[j];
          
          if(next == m) {
            System.out.println(L+1);
            return;
          }
          if(next < m && !visited[next]){
            visited[next] = true;
            dq.offer(next);
          }
        }
      }
      L++;
    }
  }
}