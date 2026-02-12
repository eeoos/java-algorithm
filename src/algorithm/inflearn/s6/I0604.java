package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0604 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int T = Integer.parseInt(st.nextToken());
	int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[T];
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      int in = Integer.parseInt(st.nextToken());
      int pos = -1;
      for(int j = 0; j<T; j++)
        if(arr[j] == in) pos = j;
      
      int k = (pos == -1) ? T-1 : pos;
      while(k > 0){
        arr[k] = arr[k-1];
        k--;
      }
      arr[k] = in;
    }
	
    for(int i = 0; i<T; i++){
      if(i>0) sb.append(" ");
      sb.append(arr[i]);
	}
    
    System.out.println(sb);
  }
}