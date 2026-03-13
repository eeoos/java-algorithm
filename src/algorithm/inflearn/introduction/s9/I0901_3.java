package algorithm.inflearn.introduction.s9;

import java.util.*;
import java.io.*;
  
public class I0901_3 {
  static class Player{
    int h, w;
    Player(int h, int w){this.h = h; this.w=w;}
  }
  
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    Player[] arr = new Player[n];
    
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      int h = Integer.parseInt(st.nextToken());
      int w = Integer.parseInt(st.nextToken());
      arr[i] = new Player(h,w);
    }
    
    Arrays.sort(arr, (p1, p2) -> {return p2.h-p1.h;});
  	int result=  0;
    int max = Integer.MIN_VALUE;
    for(Player p : arr) {
      if(p.w > max) {
    	  result++;
    	  max = p.w;
      }
    }
    System.out.println(result);
  }
}