package algorithm.inflearn.related_problems.s1;

import java.util.*;

public class I0102 {
	static class Point {
		int x, y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	
	public int[] solution(int[][] board, int k){
		int[] answer = new int[2]; 
		int d = 0;
		Point cur = new Point(0, 0);
		while(k-- > 0) {
				int nx = cur.x + dx[d];
				int ny = cur.y + dy[d];
				
				if((0<= nx && nx < board.length) && (0<= ny && ny < board.length) && (board[nx][ny] == 0)) {
					cur.x = nx;
					cur.y = ny;	
				}else d = (d+1)%4;
				
		}
		answer[0] = cur.x;
		answer[1] = cur.y;
		return answer;
	}

	public static void main(String[] args){
		I0102 T = new I0102();
		int[][] arr1 = {{0, 0, 0, 0, 0}, 
			{0, 1, 1, 0, 0}, 
			{0, 0, 0, 0, 0}, 
			{1, 0, 1, 0, 1}, 
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr1, 10)));
		int[][] arr2 = {{0, 0, 0, 1, 0, 1}, 
			{0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 1}, 
			{1, 1, 0, 0, 1, 0}, 
			{0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr2, 20)));
		int[][] arr3 = {{0, 0, 1, 0, 0}, 
			{0, 1, 0, 0, 0}, 
			{0, 0, 0, 0, 0}, 
			{1, 0, 0, 0, 1}, 
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr3, 25)));
		
	}
}
