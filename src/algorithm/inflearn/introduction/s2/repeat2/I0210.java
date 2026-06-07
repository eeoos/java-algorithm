package algorithm.inflearn.introduction.s2.repeat2;


import java.io.*;
import java.util.*;

public class I0210 {
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1}; 
		
 	public static void main(String[] args) throws IOException {
		
		I0210 T = new I0210();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n+2][n+2];
		for(int i = 1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j= 1; j<=n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(T.solution(n, arr));
		
	}
 	
 	public int solution(int n, int[][] arr) {
 		
 		int cnt = 0;
 		
 		for(int i = 1; i<=n; i++) {
 			for(int j = 1; j<=n; j++) {
 				int tmp = arr[i][j]; 
 				boolean isTop = true;
 				for(int k = 0; k<dx.length; k++) {
 					if(tmp <= arr[i+dx[k]][j+dy[k]] ) {
 						isTop = false;
 						break;
 					}
 				}
 				
 				if(isTop) cnt++;
 			}
 		}
 		
 		return cnt;
 	}
}
