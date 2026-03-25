package algorithm.inflearn.introduction.s3.repeat;

import java.io.*;

public class I0305 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    I0305 T = new I0305();
    System.out.println(T.solution(n));
  }
  
  public int solution(int n){
    int cnt = 0, lt = 1, sum =0;
    for(int rt = 1; rt<=n/2 + 1; rt++){
      sum += rt;
      if(sum == n) cnt++;
      while(sum >= n){
        sum -= lt++;
        if(sum == n) cnt++;
      }
    } 
    return cnt;
  }
}
