package algorithm.inflearn.s7;

import java.util.*;
import java.io.*;
  
public class I0708_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int s = Integer.parseInt(st.nextToken());
    int e = Integer.parseInt(st.nextToken());
    
    BFS(s, e);
  }
  
  static void BFS(int s, int e){
    boolean[] visited = new boolean[10001];
    Deque<Integer> dq = new ArrayDeque<>();
    
    visited[s] = true;
    dq.offer(s);
    int L = 0;
    while(!dq.isEmpty()){
      int len = dq.size();
      for(int i = 0; i<len; i++){
        int cur = dq.poll();
        
        if(cur == e){
          System.out.println(L);
          return;
        }
        int a= cur-1;
        int b = cur+1;
        int c = cur+5;
        if(!(a<1 || a>10000) && !visited[a]) {
          visited[a] = true;
          dq.offer(a);
        }
        if(!(b<1 || b>10000) && !visited[b]) {
          visited[b] = true;
          dq.offer(b);
        }
        if(!(c<1 || c>10000) && !visited[c]) {
          visited[c] = true;
          dq.offer(c);
        }
      }
      L++;
    }
  }
}