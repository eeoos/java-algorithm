package algorithm.inflearn.s7;

import java.io.*;
import java.util.*;

public class I0712 {
	
	static List<List<Integer>> graph;
	static int n, result = 0;
	static int[] ch;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    graph = new ArrayList<>();
	    for(int i = 0; i<=n; i++) graph.add(new ArrayList<>());
	    
	    ch = new int[n+1];
	    
	    for(int i = 0; i<m; i++){
	      st = new StringTokenizer(br.readLine());
	      int r = Integer.parseInt(st.nextToken());
	      int c = Integer.parseInt(st.nextToken());
	      graph.get(r).add(c);
	   }
	    
	   ch[1] = 1;
	   DFS(1);
	   System.out.println(result);
	  }
	
	static void DFS(int v) {
		if(v==n) {
			result++;
			return;
		}
		
		for(int nv : graph.get(v)){
			if(ch[nv] == 0) {
				ch[nv]= 1;
				DFS(nv);
				ch[nv] = 0;
			}
		}
		
	}
	
	
}
