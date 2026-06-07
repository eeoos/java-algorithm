package algorithm.inflearn.introduction.s3.repeat;

import java.util.*;
import java.io.*;
  
public class I0301 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] a = new int[n];
    for(int i =0; i<n; i++){
      a[i] = Integer.parseInt(st.nextToken());
    }
    
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int[] b = new int[m];
    for(int i =0; i<m; i++){
      b[i] = Integer.parseInt(st.nextToken());
    }  
    
    I0301 T = new I0301();
    List<Integer> answer = T.solution(n, a, m, b);
    for(int i = 0; i<answer.size(); i++){
      if(i>0) sb.append(" ");
      sb.append(answer.get(i));
    }
    
    System.out.println(sb);
  }
  
  public List<Integer> solution(int n, int[] a, int m, int[] b){
    List<Integer> answer = new ArrayList<>();
    
    int p1 = 0, p2 = 0;
    while(p1<n && p2<m){
      if(a[p1]<b[p2]) answer.add(a[p1++]);
      else answer.add(b[p2++]);
    }
    while(p1<n) answer.add(a[p1++]);
    while(p2<m) answer.add(b[p2++]);
    
    return answer;
  }
}