package algorithm.inflearn.s2;
import java.util.*;

public class I0211 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		int[][] iArr = new int[T][T];
		int[] rArr = new int[T];
		
		for(int i = 0; i<T; i++) {
			for(int j = 0; j<T; j++) {
				iArr[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		

	}

}
