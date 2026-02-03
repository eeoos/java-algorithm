package algorithm.inflearn.s3;

import java.util.*;
public class I0304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int T = sc.nextInt();
		int cnt = 0;
		int[] arr = new int[L];
		
		for(int i = 0; i<L; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<L; i++) {
			int sum = 0;
			for(int j = 0; j<L-i; j++) {
				sum += arr[i+j];
				
				if(sum == T) cnt++;
				else if(sum > T) break;
			}
			
		}
		
		System.out.println(cnt);

	}
}
