package algorithm.inflearn.introduction.s1.repeat;

import java.io.*;

public class I0102 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    char[] arr = br.readLine().toCharArray();
    
    for(char c : arr){
      if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
      else sb.append(Character.toUpperCase(c));
    }
    
    System.out.println(sb);
  }
}
