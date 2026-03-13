package algorithm.inflearn.introduction.s1.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0106_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String s = br.readLine();
    for(int i= 0; i<s.length(); i++){
      if(s.indexOf(s.charAt(i)) == i) sb.append(s.charAt(i));
    }
    
    System.out.println(sb);
         
  }
}