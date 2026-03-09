package algorithm.inflearn.s9;

import java.util.*;
import java.io.*;
  
public class I0907_2 {
  static class Edge implements Comparable<Edge>{
    int v,c;
    Edge(int v, int c){
      this.v=v;
      this.c=c;
    }
    
    @Override
    public int compareTo(Edge o){
      return this.c-o.c;
    }
  }
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int v = Integer.parseInt(st.nextToken());
    int e = Integer.parseInt(st.nextToken());
    
    int[] ch = new int[v+1];
    List<List<Edge>> graph = new ArrayList<>();
    for(int i=0; i<=v; i++) graph.add(new ArrayList<>());
    for(int i = 0; i<e; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
	  int c = Integer.parseInt(st.nextToken());
      graph.get(a).add(new Edge(b,c));
      graph.get(b).add(new Edge(a,c));
    }
    int result = 0;
    Queue<Edge> pq = new PriorityQueue<>();
    pq.offer(new Edge(1, 0));
    while(!pq.isEmpty()){
      Edge cur = pq.poll();
      if(ch[cur.v]==0){
        ch[cur.v] = 1;
        result += cur.c;
        for(Edge adj : graph.get(cur.v)){
          if(ch[adj.v] == 0) pq.offer(new Edge(adj.v, adj.c));
        }
      }
    }
    System.out.println(result);
  }
}