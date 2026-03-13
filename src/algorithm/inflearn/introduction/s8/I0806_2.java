package algorithm.inflearn.introduction.s8;

import java.util.*;
import java.io.*;
  
public class I0806_2 {
  static int n,m;
  static int[] arr, ch, pm;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    arr = new int[n];
    ch = new int[n];
    pm = new int[m];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
    
    DFS(0);
  }
  
  static void DFS(int L){
    if(L == m) {
      for(int i = 0; i<m; i++){
        if(i>0) System.out.print(" "+pm[i]);
        else System.out.print(pm[i]);
      }
      System.out.println();
      return;
    }
    
    for(int i = 0; i<n; i++){
      if(ch[i] == 0){
        ch[i] = 1;
        pm[L] = arr[i];
        DFS(L+1);
        ch[i] = 0;
      }
      
    }
  }
}