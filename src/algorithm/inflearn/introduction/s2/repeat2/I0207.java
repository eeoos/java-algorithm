package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;
import java.util.*;
public class I0207 {
	public static void main(String[] args) throws IOException {
		
		I0207 T = new I0207();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n =Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(T.solution(n, arr));
		
	}
	
	public int solution(int n, int[] arr) {
		
		int score = 0;
		int cnt = 0;
		
		for(int a : arr) {
			if(a == 1) {
				score += ++cnt;
			}else cnt = 0;
		}
		
		return score;
	}
}
