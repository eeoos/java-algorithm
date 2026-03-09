package algorithm.inflearn.s10;

import java.util.*;
import java.io.*;
  
public class I1004 {
  static class Brick implements Comparable<Brick>{
    int e, h, w;
    Brick(int e, int h, int w){
      this.e = e;
      this.h = h;
      this.w = w;
    }
    
    @Override
    public int compareTo(Brick o) {
    	return o.e - this.e;
    }
  }
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Brick[] arr = new Brick[n];
    int[] dy = new int[n];
    
    StringTokenizer st;
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      arr[i]= new Brick(a,b,c);
    }
    
    Arrays.sort(arr);
    
    dy[0] = arr[0].h;
    int result = dy[0];
    for(int i = 1; i<n; i++){
      int max = 0;
      for(int j = i-1; j>=0; j--){
        if((arr[j].w > arr[i].w) && (dy[j] > max)) max = dy[j];
      }
      dy[i] = max + arr[i].h;
      result = Math.max(dy[i], result);
    }
    
    System.out.println(result);
  }
}