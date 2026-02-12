package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0607 {
  static class Point {
    int x, y;
    Point(int x, int y){this.x =x; this.y= y;}
  }
  
  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
    StringBuilder sb= new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    
    Point[] arr= new Point[T];
    for(int i = 0; i<T; i++){
      st = new StringTokenizer(br.readLine());
      arr[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    }
    
    Arrays.sort(arr, (e1, e2) -> {
      if(e1.x == e2.x) return e1.y - e2.y;
      else return e1.x - e2.x;
    });
    
    for(int i =0; i<T; i++){
      if(i>0) sb.append("\n");
      sb.append(arr[i].x).append(" ").append(arr[i].y);
    }
    
    System.out.println(sb);
  }
}