package algorithm.inflearn.introduction.s3.repeat2;

import java.io.*;
import java.util.*;

public class I0303 {
	public static void main(String[] args) throws IOException {
		
		I0303 T = new I0303();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st=  new StringTokenizer(br.readLine());
		for(int i =0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(T.solution(n, k, arr));
	}
	
	public int solution(int n, int k, int[] arr) {
		
		
		int cur = 0;
		for(int i = 0; i<k; i++) {
			cur += arr[i];
		}
		
		int answer = cur;
		
		for(int i = 0; i< n-k; i++) {
			cur -= arr[i];
			cur += arr[i + k];
			answer = Math.max(answer, cur);
		}
		
		return answer;
	}
}
