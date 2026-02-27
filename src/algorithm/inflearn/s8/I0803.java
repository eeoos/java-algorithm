package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0803 {
  
  static class Point{
    int score, time;
    Point(int score, int time){this.score = score; this.time = time;}
  }
  static int[] ch;
  static int n,m, max = 0;
  static Point tmp;
  static Point[] arr;
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    ch = new int[n+1];
    arr = new Point[n+1];
    tmp = new Point(0, 0);
    
    for(int i = 1; i<=n; i++){
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int t = Integer.parseInt(st.nextToken());
      arr[i] = new Point(s, t);
    }
    
    DFS(1);
    System.out.println(max);
  }
  
  static void DFS(int v){
    if(v == n+1){
      for(int i = 1; i<=n; i++){
        if(ch[i]==1) {
          tmp.score += arr[i].score;
          tmp.time += arr[i].time;
        }
      }
      
      if(tmp.time <= m){
        if(tmp.score > max) max = tmp.score;
      }
      
      tmp.score = tmp.time =0;
      return;
    }
    
    ch[v] = 1;
    DFS(v+1);
    
    ch[v] = 0;
    DFS(v+1);
  }
}