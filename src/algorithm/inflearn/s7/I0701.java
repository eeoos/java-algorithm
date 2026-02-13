package algorithm.inflearn.s7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0701 {
  public static void main(String[] args) throws IOException { 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    
    recursion(T);
  }
  static void recursion(int T){
    if(T < 1) return;

	recursion(T-1);
    if(T==1) System.out.print(T);
	else System.out.print(" "+T);   
  }
}