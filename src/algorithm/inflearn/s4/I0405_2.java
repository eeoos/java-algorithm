package algorithm.inflearn.s4;

import java.util.*;
import java.io.*;
  
public class I0405_2 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	StringTokenizer st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];

	Set<Integer> ts = new TreeSet<>(Collections.reverseOrder());
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i<N; i++){
 	  arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 0; i<N-2; i++){
      for(int j = i+1; j<N-1; j++){
        for(int k = j+1; k<N; k++){
          int t = arr[i] + arr[j] + arr[k];
          ts.add(t);
        }
      }
    }
    if(ts.size() < K) {
      System.out.println(-1);
      return;
    }
    int tmp = 0;
	for(int t : ts){
      tmp++;
      if(tmp == K) System.out.println(t);
    }
  }
}