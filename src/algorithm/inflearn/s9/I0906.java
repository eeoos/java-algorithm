package algorithm.inflearn.s9;

import java.util.*;
import java.io.*;
  
public class I0906 {
  static int[] unif;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    unif = new int[n+1];
    
    for(int i = 1; i<=n; i++){
      unif[i] = i;
    }
    for(int i = 0; i<m; i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      Union(a, b);
    }
    st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int fa = Find(a);
    int fb = Find(b);
    System.out.println((fa==fb) ? "YES" : "NO");

  }
  
  static void Union(int a, int b){
    int fa = Find(a);
    int fb = Find(b);
    if(fa  != fb) unif[fa] = fb;
  }
  
  static int Find(int v){
    if(v == unif[v]) return v;
    return unif[v] = Find(unif[v]);
  }
}
