package algorithm.inflearn.s1.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0103 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String ss = br.readLine();
    
    String result = "";
    for(String s : ss.split(" ")){
      if(result.length() < s.length()) result = s;
    }
    
    System.out.println(result);
  }
}