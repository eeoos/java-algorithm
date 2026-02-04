package algorithm.inflearn.s5;

import java.util.*;
import java.io.*;

public class I0501 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arr = br.readLine().trim().toCharArray();
    
    Deque<Character> s = new ArrayDeque<>();
    
    
   	for(char c : arr){
      if('(' == c){
        s.push(c);
      } else if(')' == c){
        if(s.isEmpty()){
          System.out.println("NO");
          return;
        }
        s.pop();
      }
    }
    
    String result = "";
    result = s.isEmpty() ? "YES" : "NO";
    System.out.println(result);
    
  }
}