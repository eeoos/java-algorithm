package algorithm.inflearn.s7;

import java.io.*;
public class I0704_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		
		fibo(n, arr);
		
		for(int i = 1; i<=n; i++) {
			if(i>1) sb.append(" ");
			sb.append(arr[i]);
		}
		
		System.out.println(sb);
	}
	
	static int fibo(int n, int[] arr) {
		if(arr[n] > 0) return arr[n]; 
		if(n <=2) return arr[n] = 1;
		return arr[n] = fibo(n-2, arr) + fibo(n-1, arr);
	}
}
