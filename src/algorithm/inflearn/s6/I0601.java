package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0601 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
	StringBuilder sb = new StringBuilder();
    
    int[] arr = new int[T];
    StringTokenizer st= new StringTokenizer(br.readLine());
    for(int i = 0; i<T; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 0; i<T-1; i++){
      int min = i;
      for(int j = i+1; j<T; j++){
        if(arr[min] > arr[j]){
		  min = j;
        } 
      }
      int tmp = arr[i];
      arr[i] = arr[min];
      arr[min] = tmp;
      
      if(i>0) sb.append(" ");
      sb.append(arr[i]);
    }
    
    sb.append(" ").append(arr[T-1]);
    
    System.out.println(sb);
  }
}