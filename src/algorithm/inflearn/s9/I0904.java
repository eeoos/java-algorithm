package algorithm.inflearn.s9;

import java.util.*;
import java.io.*;
  
public class I0904 {
  
  static class Lecture {
    public int m, d;
    Lecture(int m, int d) {this.m = m; this.d=d;}
  }
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;
    
    List<Lecture> list = new ArrayList<>();
    
    for(int i =0; i<n; i++){
      st= new StringTokenizer(br.readLine());
      int m = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());
        
      list.add(new Lecture(m, d));
    }
    
    list.sort((l1, l2) -> {
      if(l1.d == l2.d) return l2.m - l1.m;
      return l2.d - l1.d;
    });
    
    Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int sum = 0;
    int day = list.get(0).d;
    
    for(int i = day; i>0; i--) {
    	for(Lecture l : list){
    	  if(l.d < i) break;
    	  pq.offer(l.m);     
        }
    	if(!pq.isEmpty()) {
    		sum += 	pq.poll();
    	}
    }
    
    
    System.out.println(sum);
  }
}