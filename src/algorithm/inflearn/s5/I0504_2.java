package algorithm.inflearn.s5;

import java.util.*;
import java.io.*;
  
public class I0504_2 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    char[] arr = br.readLine().trim().toCharArray();
    
    Deque<Integer> dq = new ArrayDeque<>();
    for(char c : arr){
      if(Character.isDigit(c)){
        dq.push(c-'0');
      }else{
        int b = dq.pop();
        int a = dq.pop();        
        if(c == '+'){
         dq.push(a+b);		  
        }else if(c == '-'){
        	dq.push(a-b);
        }else if(c == '*'){
        	dq.push(a*b);
        }else{
        	dq.push(a/b);
        }
        
      }
    }
    System.out.println(dq.pop());
	
  }
}