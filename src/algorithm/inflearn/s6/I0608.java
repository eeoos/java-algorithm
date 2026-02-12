package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0608 {

  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
    
    int T = Integer.parseInt(st.nextToken());
	int target = Integer.parseInt(st.nextToken());
    int[] arr = new int[T];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<T; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr);
    
    binarySearch(arr, 0, T-1, target);
  }
  
  static void binarySearch(int[] arr, int begin, int end, int target){
    if(begin > end) return;
    
    int m = (begin + end) /2;
    if(arr[m] == target){
      System.out.println(m+1);
      return;
    }
    
    if(arr[m] < target)
      binarySearch(arr, m+1, end, target);
    else 
      binarySearch(arr, begin, m-1, target);
      
  }
}
