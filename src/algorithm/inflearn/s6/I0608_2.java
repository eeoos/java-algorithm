package algorithm.inflearn.s6;

import java.util.*;
import java.io.*;
  
public class I0608_2 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int T= Integer.parseInt(st.nextToken());
    int target = Integer.parseInt(st.nextToken());
    int[] arr = new int[T];
    
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<T; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr);
    int lt = 0;
    int rt = T-1;
    while(lt <= rt){
      int mid = (lt + rt) /2;
      
      if(arr[mid] == target){
        System.out.println(mid+1);
        return;
      }
      
      if(arr[mid] < target) lt = mid+1;
      else rt = mid-1;
    }
  }
}
