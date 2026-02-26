package algorithm.inflearn.s7;

import java.util.*;
import java.io.*;
  
public class I0713_2 {
  
  static int n, m;
  static int[] ch, dist;
  static List<List<Integer>> graph;
  
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    
    ch = dist = new int[n+1];

    graph = new ArrayList<>();
    for(int i = 0; i<=n; i++) graph.add(new ArrayList<>());
    
    for(int i = 0; i<m; i++){
      st = new StringTokenizer(br.readLine());
      int r = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      graph.get(r).add(c);
    }
    
    BFS(1);
    
    for(int i = 2; i<=n; i++){
      if(i>2) sb.append("\n");
      sb.append(i).append(" : ").append(dist[i]);
    }
    
    System.out.println(sb);
  }
  
  static void BFS(int v) {
	  Deque<Integer> dq = new ArrayDeque<>();
	  ch[v] = 1;
	  dist[v] = 0;
	  
	  dq.offer(v);
	  while(!dq.isEmpty()) {
		  int cur = dq.poll();
		  for(int nv : graph.get(cur)) {
			  if(ch[nv] == 0) {
				  ch[nv] = 1;
				  dq.offer(nv);
				  dist[nv] = dist[cur] + 1;
				  
				  
			  }
		  }
	  }
  }
}
