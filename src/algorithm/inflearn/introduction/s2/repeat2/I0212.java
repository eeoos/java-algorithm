package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;
import java.util.*;

public class I0212 {
	public static void main(String[] args) throws IOException {
		
		I0212 T = new I0212();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[m][n];
		for(int i = 0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(T.solution(n, m, arr));
	}
	
	public int solution(int n, int m, int[][] arr) {
		
		int[][] rank = new int[m][n];
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				int index=  arr[i][j] - 1;
				rank[i][index] = j;
			}
		}
		
		int answer = 0;
		for(int mentor = 0; mentor<n; mentor++) {
			for(int mentee = 0; mentee < n; mentee++) {
				if(mentor == mentee) continue;
				int cnt = 0;
				for(int test = 0; test< m; test++) {
					if(rank[test][mentor] < rank[test][mentee]) cnt++;
				}
				if(cnt == m) answer++;
			}
		}
		
		return answer;
	}
}
