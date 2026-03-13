package algorithm.inflearn.introduction.s8;

import java.util.*;
import java.io.*;
  
public class I0807 {
  
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());
    
   
    
    int result = DFS(n, r, 0);
    System.out.println(result);
  }
  
  static int DFS(int n, int r, int sum){
    if(r == 0 || r == n) return sum += 1;
    return sum = DFS(n-1, r-1, sum) + DFS(n-1, r, sum);
  }
}
