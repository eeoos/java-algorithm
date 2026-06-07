package algorithm.inflearn.introduction.s5.repeat;

import java.io.*;
import java.util.*;

public class I0503 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j= 0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] moves = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i= 0; i<m; i++) moves[i] = Integer.parseInt(st.nextToken());
		
		I0503 T = new I0503();
		System.out.println(T.solution(n, arr, m, moves));
	}
	
	public int solution(int n, int[][] arr, int m, int[] moves) {

		int cnt=  0;
		Deque<Integer> dq = new ArrayDeque<>();
		
		for(int mv : moves) {
			int index = mv - 1;
			for(int i =0; i<n; i++) {
				if(arr[i][index] != 0) {
					if(dq.isEmpty()) dq.push(arr[i][index]);
					else {
						if(dq.peek() == arr[i][index]) {
							cnt+= 2;
							dq.pop();
						}
						else dq.push(arr[i][index]);
					}
					arr[i][index] = 0;
					break;
				}
				
			}
		}
		
		return cnt;
	}
}
