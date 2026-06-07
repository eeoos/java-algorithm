package algorithm.inflearn.introduction.s4.repeat;

import java.io.*;
import java.util.*;

public class I0405 {
	 public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		I0405 T = new I0405();
		System.out.println(T.solution(n, k, arr));
	}
	 
	 public int solution(int n, int k, int[] arr) {
		 
		 int answer = -1;
		 Set<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		 
		 for(int i = 0; i<n-2; i++) {
			 for(int j = i+1; j<n-1; j++) {
				 for(int p = j+1; p<n; p++) {
					 int e = arr[i] + arr[j] + arr[p]; 
					 ts.add(e);
				 }
			 }
		 }
		 
		 int tmp = 0;
		 for(int x : ts) {
			 tmp++;
			 if(tmp == k) answer = x;
		 }
		 
		 return answer;
	 }
}
