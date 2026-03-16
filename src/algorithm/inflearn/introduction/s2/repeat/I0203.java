package algorithm.inflearn.introduction.s2.repeat;

import java.util.*;
import java.io.*;
  
public class I0203 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    int[] b = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      a[i] = Integer.parseInt(st.nextToken());
    }
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      b[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 0; i<n; i++){
      int result = a[i] - b[i];
	  if(result == 0) sb.append("D").append("\n");
      else if(result == -1 || result == 2) sb.append("B").append("\n");
      else sb.append("A").append("\n");
      
    }
    System.out.println(sb);
  }
}