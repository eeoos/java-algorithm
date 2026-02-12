package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;

class Point implements Comparable<Point> {
  public int x, y;
  Point(int x, int y){this.x = x; this.y = y;}
  
  @Override
  public int compareTo(Point o){
  	if(this.x == o.x) return this.y - o.y;
    else return this.x - o.x;
  }
}

public class I0607_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    Point[] arr = new Point[T];
    StringTokenizer st;
    for(int i =0; i<T; i++){
      st = new StringTokenizer(br.readLine());
      arr[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    }
    
    Arrays.sort(arr);
    for(int i = 0; i<T; i++){
      if(i>0) sb.append("\n");
      sb.append(arr[i].x).append(" ").append(arr[i].y);
    }
    
    System.out.println(sb);
  }
}
