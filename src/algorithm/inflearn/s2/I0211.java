package algorithm.inflearn.s2;
import java.util.*;

public class I0211 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		int[][] arr = new int[T][5];
		int[] count = new int[T];
		
		for(int i = 0; i<T; i++) {
			for(int j = 0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		
		
		for(int i = 0; i<5; i++) {
			Set<Integer> tmp = new HashSet<>();
			for(int j = 0; j<T; j++) {
				int a = arr[j][i];
				for(int k = j+1; k<T; k++) {
					int b = arr[k][i];
					if(a == b) {
						tmp.add(j);
						tmp.add(k);
					}
				}
				for(Integer t : tmp) {
					count[t]++;
				}
			}
		}
		
		int max = -1;
		int result = -1;
		for(int i = count.length-1; i>=0; i--) {
			if(max <= count[i]) {
				max = count[i];
				result = i;
			}
			
		}
		
		System.out.println(result+1);
		
	}

}
