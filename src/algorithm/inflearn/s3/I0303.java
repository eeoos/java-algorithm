package algorithm.inflearn.s3;

import java.util.*;
public class I0303 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int cnt = sc.nextInt();
		
		int[] arr = new int[T];
		for(int i =0; i<T; i++) {
			arr[i] = sc.nextInt();
		}
	
		int max = -1;
		for(int i = 0; i<T-cnt; i++) {
			int sum = 0;
			for(int j = 0; j<cnt; j++) {
				sum +=arr[i+j];
			}
			if(sum > max) max = sum;
		}
		
		System.out.println(max);
	}
}
