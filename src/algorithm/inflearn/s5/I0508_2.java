package algorithm.inflearn.s5;

import java.util.*;
import java.io.*;
  
public class I0508_2 {
  
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
    
    int result = 0;
    Deque<Doc> dq = new ArrayDeque<>();
    for(int i = 0; i<n; i++){
      int p = Integer.parseInt(st.nextToken());
      dq.offer(new Doc(i,p));
    }
    
    while(!dq.isEmpty()) {
    	Doc front = dq.poll();
    	for(Doc x : dq) {
    		if(front.p < x.p) {
    			dq.offer(front);
    			front = null;
    			break;
    		}
    	}
    	
    	if(front != null) {
    		result++;
    		if(front.idx == m) {
    			System.out.println(result);
    			return;
    		}
    	}
    }
    
  }
}