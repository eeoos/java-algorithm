package algorithm.inflearn.s3;

import java.util.*;
import java.io.*;
  
public class I0304 {
  public static void main(String[] args) throws IOException {

    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    int cnt = 0;
    int[] arr = new int[N];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<N; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i =0; i<N; i++){
      int sum = 0;
      for(int j = i; j<N; j++){
        sum += arr[j];
        
        if(sum == M) {
        	cnt++;
        	break;
        }
        else if(sum > M) break;
      }
    }
    
    System.out.println(cnt);
  }
}