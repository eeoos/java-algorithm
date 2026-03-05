package algorithm.inflearn.s8;

import java.util.*;
import java.io.*;
  
public class I0808 {
  static int n, f;
  static int[][] arr = new int[35][35];
  static int[] ch, p, w;
  static boolean flag = false;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    f = Integer.parseInt(st.nextToken());
    
    ch = new int[n+1];
    p = new int[n];
    w = new int[n];
    
    for(int i = 0; i<n; i++){
      w[i] = combi(n-1, i);
    }
    
    DFS(0,0);
  }
  
  static int combi(int n, int r){
    if(arr[n][r] > 0) return arr[n][r];
    if(n == r || r == 0) return 1;
    return arr[n][r] = combi(n-1, r-1) + combi(n-1, r);
  }
  
  static void DFS(int L, int sum){
    if(flag) return;
    if(L == n){
      if(sum == f){
        for(int i = 0; i<n; i++){
          if(i>0) System.out.print(" "+p[i]);
          else System.out.print(p[i]);
        }
        flag = true;
      }
      return;
    }
    
 	for(int i =1; i<=n; i++){
      if(ch[i] == 0){
        ch[i] = 1;
        p[L] = i;
        DFS(L+1, sum + (p[L] * w[L]));
        ch[i] = 0;
      }
    }   
  }
}