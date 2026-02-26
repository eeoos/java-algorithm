package algorithm.inflearn.s7;

import java.util.*;
import java.io.*;
  
public class I0713 {
  
  static int n, m;
  static int[] ch;
  static List<List<Integer>> graph;
  static Map<Integer, Integer> map;
  
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    
    ch = new int[n+1];
    map = new HashMap<>();
    graph = new ArrayList<>();
    for(int i = 0; i<=n; i++) graph.add(new ArrayList<>());
    
    for(int i = 0; i<m; i++){
      st = new StringTokenizer(br.readLine());
      int r = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      graph.get(r).add(c);
    }
    ch[1] = 1;
    BFS(1);
    
    for(int i = 2; i<=n; i++){
      if(i>2) sb.append("\n");
      sb.append(i).append(" : ").append(map.get(i));
    }
    
    System.out.println(sb);
  }
  
  static void BFS(int v){
   
    Deque<Integer> dq = new ArrayDeque<>();
    dq.offer(1);
    int L = 0;
    while(!dq.isEmpty()){
      int len = dq.size();
      
      for(int i = 0; i<len; i++){
      	int cur = dq.poll();
        for(int j = 2; j<=n; j++){
          if(cur == j && ch[cur] == 0){
        	ch[cur] = L;
            map.put(j, L);
          }
        }
        for(int x : graph.get(cur)){
          if(ch[x] == 0){
            dq.offer(x);
          }
        }
        
      }
 	       
      L++;
    }
    
  }
}
