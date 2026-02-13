package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0609_2 {
  
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    
    int sum = 0;
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
      sum += arr[i];
    }
   	int result = 0; 
    int lt = Arrays.stream(arr).max().getAsInt();
    int rt = sum;
   
    
    while(lt <= rt){
      int mid = (lt + rt) / 2;
      if(count(arr, mid) <= m){
    	result = mid;
        rt = mid-1;
      }else lt = mid+1;
    }
    
    System.out.println(result);
  }
  
  static int count(int[] arr, int capacity){
    int cnt = 1, sum = 0;
    for(int x : arr){
      if(sum + x > capacity){
        cnt++;
        sum = x;
      }else sum+=x;
    }
    
    return cnt;
  }
}