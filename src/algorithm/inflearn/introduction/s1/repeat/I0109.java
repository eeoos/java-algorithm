package algorithm.inflearn.introduction.s1.repeat;

import java.io.*;

public class I0109 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    char[] arr = br.readLine().toCharArray();
    
    for(char c : arr){
      if(Character.isDigit(c)) sb.append(c);
    }
    
    System.out.println(Integer.parseInt(sb.toString()));
  }
}