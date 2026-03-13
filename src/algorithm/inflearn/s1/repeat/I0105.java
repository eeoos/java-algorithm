package algorithm.inflearn.s1.repeat;

import java.io.*;
import java.util.*;

public class I0105 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arr = br.readLine().toCharArray();
    Deque<Character> dq = new ArrayDeque<>();
    for(char c : arr){
      if(Character.isAlphabetic(c)){
		dq.push(c);
      }
    }
    
    for(int i = 0; i<arr.length; i++){
      char c = arr[i];
      if(Character.isAlphabetic(c)){
        arr[i] = dq.pop();
      }
    }
    
    System.out.println(String.valueOf(arr));
  }
}