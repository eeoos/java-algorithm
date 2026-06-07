package algorithm.inflearn.introduction.s2.repeat2;

import java.io.*;
import java.util.*;

public class I0211 {
	public static void main(String[] args) throws IOException {
		
		I0211 T = new I0211();
		
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][5];
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(T.solution(n, arr));
	}
	
	public int solution(int n, int[][] arr) {
		
		int answer = 0; // 임시 반장 학생 
		int max = 0; // 같은 반 최대 카운트  
		
		for(int i =0; i<n; i++) { // 현재 학생 i
			int cnt = 0; // 같은 반 카운트 
			for(int j = 0; j<n; j++) { // 비교 학생 j
				
				if(i == j) continue; // 자신과의 비교는 넘기기 
				
				for(int k = 0; k<5; k++) { // 5학년까지 비교 
					if(arr[i][k] == arr[j][k]) { // 같으면 
						cnt++;
						break; // "한번이라도" - 조건이 있으므로 break
					}
				}
			}
			if(cnt > max) { // 여러 명인 경우 가장 작은 번호 출력을 위해 > 사용 
				max = cnt;
				answer = i;
			}
		}
		
		return answer + 1;
	}
}
