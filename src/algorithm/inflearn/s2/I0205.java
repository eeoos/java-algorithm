package algorithm.inflearn.s2;

import java.util.*;
public class I0205 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int cnt = 0;
		int[] arr = new int[T];
		
		for(int i = 1; i<T; i++) {
			if(arr[i] == 0) {
				cnt++;
				for(int j = i; j<T; j = j+(i+1)) {
					arr[j]++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
