package algorithm.inflearn.s5;

import java.util.*;
import java.io.*;
  
public class I0506 {
  public static void main(String[] args) throws IOException { 
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    
    Deque<Integer> dq = new ArrayDeque<>();
    for(int i =1; i<=n; i++){
      dq.offer(i);
    }
	
    int tmp = k;
    while(dq.size()>1){
      int front = dq.poll();
	  if(tmp != 1){
        dq.offer(front);
        tmp--;
      }else tmp = k;
      
    }
    
    System.out.println(dq.pop());
  }
}