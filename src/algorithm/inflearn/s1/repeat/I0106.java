package algorithm.inflearn.s1.repeat;

import java.util.*;
import java.io.*;
  
public class I0106 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
    char[] arr = br.readLine().toCharArray();
    Set<Character> set = new LinkedHashSet<>();
    
    for(char c : arr){
      set.add(c);
    }
    
    for(char c : set) {
     sb.append(c);
    }
    
    System.out.println(sb);
  }
}