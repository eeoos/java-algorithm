package algorithm.inflearn.s2;
import java.util.*;

public class I0210 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		int T = sc.nextInt();
		int[][] ia = new int[T+2][T+2];
		for(int i = 0; i<ia.length; i++) {
			for(int j = 0; j<ia.length; j++) {
				if(i == 0 || j == 0 || j == ia.length-1 || i == ia.length-1) ia[i][j] = 0;
				else ia[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 1; i<ia.length-1; i++) {
			for(int j = 1; j<ia.length-1; j++) {
				int tmp =ia[i][j];
				if(tmp > ia[i-1][j] && tmp > ia[i][j-1] && tmp > ia[i+1][j] && tmp > ia[i][j+1]) cnt++;
			}
		}
		
		System.out.println(cnt);
		for(int i = 0; i<ia.length; i++) {
			for(int j = 0; j<ia.length; j++) {
				System.out.print(ia[i][j]);
			}
			System.out.println();
		}
	}

}
