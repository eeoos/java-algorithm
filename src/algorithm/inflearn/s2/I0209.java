package algorithm.inflearn.s2;
import java.util.Scanner;

public class I0209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[][] ia = new int[T][T];
		for(int i = 0; i<T; i++) {
			for(int j = 0; j<T; j++) {
				ia[i][j] = sc.nextInt();
			}
		}
		int ld = 0;
		int rd = 0;
		int h = 0;
		int v = 0;
		int max = 0;
		
		for(int i = 0; i<T; i++) {
			for(int j = 0; j<T; j++) {
				if(i==j) ld+= ia[i][j];
				if(i+j== T-1) rd+= ia[i][j];
				h += ia[i][j];
				v += ia[j][i];
			}
			max = Math.max(h, v);
			h = 0;
			v = 0;
		}
		System.out.println(Math.max(max, Math.max(ld, rd)));	
	}
}
