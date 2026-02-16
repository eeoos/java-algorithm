package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0610_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr);
    int lt = 1;
    int rt = arr[n-1] - arr[0];
    
    binarySearch(arr,lt, rt, c);
  }
  
  static void binarySearch(int[] arr, int lt, int rt, int c){
    if(lt > rt) {
      System.out.println(lt-1);
      return;
    }
    
    int mid = (lt + rt) / 2;
	if(count(arr, mid) >= c) binarySearch(arr, mid+1, rt, c);
    else binarySearch(arr, lt, mid-1, c);
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