package algorithm.inflearn.s7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0702 {
  public static void main(String[] args) throws IOException { 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    
    recursion(T);
  }
  static void recursion(int T){
	  int q = (T/2);
    if(q==0) {
    	System.out.print(T%2);
    	return;
    }
    recursion(q);
    System.out.print(T%2);
  }
}