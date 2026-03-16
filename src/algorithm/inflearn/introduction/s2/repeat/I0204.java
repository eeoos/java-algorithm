package algorithm.inflearn.introduction.s2.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I0204 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    
    int[] arr = new int[n];
    arr[0] = 1;
    arr[1] = 1;
    for(int i=2; i<n; i++){
      arr[i]= arr[i-2] + arr[i-1];
    }
    
	for(int i = 0; i<n; i++){
      if(i>0) sb.append(" ");
      sb.append(arr[i]);
    }	
    System.out.println(sb);
  }
}