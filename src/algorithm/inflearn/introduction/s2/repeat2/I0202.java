package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;
import java.util.*;

public class I0202 {
	public static void main(String[] args) throws IOException {
		I0202 T = new I0202();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(T.solution(n, arr));
	}
	
	public int solution(int n, int[] arr) {
		int cnt = 1;
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) {
				cnt++;
				max = arr[i];
			}
		}
		
		return cnt;
	}
}
