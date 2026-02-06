package algorithm.inflearn.s5;

import java.util.*;
import java.io.*;
  
public class I0507_2 {
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	char[] tmp = br.readLine().toCharArray();
    Deque<Character> dq = new ArrayDeque<>();
    for(char c: tmp) dq.offer(c);
    
    char[] arr = br.readLine().toCharArray();
    
    for(char c : arr){
      if(dq.contains(c)){
        if(c != dq.poll()){
        System.out.println("NO");
        return;
        }
      }	
    }
      
    
    if(!dq.isEmpty()){
      System.out.println("NO");
      return;
    }
    System.out.println("YES");
  }
}