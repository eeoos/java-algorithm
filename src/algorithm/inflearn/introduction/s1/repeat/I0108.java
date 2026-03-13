package algorithm.inflearn.introduction.s1.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0108 {
  public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    for(char c : br.readLine().toCharArray()){
      if(Character.isAlphabetic(c)){
        sb.append(c);
      }  
    }
    
    if(sb.toString().equalsIgnoreCase(sb.reverse().toString())){
      System.out.println("YES");
      return;
    }
    System.out.println("NO");
  }
}