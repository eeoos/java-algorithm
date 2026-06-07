package algorithm.inflearn.introduction.s3.repeat2;

import java.io.*;
import java.util.*;

public class I0306 {
	public static void main(String[] args) throws IOException {
		
		I0306 T = new I0306();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=  new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(T.solution(n, k, arr));
	}
	
	public int solution(int n, int k, int[] arr) {
		int cnt = 0, lt = 0, len = Integer.MIN_VALUE;
		
		for(int rt = 0; rt<n; rt++) {
			if(arr[rt] == 0) cnt++;
			while(cnt > k) {
				if(arr[lt++] == 0) cnt--;
			}
			len = Math.max(len, rt-lt+1);
		}
		
		return len;
	}
}
