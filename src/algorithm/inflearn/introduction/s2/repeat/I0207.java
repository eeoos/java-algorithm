package algorithm.inflearn.introduction.s2.repeat;

import java.util.*;
import java.io.*;
  
public class I0207 {
  public static void main(String[] args) throws IOException {
   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    int score = 0;
    int cnt = 1;
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i<n; i++){
      int s = Integer.parseInt(st.nextToken());
      if(s == 1){
        score += cnt++;
      }else cnt = 1;
    }
    
    System.out.println(score);
  }
}