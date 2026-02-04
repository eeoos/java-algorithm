package algorithm.inflearn.s4;

import java.util.*;
import java.io.*;
  
public class I0405 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	StringTokenizer st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];
   	int cnt = 0;
	List<Integer> iarr = new ArrayList<>();
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<N; i++){
 	  arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 0; i<N-2; i++){
      for(int j = i+1; j<N-1; j++){
        for(int k = j+1; k<N; k++){
          int t = arr[i] + arr[j] + arr[k];
          iarr.add(t);
        }
      }
    }
    
    Collections.sort(iarr, Collections.reverseOrder());
    int tmp = 0;
    for(int i = 0; i<iarr.size(); i++){
      if(iarr.get(i) != tmp){
        tmp = iarr.get(i);
        cnt++;
        if(cnt == K){
          System.out.println(tmp);
          return;
        }
      }
    }
    System.out.println(-1);
  }
}