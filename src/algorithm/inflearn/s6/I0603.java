package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0603 {
  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int T = Integer.parseInt(br.readLine());
    int[] arr= new int[T];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i<T; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i =1; i<T; i++){
      int tmp = arr[i];
      int j = i;
      while((j>0) && (arr[j-1] > tmp)){
        arr[j] = arr[j-1];
        j--;
      }
      arr[j] = tmp;
    }
    
    for(int i = 0; i<T; i++){
      if(i>0) sb.append(" ");
      sb.append(arr[i]);
    }
    
    System.out.println(sb);
  }
}