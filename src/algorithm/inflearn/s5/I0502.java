package algorithm.inflearn.s5;

import java.util.*;
import java.io.*;
  
public class I0502 {
  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    char[] arr = br.readLine().trim().toCharArray();
    
    Deque<Character> dq = new ArrayDeque<>();
    for(char c : arr){
      if('(' == c){
        dq.push(c);  
      } else if(')' == c){
        if(dq.isEmpty()){
          continue;
        }
        dq.pop();
      }else{
        if(dq.isEmpty()){
          sb.append(c);
        }
      }
    }
    System.out.println(sb);
  }
}