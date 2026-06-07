package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;
import java.util.*;

public class I0208 {
	public static void main(String[] args) throws IOException {
		
		I0208 T = new I0208();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(T.solution(n, arr));
	}
	
	public String solution(int n, int[] arr) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++) {
			int a = arr[i];
			int cnt = 1;
			for(int j = 0; j<n; j++) {
				int b = arr[j];
				if(a < b) cnt++;
			}
			if(i > 0) sb.append(" ");
			sb.append(cnt);
		}
		
		return sb.toString();
	}
}
