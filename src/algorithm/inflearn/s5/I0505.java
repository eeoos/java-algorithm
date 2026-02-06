package algorithm.inflearn.s5;

import java.util.*;
import java.io.*;
  
public class I0505 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arr = br.readLine().toCharArray();
    int cnt= 0;
    Deque<Character> dq = new ArrayDeque<>();
    
   	for(int i = 0; i<arr.length; i++){
      if(arr[i] == '(') dq.push('(');
      else {
        dq.pop();
        if(arr[i-1] == '(') cnt+= dq.size(); // 레이저
        else cnt++; //막대 끝
      }
    }
    
    System.out.println(cnt);
  }
}