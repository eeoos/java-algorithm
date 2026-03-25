package algorithm.inflearn.introduction.s3.repeat;

import java.util.*;
import java.io.*;
  
public class I0303 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    I0303 T = new I0303();
    System.out.println(T.solution(n, m, arr));
  }
  
  public int solution(int n, int m, int[] arr){

	int answer = Integer.MIN_VALUE;
    int max = 0;
    for(int i = 0; i<m; i++){
      max += arr[i];
    }
	answer = max;
    for(int i = 0; i< n-m; i++){
      max -= arr[i];
      max += arr[i+m];
      answer = Math.max(max, answer);
    }
    
    return answer;
  }
}