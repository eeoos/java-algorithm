package algorithm.inflearn.introduction.s3.repeat;

import java.util.*;
import java.io.*;
  
public class I0302 {
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
    
    I0302 T = new I0302();
    List<Integer> answer = T.solution(n, a, m, b);
    
    for(int i =0; i<answer.size(); i++){
      if(i>0) sb.append(" ");
      sb.append(answer.get(i));
    }
    
    System.out.println(sb);
  }
  
  public List<Integer> solution(int n, int[] a, int m, int[] b){
    List<Integer> answer = new ArrayList<>();
    Arrays.sort(a);
    Arrays.sort(b);
    int p1=0, p2=0;
    while(p1<n && p2<m){
      if(a[p1] < b[p2]) p1++;
	  else if(a[p1] > b[p2]) p2++;
      else {
        answer.add(a[p1]);
        p1++;
        p2++;
      }
    }
    
    return answer;
  }
}