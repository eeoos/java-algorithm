package algorithm.inflearn.introduction.s10;

import java.util.*;
import java.io.*;
  
public class I1003 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    int[] dy = new int[n];
    dy[0] = 1;
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
    
    int result= 0;
    for(int i = 1; i<n; i++){
      int max=0;
      for(int j = i-1; j>=0; j--){
        if(arr[j]<arr[i] && dy[j] > max) max = dy[j];
      }
      dy[i] = max + 1;
      result = Math.max(dy[i], result);
    }
    
    System.out.println(result);
  }
}
