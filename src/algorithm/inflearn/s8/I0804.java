package algorithm.inflearn.s8;

import java.io.*;
import java.util.*;

public class I0804 {

	static int n, m;
	static int[] pm;
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		pm = new int[m];
		
		DFS(0);
	}
	
	static void DFS(int L) {
		if(L == m) {
			for(int i = 0; i<m; i++) {
				if(i>0) System.out.print(" " + pm[i]);
				else System.out.print(pm[i]);
			}
			System.out.println();
			return;
		}
		
		for(int i =1; i<=n; i++) {
			pm[L] = i;
			DFS(L+1);
		}
		
	}
}
