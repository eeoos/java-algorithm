package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0609 {
  
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
    
    int lt = Arrays.stream(arr).max().getAsInt();
    int rt = sum;
    
	int result = binarySearch(arr, lt, rt, m);
    System.out.println(result);
  }
  
  static int binarySearch(int[] arr, int lt, int rt, int m){
    if(lt > rt) return lt;
    
    int mid = (lt + rt) /2;
    if(count(arr, mid) <= m) return binarySearch(arr, lt, mid-1, m);
    else return binarySearch(arr, mid+1, rt, m);
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