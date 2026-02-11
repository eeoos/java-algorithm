package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0602 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    
    int T = Integer.parseInt(br.readLine());
    int[] arr = new int[T];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i<T; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = T-1; i>=0; i--){
      for(int j = 0; j<i; j++){
		if(arr[j] > arr[j+1]){
          int tmp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = tmp;
        }
      }
    }
    
    for(int i = 0; i<T; i++){
      if(i>0) sb.append(" ");
      sb.append(arr[i]);
    }
    
    System.out.println(sb);
  }
}
