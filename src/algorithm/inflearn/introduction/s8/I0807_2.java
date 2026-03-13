package algorithm.inflearn.introduction.s8;

import java.util.*;
import java.io.*;
  
public class I0807_2 {
  private static int LEN = 35;
  static int[][] arr = new int[LEN][LEN];
  static int n, r;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    r = Integer.parseInt(st.nextToken());
    
    System.out.println(DFS(n, r));
  }
  static int DFS(int n, int r){
    if(n == r || r == 0) return 1;
    if(arr[n][r] > 0) return arr[n][r];
    
    return arr[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
  }
  
}