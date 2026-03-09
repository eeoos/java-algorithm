package algorithm.inflearn.s10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I1002 {
  static int[] dy;
  public static void main(String[] args) throws IOException { 
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    dy = new int[n+2];
	dy[1] = 1;
    dy[2] = 2;
    for(int i = 3; i<=n+1; i++){
      dy[i] = dy[i-2] + dy[i-1];
    }
    
    System.out.println(dy[n+1]);
  }
}
