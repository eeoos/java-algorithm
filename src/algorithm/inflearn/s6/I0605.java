package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0605 {
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    Set<Integer> set= new HashSet<>();
    for(int i = 0; i<T; i++){
      set.add(Integer.parseInt(st.nextToken()));
    }
    if(set.size() != T) System.out.println("D");
    else System.out.println("U");
  }
}
