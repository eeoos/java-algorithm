package algorithm.inflearn.introduction.s8;

import java.util.*;
import java.io.*;
  
public class I0809 {
  static int n,m;
  static int[] ch, pm;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    
    ch = new int[n+1];
    pm = new int[m];
    
    dfs(0);
  }
  static void dfs(int L){
    if(L == m) {
      for(int i = 0; i<m; i++){
    		if(i>0) System.out.print(" "+pm[i]);
            else System.out.print(pm[i]);
      }
      
      System.out.println();
      return;
    }
    
    for(int i = 1; i<=n; i++){
      if(L>0 && pm[L-1] > i) continue;
      if(ch[i] == 0){        
        ch[i] = 1;
        pm[L] = i;
        dfs(L+1);
        ch[i] = 0;
      }
    }
  }
  
  
}