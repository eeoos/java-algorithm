package algorithm.inflearn.s7;

import java.io.*;
import java.util.*;

public class I0704_4 {
	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		arr[0] = arr[1] =1;
		
		for(int i = 0; i<n; i++) {
			if(i > 0) sb.append(" ");
			if(i>1) {
				int v  = arr[i-1] + arr[i-2];
				arr[i] = v;
				sb.append(v);
			}else {
				sb.append(arr[i]);
			}
		}
		
		System.out.println(sb);
	}

}
