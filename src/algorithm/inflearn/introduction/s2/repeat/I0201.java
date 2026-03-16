package algorithm.inflearn.introduction.s2.repeat;

import java.util.*;
import java.io.*;
  
public class I0201 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int pre = Integer.parseInt(st.nextToken());
    sb.append(pre);
    
    for(int i = 1; i < n; i++){
	  int cur = Integer.parseInt(st.nextToken());
      if(cur > pre) sb.append(" ").append(cur);
      pre = cur;
    }
    
    System.out.println(sb);
  }
}