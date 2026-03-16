package algorithm.inflearn.introduction.s2.repeat;

import java.util.*;
import java.io.*;
  
public class I0202 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int max = Integer.MIN_VALUE;
    int cnt = 0;
    for(int i = 0; i<n; i++){
      int cur = Integer.parseInt(st.nextToken());
      if(cur > max){
        cnt++;
        max = cur;
      }
    }
    System.out.println(cnt);
  }
}
