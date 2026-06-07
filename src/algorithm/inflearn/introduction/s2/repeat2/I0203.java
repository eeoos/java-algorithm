package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;
import java.util.*;

public class I0203 {
	public static void main(String[] args) throws IOException {
		
		I0203 T = new I0203();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] b = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(T.solution(n, a, b));
		
	}
	
	public String solution(int n, int[] a, int[] b) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++) {
			if(i>0) sb.append("\n");
			int result = a[i] - b[i]; 
			if(result == 1 || result == -2) sb.append("A");
			else if(result == 2 || result == -1) sb.append("B");
			else sb.append("D");
		}
		
		return sb.toString();
	}
}
	
