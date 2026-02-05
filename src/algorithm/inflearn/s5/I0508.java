package algorithm.inflearn.s5;

import java.util.*;
import java.io.*;
  
public class I0508 {
  
  static class Doc {
    int idx, p;
    Doc(int idx, int p){this.idx = idx; this.p = p;}
  }
  
  public static void main(String[] args) throws IOException {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    
    int[] cnt = new int[51];
    Deque<Doc> dq = new ArrayDeque<>();
    for(int i = 0; i<n; i++){
      int p = Integer.parseInt(st.nextToken()) - 50;
      dq.offer(new Doc(i,p));
      cnt[p]++;
    }
    
    int curMax = 50;
    while(curMax > 0 && cnt[curMax] == 0) curMax--;
    
    int result = 0;
    while(!dq.isEmpty()){
      Doc front = dq.poll();
      
      if(front.p == curMax){
        result++;
        cnt[front.p]--;
        if(front.idx == m){
          System.out.println(result);
          return;
        }
        while(curMax > 0 && cnt[curMax] == 0) curMax--;
      }else {
        dq.offer(front);
      }
    }
  }
}