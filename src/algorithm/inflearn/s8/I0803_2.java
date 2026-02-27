package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0803_2 {
  static class Point{
    int score, time;
    Point(int score, int time){this.score = score; this.time = time;}
  }
  
  static int n, m, max = 0;
  static Point[] arr;
  public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    arr = new Point[n];
    for(int i = 0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int t = Integer.parseInt(st.nextToken());
      arr[i] = new Point(s, t);
    }
    
    DFS(0, 0, 0);
    
    System.out.println(max);
  }
  
  static void DFS(int L, int sums, int sumt){
    if(sumt>m) return;
    if(L == n){
      if(sums > max) {
        max = sums;
      }
      return;
    }
    
    DFS(L+1, sums + arr[L].score, sumt + arr[L].time);
    DFS(L+1, sums, sumt);
        
  }
}