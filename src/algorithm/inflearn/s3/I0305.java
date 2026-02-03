package algorithm.inflearn.s3;

import java.util.*;
public class I0305 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int cnt = 0;
		
		for(int i = 1; i<T; i++) {
			int sum = i;
			for(int j = i+1; j<T; j++) {
				sum += j;
				if(sum == T) cnt++;
				else if(sum > T) break;
			}
		}
		
		System.out.println(cnt);

	}

}
