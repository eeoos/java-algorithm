package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;
import java.util.*;

public class I0209 {
	public static void main(String[] args) throws IOException {
		
		I0209 T = new I0209();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(T.solution(n, arr));
	}
	
	public int solution(int n, int[][] arr) {
		int max = Integer.MIN_VALUE;
		
		int a = 0;
		int b = 0;
		
		for(int i =0; i<n; i++) {
			int c = 0;
			int d = 0;
			for(int j = 0; j<n; j++) {
				c+= arr[i][j];
				d+= arr[j][i];
				if(i == j) a+=arr[i][i];
				if(n-1 == i+j) b+= arr[i][j];
			}
			max = Math.max(Math.max(c, d), max);
		}
		max = Math.max(Math.max(a, b), max);
		return max;
	}
	
}
