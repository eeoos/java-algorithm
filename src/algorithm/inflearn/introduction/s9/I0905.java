package algorithm.inflearn.introduction.s9;

import java.util.*;
import java.io.*;
  
public class I0905 {
  static class Edge implements Comparable<Edge>{
    public int v, c;
    Edge(int v, int c){this.v=v; this.c=c;}
    
    @Override
    public int compareTo(Edge o){
      return this.c-o.c;
    }
  }
  static int[] dist;
  static int n,m;
  static List<List<Edge>> list;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    
 	dist= new int[n+1];
	list= new ArrayList<>();
    for(int i = 0; i<=n; i++){
      list.add(new ArrayList<>());
    }
    Arrays.fill(dist, Integer.MAX_VALUE);
    for(int i = 0; i<m; i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      list.get(a).add(new Edge(b, c));
    }
    
    dijk(1);
    
    for(int i = 2; i<=n; i++){
      if(dist[i] != Integer.MAX_VALUE) System.out.println(i + " : "+dist[i]);
      else System.out.println(i + " : "+"impossible");
    }
  }
  
  static void dijk(int v){
    dist[v] = 0;
    Queue<Edge> pq = new PriorityQueue<>();
    pq.offer(new Edge(v, 0));
    
    while(!pq.isEmpty()){
      Edge cur = pq.poll();
      if(cur.c>dist[cur.v]) continue;
      for(Edge adj : list.get(cur.v)){
        if(dist[adj.v] > cur.c + adj.c){
          dist[adj.v] = cur.c + adj.c;
          pq.offer(new Edge(adj.v, cur.c + adj.c));
        }
      }
    }
  }
}