package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0610 {
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
   	
    int[] arr= new int[n];
    st= new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr);
    int lt = 1;
    int rt = arr[n-1] - arr[0];
    int result = 0;
    
    while(lt <= rt){
      int mid = (lt + rt) /2;
      if(count(arr, mid) >= c){
        result = mid;
        lt = mid + 1;
      }else rt = mid -1;
    }
    
    System.out.println(result);
    
  }
  
  static int count(int[] arr, int interval){
    int cnt=1, tmp = arr[0];
    for(int i = 1; i<arr.length; i++){
      if(arr[i] - tmp >= interval){
        cnt++;
        tmp = arr[i];
      }
    }
    
    return cnt;
  }
}