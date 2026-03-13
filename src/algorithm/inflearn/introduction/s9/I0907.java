package algorithm.inflearn.introduction.s9;

import java.util.*;
import java.io.*;
  
public class I0907 {
  static int[] unif;
  static class Edge implements Comparable<Edge>{
    int s, d, c;
    Edge(int s, int d, int c){
      this.s= s;
      this.d=d;
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
    unif = new int[v+1];
    Queue<Edge> pq = new PriorityQueue<>();
    
    for(int i = 1; i<=v; i++) unif[i] = i;
    for(int i = 0; i<e; i++){
	  st = new StringTokenizer(br.readLine());       
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      pq.offer(new Edge(a,b,c));
    }
 	
    int sum = 0;
    for(int i = 0; i<e; i++){
      Edge cur = pq.poll();
      int fa = find(cur.s);
      int fb = find(cur.d);
      if(fa!=fb) {
        sum += cur.c;
        union(cur.s, cur.d);
      }
    }
    
    System.out.println(sum);
  }
  
  static void union(int a, int b){
    int fa = find(a);
    int fb = find(b);
    if(fa != fb) unif[fa] = fb;
  }
  
  static int find(int v){
    if(unif[v] == v) return v;
    return unif[v] = find(unif[v]);
  }
}