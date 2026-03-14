package algorithm.inflearn.related_problems.s1;

import java.util.*;

public class I0101{
	public static void main(String[] args){
		I0101 T = new I0101();
		System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
		System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
		System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
		System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
	}
	
	public char[] solution(int n, int[][] ladder){
		char[] answer = new char[n];
		
		for(int i = 0; i<n; i++) {
			int cur = i+1;
			for(int[] lad : ladder) {
				for(int x : lad) {
					if(cur == x || cur == x+1) {
						cur = cur == x ? x+1 : x; 
					}
				}
			}
			answer[cur-1] = (char)(i+65);
		}
		return answer;
	}

}
