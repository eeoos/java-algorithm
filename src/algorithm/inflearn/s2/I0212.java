package algorithm.inflearn.s2;
import java.util.*;
public class I0212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		
		int cnt = 0;
		int[][] ia = new int[n][T];
		for(int i = 0; i<ia.length; i++) {
			for(int j = 0; j<ia[i].length; j++) {
				ia[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		
		for(int i =0; i<ia[0].length-1; i++) {
			for(int j = i+1; j<ia[0].length; j++) {
				if(ia[0][i] > ia[0][j]) cnt++; 
			}
		}

		System.out.println(cnt);
	}

}
