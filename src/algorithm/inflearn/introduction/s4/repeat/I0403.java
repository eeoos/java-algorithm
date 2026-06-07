package algorithm.inflearn.introduction.s4.repeat;

import java.io.*;
import java.util.*;

public class I0403 {
	public static void main(String[] args) throws IOException {
		
		I0403 T = new I0403();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(T.solution(n, k, arr));
	}
	
	public String solution(int n, int k, int[] arr) {
		
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> m = new HashMap<>();
		
		for(int i = 0; i<k; i++) {
			m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
		}
		sb.append(m.size());
		
		for(int rt = 0; rt<n-k; rt++) {
			m.put(arr[rt+k], m.getOrDefault(arr[rt+k], 0) + 1);
			
			if(m.get(arr[rt]) > 1) m.put(arr[rt], m.get(arr[rt]) -1);
			else m.remove(arr[rt]);
			sb.append(" ").append(m.size());
		}
		
		return sb.toString();
	}
}
