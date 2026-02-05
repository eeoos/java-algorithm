package algorithm.inflearn.s4;

import java.util.*;
import java.io.*;

  
public class I0401_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    
    char[] arr = br.readLine().toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    
    for(char c : arr){
      int value = map.getOrDefault(c, 0);
      value++;
      map.put(c, value);
    }
    
    int max = Integer.MIN_VALUE;
    char result = '0';
    for(Map.Entry<Character, Integer> e : map.entrySet()){
      int v= e.getValue();
      if(max < v) {
        max = v;
        result = e.getKey();
      }
    }
    
    System.out.println(result);
  }
}
