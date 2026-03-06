package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;

public class I0814 {
  
  static class Point {
    int x,y;
    Point(int x,int y){this.x =x; this.y=y;}
  }
  static int[] combi;
  static int[][] arr;
  static int n, m, result = Integer.MAX_VALUE;
  static List<Point> hp, pp; 
  public static void main(String[] args) throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st= new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    
    combi = new int[m];
    arr = new int[n][n];
    hp = new ArrayList<>();
    pp = new ArrayList<>();
    
    for(int i = 0; i<n; i++){
      st= new StringTokenizer(br.readLine());
      for(int j = 0; j<n; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
        if(arr[i][j] == 1) hp.add(new Point(i,j));
        else if(arr[i][j] == 2) pp.add(new Point(i,j));
      }
    }
    
    DFS(0, 0);
    System.out.println(result);
  }
  
  static void DFS(int L, int s){
    if(L == m){
      result = Math.min(cal(), result);
      return;
    }
    
    for(int i = s; i<pp.size(); i++){
      combi[L] = i;
      DFS(L+1, i+1);
    }
  }
  
  static int cal(){
    int sum = 0;
    for(int i = 0; i<hp.size(); i++){
      Point h = hp.get(i);
      int tmp = Integer.MAX_VALUE;
      for(int j = 0; j<combi.length; j++){
        Point p = pp.get(combi[j]);
        int r = Math.abs(h.x-p.x) + Math.abs(h.y-p.y);
        tmp = Math.min(tmp, r);
      }
      
      sum += tmp;
    }
    
    return sum;
  }
}