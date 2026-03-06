package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0809_2 {
  static int n,m;
  static int[] pm;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    
    pm = new int[m];
    
    dfs(0, 1);
  }
  static void dfs(int L, int s) {
	  if(L == m) {
	      for(int i = 0; i<m; i++){
	    		if(i>0) System.out.print(" "+pm[i]);
	            else System.out.print(pm[i]);
	      }
	      
	      System.out.println();
	      return;
	    }
	  
	  for(int i = s; i<=n; i++) {
		  pm[L] = i;
		  dfs(L+1, i+1);
	  }
  }
  
  
}