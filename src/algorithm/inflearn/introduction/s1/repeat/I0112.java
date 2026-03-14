package algorithm.inflearn.introduction.s1.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0112 {
  private static final int N = 7;
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();
    
    while(n-- > 0){
      String tmp = s.substring(0, N).replace('#', '1').replace('*', '0');
      char c = (char)Integer.parseInt(tmp, 2);
      sb.append(c);
      s = s.substring(7);
    }
    
    System.out.println(sb);
  }
}