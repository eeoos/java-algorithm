package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0605_3 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    
    StringTokenizer st= new StringTokenizer(br.readLine());
    int[] arr = new int[T];
    for(int i = 0; i<T; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i =0; i<T-1; i++){
      if(arr[i] == arr[i+1]){
        System.out.println("D");
        return;
      }
    }
    System.out.println("U");
    
  }
}
