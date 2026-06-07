package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;
import java.util.*;

public class I0201 {
	public static void main(String[] args) throws IOException {
		
		I0201 T = new I0201();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(T.solution(n, arr));
	}
	
	public String solution(int n, int[] arr) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(arr[0]);
		
		for(int i = 1; i<n; i++) {
			if(arr[i] > arr[i-1]) {
				sb.append(" ").append(arr[i]);
			}
			
		}
		return sb.toString();
	}
}
