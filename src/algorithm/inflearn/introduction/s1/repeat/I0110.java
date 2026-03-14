package algorithm.inflearn.introduction.s1.repeat;

import java.io.*;
import java.util.*;

public class I0110 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
	char[] arr = st.nextToken().toCharArray();
	char t = st.nextToken().charAt(0);
    
    List<Integer> list = new ArrayList<>();
    List<Integer> dist = new ArrayList<>();
    for(int i = 0; i<arr.length; i++){
      if(arr[i] == t) list.add(i);
    }
    
    for(int i = 0; i<arr.length; i++){
      int min = Integer.MAX_VALUE;
	  if(arr[i] == t) dist.add(0);
      else { 
        for(int x : list){
          min = Math.min(Math.abs(i-x), min);
        }
        dist.add(min);
      }
      
    }
    
    for(int i = 0; i<dist.size(); i++){
      if(i > 0) sb.append(" ").append(dist.get(i));
      else sb.append(dist.get(i));
    }
    
    System.out.println(sb);
  }
}