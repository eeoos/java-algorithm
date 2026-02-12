package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0606 {
  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    
    StringTokenizer st = new StringTokenizer(br.readLine());
	int[] arr = new int[T];
    for(int i = 0; i<T; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    int[] arr2 = Arrays.copyOf(arr, T);
    Arrays.sort(arr);
    int tmp =0;
    for(int i = 0; i<T; i++){
      if(arr[i] != arr2[i]){
        if(tmp>0) sb.append(" ");
        sb.append(i+1);
        tmp++;
      }
    }
    
    System.out.println(sb);
  }
}