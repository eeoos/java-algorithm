package algorithm.inflearn.s4;

import java.util.*;
import java.io.*;
  
public class I0402_2 {
  public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    char[] a = br.readLine().trim().toCharArray();
    char[] b = br.readLine().trim().toCharArray();
    
    Map<Character, Integer> m = new HashMap<>();
   	for(char c : a){
      m.put(c, m.getOrDefault(c, 0)+1);
    }
    
    for(char c : b){
    
      if(m.get(c) == null || m.get(c) == 0){
        System.out.println("NO");
        return;
      }
      m.put(c, m.get(c)-1);	
    }
    
    System.out.println("YES");
  }
}