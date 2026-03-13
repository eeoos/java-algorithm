package algorithm.inflearn.introduction.s1.repeat;

import java.io.*;

public class I0101_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] s = br.readLine().toUpperCase().toCharArray();
    
    int result = 0;
    char t = Character.toUpperCase(br.readLine().charAt(0));
    for(char c : s){
      if(Character.toUpperCase(c) == t) result++;
    }
    
    System.out.println(result);
  }
}
