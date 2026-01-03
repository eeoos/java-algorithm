import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		sc.nextLine();
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i<T; i++) {
			int cnt = 0;
			String[] arr = sc.nextLine().split(" ");
			int N = Integer.parseInt(arr[0]);
			int M = Integer.parseInt(arr[1]);
			int K = Integer.parseInt(arr[2]);
			
			if((N-1)>= (2*M)) result.add(M);
			else { // 홀수 index에 순차 배치 (N개만큼)
				int tmp = N;
				int[] arrI = new int[N];
				for(int j = 0; j<M; j++) {
					
				}
				
				if(tmp >0) { // 홀수 index 순차배치로도 tmp가 남으면 짝구 index 순차 배치
					
				}else {
					
				}
				
			}
		}
	
	}
	
}
