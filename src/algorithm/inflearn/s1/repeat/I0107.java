package algorithm.inflearn.s1.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0107 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String s = br.readLine();
    
	if(s.equalsIgnoreCase(sb.append(s).reverse().toString())){
      System.out.println("YES");
      return;
    }
    System.out.println("NO");
  }
}