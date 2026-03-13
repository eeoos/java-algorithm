package algorithm.inflearn.introduction.s9;

import java.util.*;
import java.io.*;
  
public class I0904 {
  static class Lecture{
    public int m,d;
    Lecture(int m, int d){this.m=m; this.d=d;}
  }
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    StringTokenizer st;
    List<Lecture> list = new ArrayList<>();
    int max = Integer.MIN_VALUE;
    for(int i = 0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      int m = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());
      max = Math.max(max, d);
      list.add(new Lecture(m, d));
    }
    
    list.sort((l1, l2) -> {
    	if(l1.d == l2.d) return l2.m-l1.m;
    	return l2.d - l1.d;
    });
    
    Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int sum = 0;
    int j = 0;
    for(int i = max; i>0; i--){
      for(; j<n; j++) {
    	if(list.get(j).d < i) break;
    	pq.offer(list.get(j).m);
      }
      
      if(!pq.isEmpty()){
        sum += pq.poll();
      }
    }
    System.out.println(sum);
      
    
  }
}