package algorithm.inflearn.s9;

import java.util.*;
import java.io.*;
  
public class I0903 {
  
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    
    int[] arr = new int[72 + 1];

    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      
      for(int j = s; j<e; j++) {
    	arr[j]++;
      }
    }
    
    int result = Arrays.stream(arr).max().getAsInt();  
    
    
    System.out.println(result);
  }
}