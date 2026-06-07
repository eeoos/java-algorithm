package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;

public class I0204 {
	public static void main(String[] args) throws IOException {
		I0204 T = new I0204();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(T.solution(n));
		
	}
	
	public String solution(int n) {
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[n];
		arr[0] = arr[1] = 1;
		
		for(int i = 2; i<n; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		for(int i = 0; i<n; i++) {
			if(i>0) sb.append(" ");
			sb.append(arr[i]);
		}
		
		return sb.toString();
	}
}
