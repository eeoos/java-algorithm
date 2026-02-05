package algorithm.inflearn.s4;

import java.util.*;
import java.io.*;
  
public class I0403 {
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    
    Map<Integer, Integer> m = new HashMap<>();
    st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      int e = Integer.parseInt(st.nextToken());
      arr[i] = e; 
      if(i<k) m.put(e, m.getOrDefault(e, 0)+1);
    }
    sb.append(m.size());
    
    int lt = 0;
    for(int rt = k; rt<n; rt++){
      m.put(arr[rt], m.getOrDefault(arr[rt], 0)+1);
      if(m.get(arr[lt]) > 1) m.put(arr[lt], m.get(arr[lt])-1);
      else m.remove(arr[lt]);
      sb.append(" ").append(m.size());
      lt++;
    }
    System.out.println(sb);
    
  }
}