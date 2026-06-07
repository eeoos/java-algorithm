package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;

public class I0205 {
	public static void main(String[] args) throws IOException {
		I0205 T = new I0205();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(T.solution(n));
	}
	
	public int solution(int n) {
		int[] arr = new int[n+1];
		int cnt = 0;
		for(int i = 2; i<=n; i++) {
			if(arr[i] == 0) {
				cnt++;
				for(int j = i; j<=n; j+=i) {
					arr[j]++;
				}
				
			}
		}
		
		return cnt;
	}
}
