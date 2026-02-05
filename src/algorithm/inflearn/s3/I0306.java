package algorithm.inflearn.s3;

import java.util.*;
import java.io.*;
  
public class I0306 {
  public static void main(String[] args) throws IOException {
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    
    int[] arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    int lt = 0, cnt= 0, length = Integer.MIN_VALUE;
    for(int rt= 0; rt<n; rt++){
      if(arr[rt] == 0) cnt++;
      while(cnt > k){
        if(arr[lt] == 0) cnt--;
        lt++;
      }
      if(rt-lt+1 > length) length = rt-lt+1;
    }
    System.out.println(length);
  }
}