package algorithm.inflearn.s5;

import java.util.*;
import java.io.*;
  
public class I0504 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    char[] arr = br.readLine().trim().toCharArray();
    
    Deque<Character> dq = new ArrayDeque<>();
    for(char c : arr){
      if(Character.isDigit(c)){
        dq.push(c);
      }else{
        int b = dq.pop() - '0';
        int a = dq.pop() - '0';        
		int tmp = 0;
        if(c == '+'){
         tmp = a+b;		  
        }else if(c == '-'){
          tmp = a-b;
        }else if(c == '*'){
          tmp = a*b;
        }else{
          tmp += a/b;
        }
        
        dq.push((char)(tmp+'0'));
      }
    }
    System.out.println((int)(dq.pop()-'0'));
	
  }
}