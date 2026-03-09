package algorithm.inflearn.s10;

import java.io.*;

public class I1001 {
  static int[] dy;
  public static void main(String[] args) throws IOException { 
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    dy = new int[n+1];
	dy[1] = 1;
    dy[2] = 2;
    for(int i = 3; i<=n; i++){
      dy[i] = dy[i-2] + dy[i-1];
    }
    
    System.out.println(dy[n]);
  }
}