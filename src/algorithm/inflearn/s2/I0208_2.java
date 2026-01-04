package algorithm.inflearn.s2;

import java.util.*;

public class I0208_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		for(int i = 0; i<T; i++) {
			arr[i] = sc.nextInt();
		}
		
		int rank = 1;
		for(int i = 0; i<T; i++) {
			int a = arr[i];
			for(int j = 0; j<T; j++) {
				int b = arr[j];
				if(a<b) rank++;
			}
			
			System.out.print(rank + " ");
			rank = 1;
		}
	}
}
