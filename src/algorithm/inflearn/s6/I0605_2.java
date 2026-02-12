package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0605_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    
    StringTokenizer st= new StringTokenizer(br.readLine());
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int i = 0; i<T; i++){
      int in = Integer.parseInt(st.nextToken());
      map.put(in, map.getOrDefault(in, 0) + 1);
    }
    
    for(Map.Entry<Integer, Integer> e : map.entrySet()){
      if(e.getValue() != 1){
        System.out.println("D");
        return;
      }
    }
    System.out.println("U");
    
  }
}
