package algorithm.inflearn.s7;

import java.io.*;
import java.util.*;

public class I0711 {
	
	static int[][] graph;
	static int n,m, result = 0;
	static int[] ch;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    n = Integer.parseInt(st.nextToken());
	    m = Integer.parseInt(st.nextToken());
	    
	    graph = new int[n+1][n+1];
	    ch = new int[n+1];
	    
	    for(int i = 0; i<m; i++){
	      st = new StringTokenizer(br.readLine());
	      int r = Integer.parseInt(st.nextToken());
	      int c = Integer.parseInt(st.nextToken());
	      graph[r][c] = 1;
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
		
		for(int i =1; i<=n; i++) {
			if(graph[v][i] == 1 && ch[i] == 0) {
				ch[i] = 1;
				DFS(i);
				ch[i] = 0;
			}
		}
		
	}
	
	
}
