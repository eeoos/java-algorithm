package algorithm.inflearn.introduction.s9;

import java.util.*;
import java.io.*;
  
public class I0901 {
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
    
    Arrays.sort(arr, (p1, p2) -> {
               if(p1.h == p2.h) return p1.w-p2.w;
                return p1.h - p2.h;
    });
  	int fail = 0;  
    for(int i =0; i<n; i++){
      Player a= arr[i];
      for(int j = i+1; j<n; j++){
        Player b = arr[j];
        if(a.h < b.h && a.w < b.w) {
        	fail++;
        	break;
        }
      }
    }
    
    System.out.println(arr.length - fail);
  }
}