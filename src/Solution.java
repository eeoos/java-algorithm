import java.util.*;
class Solution {
	public char[] solution(int n, int[][] ladder){
		char[] answer = new char[n];
		
		for(int i = 1; i<=n; i++) {
			int cur = i;
			for(int[] lad : ladder) {
				for(int x : lad) {
					if(x == cur || x+1 == cur) {
						cur = (cur == x) ? x+1 : x;
						break;
					}
				}
			}
			answer[cur-1] = (char)(i+65-1);
		}
		
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
		System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
		System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
		System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
	}
}