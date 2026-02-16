package algorithm.inflearn.s7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0704 {
  public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    
    for(int i=1; i<=n; i++){
      if(i>1) sb.append(" ");
      sb.append(fibo(i));
	}
    
    System.out.println(sb);
  }
  
  static int fibo(int n){
  	
    if(n == 1) return 1;
    else if( n==2) return 1;
    return fibo(n-2) + fibo(n-1);
    
  }
}